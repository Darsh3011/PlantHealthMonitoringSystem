#include <ESP8266WiFi.h>
#include <WiFiClient.h> 
#include <ESP8266WebServer.h>
#include <ESP8266HTTPClient.h>
#include <Wire.h>

int data[]={0,0,0};
int Led_OnBoard = 2;                  
boolean btn=1;

const char* ssid = "Realme 2 pro";    
const char* password = "qwerty1234";  
const char *host = "192.168.43.155"; 
char server[] = "mail.smtp2go.com"; 
String table,database;

WiFiClient espClient;

void setup() {

  delay(1000);
  pinMode(Led_OnBoard, OUTPUT);
  pinMode(0,INPUT);
  Serial.begin(115200);
  Wire.begin(D1, D2);

  WiFi.mode(WIFI_OFF);        
  delay(1000);
  WiFi.mode(WIFI_STA);        
  
  WiFi.begin(ssid, password); 
  Serial.println("");

  Serial.print("Connecting");
  
  while (WiFi.status() != WL_CONNECTED) {
    digitalWrite(Led_OnBoard, LOW);
    delay(250);
    Serial.print(".");
    digitalWrite(Led_OnBoard, HIGH);
    delay(250);
  }

  digitalWrite(Led_OnBoard, HIGH);
  
  Serial.println("");
  Serial.println("Connected to Network/SSID");
  Serial.print("IP address: ");
  Serial.println(WiFi.localIP()); 

  Serial.print("Enter Username: ");
  while(Serial.available()<=0){}
  database=Serial.readStringUntil('\n');
  database.toLowerCase();
  database.replace(" ","");  
  Serial.print(database+"\n");
  
  Serial.print("Enter Plant name: ");
  while(Serial.available()<=0){}
  table=Serial.readStringUntil('\n');
  Serial.print(table+"\n");
}

void loop() {
  btn=digitalRead(0);
  if(!btn)
  {  
    HTTPClient http;
    delay(1000);

    Wire.requestFrom(8, 3);
    for(int i=0;i<3;i++)
    {
      int c=Wire.read();
      data[i]=c;
    }
    Serial.print(" temp: ");
    Serial.print(data[0]);
    Serial.print(" moist: ");
    Serial.print(data[1]);
    Serial.print(" light: ");
    Serial.print(data[2]);
    Serial.println();

    String postData= "dbname="+database+"&pname="+table+"&s1="+data[0]+"&s2="+data[1]+"&s3="+data[2];
    Serial.println(postData);
  
    http.begin("http://192.168.43.155/InsertDB.php"); 
    http.addHeader("Content-Type", "application/x-www-form-urlencoded");   
 
    int httpCode = http.POST(postData);   
    String payload = http.getString();    

    Serial.println(httpCode); 
    Serial.println(payload);   
    byte ret = sendEmail(table,String(data[0]),String(data[1]),String(data[2]));
    http.end();  

    delay(4000); 
    digitalWrite(Led_OnBoard, LOW);
    delay(1000);
    digitalWrite(Led_OnBoard, HIGH);
  }
 
}

byte sendEmail(String table,String temp,String moist,String light)
{
  if (espClient.connect(server, 2525) == 1)
  {
    Serial.println(F("connected"));
  }
  else
  {
    Serial.println(F("connection failed"));
    return 0;
  }
  if (!emailResp())
  return 0;

  Serial.println(F("Sending EHLO"));
  espClient.println("EHLO www.example.com");
  if (!emailResp())
  return 0;

  Serial.println(F("Sending auth login"));
  espClient.println("AUTH LOGIN");
  if (!emailResp())
  return 0;

  Serial.println(F("Sending User"));
  espClient.println("bWVldGJoYWxvZGl5YTYzNkBnbWFpbC5jb20="); 
  if (!emailResp())
  return 0;

  Serial.println(F("Sending Password"));
  espClient.println("R0pUNFVlMzZJVkhY");
  if (!emailResp())
  return 0;

  Serial.println(F("Sending From"));
  espClient.println(F("MAIL From: meetbhalodiya636@gmail.com"));
  if (!emailResp())
  return 0;

  Serial.println(F("Sending To"));
  espClient.println(F("RCPT To: mrengineer035@gmail.com"));
  if (!emailResp())
  return 0;

  Serial.println(F("Sending DATA"));
  espClient.println(F("DATA"));
  if (!emailResp())
  return 0;
  Serial.println(F("Sending email"));

  espClient.println(F("To: mrengineer035@gmail.com"));

  espClient.println(F("From: meetbhalodiya636@gmail.com"));
  espClient.println(F("Subject: Plant Health Monitoring System\r\n"));
  espClient.println("Health update of your "+table+" plant.\n");
  espClient.println("Today the temperature of your "+table+" plant is "+temp+"°C.\n");
  espClient.println("Today the moisture in your "+table+" plant is "+moist+"%.\n");
  espClient.println("Today the light that "+table+" plant has taken is of "+light+" lux.\n");
  espClient.println(F("Have a green day!"));

  espClient.println(F("."));
  if (!emailResp())
  return 0;

  Serial.println(F("Sending QUIT"));
  espClient.println(F("QUIT"));
  if (!emailResp())
  return 0;

  espClient.stop();
  Serial.println(F("disconnected"));
  return 1;
}

byte emailResp()
{
  byte responseCode;
  byte readByte;
  int loopCount = 0;

  while (!espClient.available())
  {
    delay(1);
    loopCount++;
    if (loopCount > 20000)
    {
      espClient.stop();
      Serial.println(F("\r\nTimeout"));
      return 0;
    }
  }
  responseCode = espClient.peek();
  while (espClient.available())
  {
    readByte = espClient.read();
    Serial.write(readByte);
  }

  if (responseCode >= '4')
  {
    return 0;
  }
  return 1;
}

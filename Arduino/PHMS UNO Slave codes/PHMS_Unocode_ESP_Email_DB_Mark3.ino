#include<Wire.h>
#include <dht.h>

dht DHT;
int data[]={0,0,0};
float Vout, Vr, Lux, LDRvalue;
int Moistvalue,val;  
float Tempvalue;

void setup() {
  Wire.begin(8);
  Serial.begin(9600);
  Wire.onRequest(requestEvent);
  delay(1000);
}

void loop() {
  
  delay(100);

  /******** TEMPERATURE **********/
  
    DHT.read11(A0);
    Tempvalue=DHT.temperature;
  
  /********* MOISTURE ************/

    Moistvalue = analogRead(A1); 
    val=map(Moistvalue,0,982,148,0);
    if(val>100)
      val=100;
    else if(val<0)
      val=0;
  
  /*********** LIGHT *************/

    LDRvalue = analogRead(A2);
    Vout = (LDRvalue * 5) / 1023;
    Vr = 5 - Vout;  
    Lux = 500 / (10 * (Vr/Vout));   


  
  data[0]=Tempvalue;
  data[1]=val;
  data[2]=Lux;

  Serial.print(" temp: ");
  Serial.print(data[0]);
  Serial.print("°C ");
  Serial.print(" moist: ");
  Serial.print(data[1]);
  Serial.print("% ");
  Serial.print(" light: ");
  Serial.print(data[2]);
  Serial.print(" lux ");
  Serial.println();
  delay(3000);
}

void requestEvent(){

  for(int i=0;i<3;i++)
  {
    uint8_t Buffer[3];
    Buffer[0]=data[0];
    Buffer[1]=data[1];
    Buffer[2]=data[2];
    Wire.write(Buffer,3);
  }
}

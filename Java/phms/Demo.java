package phms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo 
{
    public Connection con;
    public Statement st;
    
    public static void main(String []ar) throws MalformedURLException
    {
        try
        {   
       /*  Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/temphumidlight?useTimezone=true&serverTimezone=IST","root","");                      
         Statement st=con.createStatement();           
         
        */    
            //Scanner sc=new Scanner(System.in);
            //System.out.println("Enter Database name ");
            String tablename="hibiscus";
            String db="montygreen";
            
            String urlLink="http://localhost/deletetable.php?dbname="+db+"&tblname="+tablename;
            URL url=new URL(urlLink);
            HttpURLConnection conn=(HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            
            BufferedReader in=new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuffer sb=new StringBuffer();
            String line;
            
            while((line=in.readLine())!=null)
            {
                sb.append(line);
            }
            in.close();
            System.out.println(sb.toString());
       }
        catch(Exception e2){System.out.println("Exception aayi h connect class me "+e2.getMessage());}        
        
       // String st="Monty Green";
       // System.out.println(st.toLowerCase().replaceAll(" ",""));
    }
}
package phms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connect 
{
    public Connection con;
    public Statement st;
    public static String db=null;
    
    public Statement connection(String database)
    {
        try
        {   
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+database+"?useTimezone=true&serverTimezone=IST","root","");                      
         st=con.createStatement();           
         return st;
        }
        catch(ClassNotFoundException | SQLException e2){System.out.println("Exception aayi h connect class me "+e2.getMessage());}        
        return st;
    }    
    
    public static void main(String []ar)
    {
        Connect con=new Connect();
        con.connection(db);
    }
/*            finally
            {   try
                {   c.con.close();    st.close();}
                catch(SQLException e2){}
            }
*/    
}

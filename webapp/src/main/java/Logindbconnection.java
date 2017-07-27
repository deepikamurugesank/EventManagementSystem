import java.util.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class Logindbconnection
{
public static Connection getConnection(){  
        Connection con=null;  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eventmanagementsystem", "root", "");  
        }
        catch(Exception e)
        {System.out.println(e);}  
        return con;  
    } 
    public static int loginsave(Pojologin po)
 {  int status=0; 
      try{  
      Connection con=DBconnection.getConnection();  
      PreparedStatement pre=con.prepareStatement("insert into logintable values(?,?)") ; 
             
               pre.setString(1, po.getEmail());
              pre.setString(2, po.getPassword()); 
               status=pre.executeUpdate();
                   con.close();  
        }
        catch(Exception ex)
        {ex.printStackTrace(); }  
          
        return status;  
    }
    public static Pojologin check(String email,String password)
    {
    Pojologin s=new Pojologin();  
          
        try{  
            Connection con=DBconnection.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from logintable where email=? and password=?"); 
            ps.setString(1,email);
            ps.setString(2, password);
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
               
                s.setEmail(rs.getString(1));  
                s.setPassword(rs.getString(2));  
               
               
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return s;  
    }    
}

       
        
        



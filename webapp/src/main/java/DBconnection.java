import java.util.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class DBconnection
{
public static Connection getConnection(){  
        Connection con=null;  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eventmanagementsystem", "root", "");  
        }catch(Exception e){System.out.println(e);}  
        return con;  
    }  

 public static int save1(Pojoevent po)
 {  int status=0; 
      try{  
      Connection con=DBconnection.getConnection();  
      PreparedStatement pre=con.prepareStatement("insert into eventtable values(?,?,?,?,?,?,?,?)") ; 
             
               pre.setString(1, po.getId());
              pre.setString(2, po.getFname());
               pre.setString(3, po.getLname());
                pre.setString(4, po.getEmail());
                 pre.setString(5, po.getDate());
                  pre.setString(6, po.getTime());
                   pre.setString(7, po.getTopic());
                    pre.setString(8, po.getLocation());
                   status=pre.executeUpdate();
                   con.close();  
        }catch(Exception ex){ex.printStackTrace();
        }  
          
        return status;  
                   
 }
 public static List<Pojoevent> getAllEmployees(){  
        List<Pojoevent> list=new ArrayList<Pojoevent>();  
          
        try{  
            Connection con=DBconnection.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from eventtable");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Pojoevent e=new Pojoevent();  
                e.setId(rs.getString(1));  
                e.setFname(rs.getString(2));  
                e.setLname(rs.getString(3));  
                e.setEmail(rs.getString(4));  
                e.setDate(rs.getString(5));
                e.setTime(rs.getString(6)); 
                e.setTopic(rs.getString(7));
                e.setLocation(rs.getString(8)); 
                list.add(e);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  
    }  
    public static Pojoevent getEmployeeById(String id){  
        Pojoevent e=new Pojoevent();  
          
        try{  
            Connection con=DBconnection.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from eventtable where studentid=?");  
            ps.setString(1,id);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
               e.setId(rs.getString(1));  
                e.setFname(rs.getString(2));  
                e.setLname(rs.getString(3));  
                e.setEmail(rs.getString(4));  
                e.setDate(rs.getString(5));
                e.setTime(rs.getString(6)); 
                e.setTopic(rs.getString(7));
                e.setLocation(rs.getString(8)); 
            
            }  
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return e;  
    }  
    public static int update(Pojoevent e){  
        int status=0;  
        try{  
            Connection con=DBconnection.getConnection();  
            PreparedStatement ps=con.prepareStatement("update eventtable set firstname=?,lastname=?,email=?,date=?,time=?,topic=?,location=? where studentid=?") ; 
           
             
              ps.setString(1, e.getFname());
               ps.setString(2, e.getLname());
                ps.setString(3, e.getEmail());
                 ps.setString(4, e.getDate());
                  ps.setString(5, e.getTime());
                   ps.setString(6, e.getTopic());
                    ps.setString(7, e.getLocation());
                     ps.setString(8, e.getId());
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  

 public static int delete(String id){  
        int status=0;  
        try{  
            Connection con=DBconnection.getConnection();  
            PreparedStatement ps=con.prepareStatement("delete from eventtable where studentid=?");  
            ps.setString(1,id);  
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return status;  
    }  
  public static List<Pojoevent> paperpresentation(){  
        List<Pojoevent> list=new ArrayList<Pojoevent>();  
          
        try{  
            Connection con=DBconnection.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from eventtable where topic='paperpresentation'");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Pojoevent e=new Pojoevent();  
                e.setId(rs.getString(1));  
                e.setFname(rs.getString(2));  
                e.setLname(rs.getString(3));  
                e.setEmail(rs.getString(4));  
                e.setDate(rs.getString(5));
                e.setTime(rs.getString(6)); 
                e.setTopic(rs.getString(7));
                e.setLocation(rs.getString(8)); 
                list.add(e);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  
    }  
    public static List<Pojoevent> bugbluster(){  
        List<Pojoevent> list=new ArrayList<Pojoevent>();  
          
        try{  
            Connection con=DBconnection.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from eventtable where topic='bugblaster'");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Pojoevent e=new Pojoevent();  
                e.setId(rs.getString(1));  
                e.setFname(rs.getString(2));  
                e.setLname(rs.getString(3));  
                e.setEmail(rs.getString(4));  
                e.setDate(rs.getString(5));
                e.setTime(rs.getString(6)); 
                e.setTopic(rs.getString(7));
                e.setLocation(rs.getString(8)); 
                list.add(e);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  
    }  
   public static List<Pojoevent> treasure(){  
        List<Pojoevent> list=new ArrayList<Pojoevent>();  
          
        try{  
            Connection con=DBconnection.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from eventtable where topic='treasurhunt'");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Pojoevent e=new Pojoevent();  
                e.setId(rs.getString(1));  
                e.setFname(rs.getString(2));  
                e.setLname(rs.getString(3));  
                e.setEmail(rs.getString(4));  
                e.setDate(rs.getString(5));
                e.setTime(rs.getString(6)); 
                e.setTopic(rs.getString(7));
                e.setLocation(rs.getString(8)); 
                list.add(e);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  
    }
    public static List<Pojoevent> carving(){  
        List<Pojoevent> list=new ArrayList<Pojoevent>();  
          
        try{  
            Connection con=DBconnection.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from eventtable where topic='vegetable carving'");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Pojoevent e=new Pojoevent();  
                e.setId(rs.getString(1));  
                e.setFname(rs.getString(2));  
                e.setLname(rs.getString(3));  
                e.setEmail(rs.getString(4));  
                e.setDate(rs.getString(5));
                e.setTime(rs.getString(6)); 
                e.setTopic(rs.getString(7));
                e.setLocation(rs.getString(8)); 
                list.add(e);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  
    }  
    public static List<Pojoevent> band(){  
        List<Pojoevent> list=new ArrayList<Pojoevent>();  
          
        try{  
            Connection con=DBconnection.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from eventtable where topic='music band'");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Pojoevent e=new Pojoevent();  
                e.setId(rs.getString(1));  
                e.setFname(rs.getString(2));  
                e.setLname(rs.getString(3));  
                e.setEmail(rs.getString(4));  
                e.setDate(rs.getString(5));
                e.setTime(rs.getString(6)); 
                e.setTopic(rs.getString(7));
                e.setLocation(rs.getString(8)); 
                list.add(e);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  
    }    
}
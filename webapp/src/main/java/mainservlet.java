
import java.io.IOException; 
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.*;
import java.net.Authenticator;
import java.util.*; 

@WebServlet("/mainservlet")
public class mainservlet extends HttpServlet {
    private String message,message1,message3,jid,jfname,jlname,jemail,jdate,jtime,jtopic,jlocation,fname;
    mainservlet javaEmail = null;
String ffname="deep";

 public void init() throws ServletException { 

    
      //System.out.println("i am init");
   }
     public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException
       {
        
           response.setContentType("text/html");
            PrintWriter out = response.getWriter();
      String id=request.getParameter("studentid");
      String fname=request.getParameter("fname");
      String lname=request.getParameter("lname");
      String email=request.getParameter("email");
      String date=request.getParameter("date");
      String time=request.getParameter("time");
      String topic=request.getParameter("topic");
      String location=request.getParameter("location");
         Pojoevent po=new Pojoevent();
                   po.setId(id);
                   po.setFname(fname);
                   po.setLname(lname);
                   po.setEmail(email);
                   po.setDate(date);
                   po.setTime(time);
                   po.setTopic(topic);
          
                   po.setLocation(location);
         int status=DBconnection.save1(po); 
           
        if(status>0){  
            out.print("<p>Record saved successfully!</p>");  
            request.getRequestDispatcher("index.jsp").include(request, response);  
        }else{  
            out.println("Sorry! unable to save record");  
        }  
          
        out.close();  


        response.setContentType("text/html;charset=UTF-8");
              
        String toMail = request.getParameter("email");
     
    
        try {
           mainservlet javaEmail = new mainservlet();
           
         //javaEmail.sendEmail(toMail); 
         final String username = "deepika.m@kggroup.com";
final String password = "Deepika123$";
Properties props = new Properties();
props.put("mail.smtp.auth", "true");
props.put("mail.smtp.starttls.enable", "false");
props.put("mail.smtp.host", "webmail.kggroup.com");
props.put("mail.smtp.port", "25");
Session session = Session.getInstance(props,
new javax.mail.Authenticator() {
protected PasswordAuthentication getPasswordAuthentication() {
return new PasswordAuthentication(username, password);
}
});
try {
Message message = new MimeMessage(session);
message.setFrom(new InternetAddress("deepika.m@kggroup.com"));
message.setRecipients(Message.RecipientType.TO,
InternetAddress.parse(toMail));

message.setSubject("Event registration successful");
message.setText("Dear Mail Crawler,"
+ "\n\n No spam to my email, please!");
message.setText("<h1>firstname</h1>");
message.setContent("<h1 color='red'> Hi Mr/Mrs."+fname+".Thanks For Registration<h1><br>Event Details :<br><h3>Date:"+date+"<br>Time :"+time+"<br>Topic :"+topic+"<br>Location:"+location+"</h3>","text/html");
Transport.send(message);

System.out.println("Done");
}
catch (MessagingException e) 
{
throw new RuntimeException(e);
}


            out.println("Process Completed\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
        out.println("event registered successfully");
        
    }
/*public static  void sendEmail(String to)
{
  
final String username = "deepika.m@kggroup.com";
final String password = "Deepika123$";
Properties props = new Properties();
props.put("mail.smtp.auth", "true");
props.put("mail.smtp.starttls.enable", "false");
props.put("mail.smtp.host", "webmail.kggroup.com");
props.put("mail.smtp.port", "25");
Session session = Session.getInstance(props,
new javax.mail.Authenticator() {
protected PasswordAuthentication getPasswordAuthentication() {
return new PasswordAuthentication(username, password);
}
});
try {
Message message = new MimeMessage(session);
message.setFrom(new InternetAddress("deepika.m@kggroup.com"));
message.setRecipients(Message.RecipientType.TO,
InternetAddress.parse(to));

message.setSubject("A testing mail header !!!");
message.setText("Dear Mail Crawler,"
+ "\n\n No spam to my email, please!");
message.setText("<h1>firstname</h1>");
Transport.send(message);

System.out.println("Done");
}
catch (MessagingException e) 
{
throw new RuntimeException(e);
}
}*/
       }


      





   
       
     
    
      /*out.println("<center><h1>" + message + "</h1></center>");

     
          try{
             
Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eventmanagementsystem", "root", "");
         
              PreparedStatement pre=conn.prepareStatement("insert into eventtable values(?,?,?,?,?,?,?,?)") ; 
             
               pre.setString(1, po.getId());
              pre.setString(2, po.getFname());
               pre.setString(3, po.getLname());
                pre.setString(4, po.getEmail());
                 pre.setString(5, po.getDate());
                  pre.setString(6, po.getTime());
                   pre.setString(7, po.getTopic());
                    pre.setString(8, po.getLocation());
                   int i= pre.executeUpdate();
                   //calling pojo class
                   
    }  
                   
                   if(i!=0){
                         
       out.println("<center><img src='/images/download.jpg' alt='success'/></center>");
      }
      else{
        out.println("<img src='/images/images.jpg' alt='failure'/>" );
      }
       Statement stmt = conn.createStatement();
              String query="select * from eventtable";
              ResultSet rs=stmt.executeQuery(query);

     
     out.println(  "<table border=2><tr><th>"+jid+"</th><th>"+jfname+"</th><th>"+jlname+"</th><th>"+jemail+"</th><th>"+jdate+"</th><th>"+jtime+"</th><th>"+jtopic+"</th><th>"+jlocation+"</th></tr>");

   while (rs.next())
    { 
         out.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"</td><td>"+rs.getString(6)+"</td><td>"+rs.getString(7)+"</td><td>"+rs.getString(8)+"</td></tr>");

    }
          }

    catch (Exception e){
      out.println(e);
    }
    out.close();
      
      }*/



 /*else if (request.getParameter("update") != null) {
   out.println("<center><h1>" + message1+ "</h1></center>");

     
          try{
 
        Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eventmanagementsystem", "root", "");
            PreparedStatement pre=conn.prepareStatement("update eventtable set firstname=?,lastname=?,email=?,date=?,time=?,topic=?,location=? where studentid=?") ; 
             
               //pre.setString(1, id);
              pre.setString(1, fname);
               pre.setString(2, lname);
                pre.setString(3, email);
                 pre.setString(4, date);
                  pre.setString(5, time);
                   pre.setString(6, topic);
                    pre.setString(7, location);
                     pre.setString(8, id);
                   int i= pre.executeUpdate();
                   
                   if(i!=0){
                         
       out.println("<img src='/images/download.jpg' alt='success'/>");
      }
      else{
        out.println("<img src='/images/images.jpg' alt='failure'/>" );
      } 
       Statement stmt = conn.createStatement();
              String query="select * from eventtable";
              ResultSet rs=stmt.executeQuery(query);

     
     out.println(  "<table border=2><tr><th>"+jid+"</th><th>"+jfname+"</th><th>"+jlname+"</th><th>"+jemail+"</th><th>"+jdate+"</th><th>"+jtime+"</th><th>"+jtopic+"</th><th>"+jlocation+"</th></tr>");

   while (rs.next())
    { 
         out.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"</td><td>"+rs.getString(6)+"</td><td>"+rs.getString(7)+"</td><td>"+rs.getString(8)+"</td></tr>");

    }
          }

    catch (Exception e){
      out.println(e);
    }
    out.close();
      
      }

      
 else if (request.getParameter("Delete") != null) {

 out.println("<center><h1>" + message3 + "</h1></center>");

     
          try{
           Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eventmanagementsystem", "root", "");
         
              PreparedStatement pre=conn.prepareStatement("delete from eventtable where studentid=?") ; 
             pre.setString(1, id);
   int i= pre.executeUpdate();
                   
                   if(i!=0){
                         
       out.println("<img src='/images/download.jpg' alt='success'/>");
      }
      else{
        out.println("<img src='/images/images.jpg' alt='failure'/>" );
      } 
       Statement stmt = conn.createStatement();
              String query="select * from eventtable";
              ResultSet rs=stmt.executeQuery(query);

     
     out.println(  "<table border=2><tr><th>"+jid+"</th><th>"+jfname+"</th><th>"+jlname+"</th><th>"+jemail+"</th><th>"+jdate+"</th><th>"+jtime+"</th><th>"+jtopic+"</th><th>"+jlocation+"</th></tr>");

   while (rs.next())
    { 
         out.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"</td><td>"+rs.getString(6)+"</td><td>"+rs.getString(7)+"</td><td>"+rs.getString(8)+"</td></tr>");

    }
          }


 
 catch(Exception e)
 {
      out.println(e);
 }

}
/*else if (request.getParameter("Edit") != null) {
   out.println("<center><h1>" + message4+ "</h1></center>");

     
          try{
 
        Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eventmanagementsystem", "root", "");
            PreparedStatement pre=conn.prepareStatement("update eventtable set firstname=?,lastname=?,email=?,date=?,time=?,topic=?,location=? where studentid=?") ; 
             String query = "select * from eventtable where studentid=?";
              pre.setString(1, id);

Statement st = conn.createStatement();
ResultSet rs = st.executeQuery(query);
while(rs.next()){




      }

}

   */    
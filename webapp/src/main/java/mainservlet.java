
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
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.*;
import java.net.Authenticator;
import java.util.*; 

@WebServlet("/mainservlet")
@MultipartConfig(location="C://TEMP")
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
        String filename=request.getParameter("filename");
        request.getPart("content").write("C://TEMP/"+filename+".txt");
         if(request.getPart("content") !=null){
        	out.write("<h3>File uploaded successfully</h3>");}
     
    
        try {
           mainservlet javaEmail = new mainservlet();
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
     }

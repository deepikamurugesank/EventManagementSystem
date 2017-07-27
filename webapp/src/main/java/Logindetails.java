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

@WebServlet("/Logindetails")
public class Logindetails extends HttpServlet {
    String email,password;
     public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException
       {
        
           response.setContentType("text/html");
            PrintWriter out = response.getWriter();
       email=request.getParameter("email");
      password=request.getParameter("password");
      Pojologin lo=new Pojologin();
     lo.setEmail(email);
     lo.setPassword(password);
      int s=Logindbconnection.loginsave(lo);
         if(s>0){  
            out.print("<p>Login Successfully</p>");  
            request.getRequestDispatcher("Eventlist.jsp").include(request, response);  
        }else{  
            out.println("Sorry! ");  
        }  
          
        out.close();  
 }
}
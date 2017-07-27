
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
import javax.net.ssl.ExtendedSSLSession;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.*;
import java.net.Authenticator;
import java.util.*; 
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.http.HttpSession;  
@WebServlet("/Checklogin")
public class Checklogin extends HttpServlet
 {
  public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException
       {
         response.setContentType("text/html");
            PrintWriter out = response.getWriter();
      String email=request.getParameter("email");
      String password=request.getParameter("password");
      try{
        Pojologin s=Logindbconnection.check(email,password);  
        if(email.equals(s.getEmail()) && password.equals(s.getPassword())){
                    out.print("Welcome, "+s.getEmail());  
        HttpSession session=request.getSession();  
        session.setAttribute("name",s.getEmail()); 
          
                   request.getRequestDispatcher("Eventlist.jsp").include(request, response);  
        }
        else{
             out.print("Sorry!!! Ur Login Failed...!!!!! ");  
        } 
 }
      catch(Exception e)
      {
          e.printStackTrace();
      }
    }

 }
 








 
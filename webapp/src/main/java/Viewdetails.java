import java.io.IOException;  
import java.io.PrintWriter;  
import java.util.List;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse; 
import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
   
@WebServlet("/Viewdetails")  
public class Viewdetails extends HttpServlet {  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)   
               throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        out.println("<a href='index.jsp'>Add New Event</a>");  
        out.println("<h1>Event List </h1>");  
          
        List<Pojoevent> list=DBconnection.getAllEmployees();  
          
        out.print("<table border='1' width='100%'");  
        out.print("<tr><th>StudentId</th><th>FirstName</th><th>Lastname</th><th>Email</th><th>Date</th><th>time</th><th>topic</th><th>location</th><th>Edit</th><th>Delete</th></tr>");  
        for(Pojoevent e:list){  
         out.print("<tr><td>"+e.getId()+"</td><td>"+e.getFname()+"</td><td>"+e.getLname()+"</td> <td>"+e.getEmail()+"</td><td>"+e.getDate()+"</td><td>"+e.getTime()+"</td> <td>"+e.getTopic()+"</td><td>"+e.getLocation()+"</td>"+
                " <td><a href='Editdetails?id="+e.getId()+"'>edit</a></td> " +
                " <td><a href='Deletedetails?id="+e.getId()+"'>delete</a></td></tr>");  
        }  
        out.print("</table>");  
          
        out.close();  
    }  
}  
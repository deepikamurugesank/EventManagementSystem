import java.io.IOException;  
import java.io.PrintWriter;  
import java.util.List;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
@WebServlet("/Eventwisedetails")  
public class Eventwisedetails extends HttpServlet {  

    protected void doPost(HttpServletRequest request, HttpServletResponse response)   
               throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        //out.println("<a href='index.jsp'>Add New Event</a>");  
        if (request.getParameter("ppt") != null)
        {
        out.println("<h1>Event List </h1>"); 

          
        List<Pojoevent> list=DBconnection.paperpresentation();  
          
        out.print("<table border='1' width='100%'");  
        out.print("<tr><th>StudentId</th><th>FirstName</th><th>Lastname</th><th>Email</th><th>Date</th><th>time</th><th>topic</th><th>location</th></tr>");  
        for(Pojoevent e:list){  
         out.print("<tr><td>"+e.getId()+"</td><td>"+e.getFname()+"</td><td>"+e.getLname()+"</td> <td>"+e.getEmail()+"</td><td>"+e.getDate()+"</td><td>"+e.getTime()+"</td> <td>"+e.getTopic()+"</td><td>"+e.getLocation()+"</td>  </tr>");  
        }  
        out.print("</table>");  
          
        out.close();  
    }  
    if(request.getParameter("bb")!=null)
    {
         out.println("<h1>Bug Blaster</h1>"); 

          
        List<Pojoevent> list=DBconnection.bugbluster();  
          
        out.print("<table border='1' width='100%'");  
        out.print("<tr><th>StudentId</th><th>FirstName</th><th>Lastname</th><th>Email</th><th>Date</th><th>time</th><th>topic</th><th>location</th></tr>");  
        for(Pojoevent e:list){  
         out.print("<tr><td>"+e.getId()+"</td><td>"+e.getFname()+"</td><td>"+e.getLname()+"</td> <td>"+e.getEmail()+"</td><td>"+e.getDate()+"</td><td>"+e.getTime()+"</td> <td>"+e.getTopic()+"</td><td>"+e.getLocation()+"</td></tr>");  
        }  
        out.print("</table>");  
          
        out.close();  
        
    }
     if(request.getParameter("th")!=null)
    {
         out.println("<h1>Treasure Hunt</h1>"); 

          
        List<Pojoevent> list=DBconnection.treasure();  
          
        out.print("<table border='1' width='100%'");  
        out.print("<tr><th>StudentId</th><th>FirstName</th><th>Lastname</th><th>Email</th><th>Date</th><th>time</th><th>topic</th><th>location</th></tr>");  
        for(Pojoevent e:list){  
         out.print("<tr><td>"+e.getId()+"</td><td>"+e.getFname()+"</td><td>"+e.getLname()+"</td> <td>"+e.getEmail()+"</td><td>"+e.getDate()+"</td><td>"+e.getTime()+"</td> <td>"+e.getTopic()+"</td><td>"+e.getLocation()+"</td></tr>");  
        }  
        out.print("</table>");  
          
        out.close();  
        
    }
    if(request.getParameter("vc")!=null)
    {
         out.println("<h1>vegetable Carving</h1>"); 

          
        List<Pojoevent> list=DBconnection.carving();  
          
        out.print("<table border='1' width='100%'");  
        out.print("<tr><th>StudentId</th><th>FirstName</th><th>Lastname</th><th>Email</th><th>Date</th><th>time</th><th>topic</th><th>location</th></tr>");  
        for(Pojoevent e:list){  
         out.print("<tr><td>"+e.getId()+"</td><td>"+e.getFname()+"</td><td>"+e.getLname()+"</td> <td>"+e.getEmail()+"</td><td>"+e.getDate()+"</td><td>"+e.getTime()+"</td> <td>"+e.getTopic()+"</td><td>"+e.getLocation()+"</td></tr>");  
        }  
        out.print("</table>");  
          
        out.close();  
        
    }
    if(request.getParameter("band")!=null)
    {
         out.println("<h1>Let's MocktheBand</h1>"); 

          
        List<Pojoevent> list=DBconnection.band();  
          
        out.print("<table border='1' width='100%'");  
        out.print("<tr><th>StudentId</th><th>FirstName</th><th>Lastname</th><th>Email</th><th>Date</th><th>time</th><th>topic</th><th>location</th><th>Edit</th><th>Delete</th></tr>");  
        for(Pojoevent e:list){  
         out.print("<tr><td>"+e.getId()+"</td><td>"+e.getFname()+"</td><td>"+e.getLname()+"</td> <td>"+e.getEmail()+"</td><td>"+e.getDate()+"</td><td>"+e.getTime()+"</td> <td>"+e.getTopic()+"</td><td>"+e.getLocation()+"</td</tr>");  
        }  
        out.print("</table>");  
          
        out.close();  
        
    }
}  
}
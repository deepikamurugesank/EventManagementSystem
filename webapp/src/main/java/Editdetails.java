import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
@WebServlet("/Editdetails")  
public class Editdetails extends HttpServlet {  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
           throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        out.println("<h1>Update Employee</h1>");  
        String sid=request.getParameter("id");  
       // int id=Integer.parseInt(sid);  
          
        Pojoevent e=DBconnection.getEmployeeById(sid);  
          
        out.print("<form action='Editdetails2' method='post'>");  
        out.print("<table color='cornflowerblue'>");  
        out.print("<tr><td></td><td><input type='hidden' name='id' value='"+e.getId()+"'/></td></tr>");  
        out.print("<tr><td>FirstName:</td><td><input type='text' name='fname' value='"+e.getFname()+"'/></td></tr>");  
        out.print("<tr><td>LastName:</td><td><input type='text' name='lname' value='"+e.getLname()+"'/></td></tr>");  
        out.print("<tr><td>Email:</td><td><input type='email' name='email' value='"+e.getEmail()+"'/></td></tr>");  
         out.print("<tr><td>Date:</td><td><input type='Date' name='date' value='"+e.getDate()+"'/></td></tr>");  
          out.print("<tr><td>Time:</td><td><input type='Time' name='time' value='"+e.getTime()+"'/></td></tr>");  
           out.print("<tr><td>Topic:</td><td><input type='text' name='topic' value='"+e.getTopic()+"'/></td></tr>");  
            out.print("<tr><td>Location:</td><td><input type='text' name='location' value='"+e.getLocation()+"'/></td></tr>");  
      
        out.print("<tr><td colspan='2'><input type='submit' value='Edit & Save '/></td></tr>");  
        out.print("</table>");  
        out.print("</form>");  
          
        out.close();  
    }  
}  
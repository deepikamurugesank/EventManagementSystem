import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
@WebServlet("/Editdetails2")  
public class Editdetails2 extends HttpServlet {  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)   
          throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
        String id=request.getParameter("id");
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
        int status=DBconnection.update(po);  
        if(status>0){  
            response.sendRedirect("Viewdetails");  
        }else{  
            out.println("Sorry! unable to update record");  
        }  
          
        out.close();  
    }  
  
}  
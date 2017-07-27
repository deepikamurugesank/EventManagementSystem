import java.io.IOException;  
import java.io.PrintWriter;  
import javax.servlet.Filter;
import javax.servlet.*;  
   import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
      
   import javax.servlet.http.HttpSession; 
 public class MyFilter implements Filter {
   
  
public void init(FilterConfig arg) throws ServletException {}  
      
public void doFilter(ServletRequest request, ServletResponse response,  
        FilterChain chain) throws IOException, ServletException {  
          
    PrintWriter out=response.getWriter();  
 
 HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response; 
     String se=request.getParameter("admin");
     String name=request.getParameter("name");
    
    String password=request.getParameter("password");  
    if(password.equals("123") && se.equals("edit") )
    {  
       
    chain.doFilter(request, response);
}
else if(password.equals("456") && se.equals("view")){
  
      RequestDispatcher rd=request.getRequestDispatcher("/Adminviewlist.jsp");  
       rd.include(request, response);  
}
    
    else{  
    out.print("username or password error!");  
    
    }  
          
}  
    public void destroy() {}  
  
}  
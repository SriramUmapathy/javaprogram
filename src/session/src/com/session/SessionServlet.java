package com.session;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class SessionServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();  
		    
	String User_Id = request.getParameter("User_Id").toString();
    String password = request.getParameter("Password").toString();	
   
	
	
	if(password.equals("servlet")){  
		HttpSession session = request.getSession();
		session.setAttribute("user", User_Id);
		Cookie cookie = new Cookie("user", User_Id);
		cookie.setMaxAge(5*60);
		response.addCookie(cookie);
		response.sendRedirect("success.jsp");
		
		
		
		
       // RequestDispatcher rd=request.getRequestDispatcher("success.jsp");  
        /*try {
			rd.forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} */ 
    }  
    else{  
        out.print("Sorry UserName or Password Error!");  
        RequestDispatcher rd=request.getRequestDispatcher("/index.html");  
        try {
			rd.include(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		}  
                      
        }  
	
	}
}

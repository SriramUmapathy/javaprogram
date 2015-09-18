package com.GAEapp.pac;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class GAEappServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out=res.getWriter();
		res.setContentType("text/html");
		out.print("Sorry UserName or Password Error!");  
 
		String n1=req.getParameter("userName");
		String n2=req.getParameter("userPass");
		
		if(n2.equals("servlet"))
				{  
	        RequestDispatcher rd=req.getRequestDispatcher("/success.html");  
	        try {
				rd.forward(req, res);
			} catch (ServletException e) {
				e.printStackTrace();
			}  
	    }  
	    else{  
	        out.print("Sorry UserName or Password Error!");  
	        RequestDispatcher rd=req.getRequestDispatcher("/index.html");  
	        try {
				rd.include(req, res);
			} catch (ServletException e) {
				e.printStackTrace();
			}  
	                      
	        }  
		
		
	}
}

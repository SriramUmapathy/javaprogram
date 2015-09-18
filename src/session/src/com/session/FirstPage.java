package com.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FirstPage extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Cookie exCookie = null;
		Cookie[] cookies = request.getCookies();
		
		HttpSession session = request.getSession(false);
		if(session != null){
			session.invalidate();
			
		}
		
		if(cookies != null){
			for(Cookie cookie: cookies){
				if(cookie.getName().equals("user") )			
			       exCookie = cookie;
				if(cookie.getName().equals("JSESSIONID"))
				   System.out.println(cookie.getValue());
			}
			
		}	
		if(exCookie != null){
			exCookie.setMaxAge(0);
			response.addCookie(exCookie);
			
		}
	response.sendRedirect("index.html");
	}
	}

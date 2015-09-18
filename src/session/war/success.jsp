<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.io.*,java.util.*, javax.servlet.http.HttpServlet, javax.servlet.http.HttpServletRequest,
javax.servlet.http.HttpServletResponse,
javax.servlet.http.HttpSession"
    %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String userId = null;
String sessionId = null;

if(session.getAttribute("user")==null)
response.sendRedirect("index.html");
Cookie[] cookies = request.getCookies();
if(cookies != null){
	for(Cookie cookie: cookies){
		if(cookie.getName().equals("user") )
		userId = cookie.getValue();	
		if(cookie.getName().equals("JSESSIONID"))
			sessionId = cookie.getValue();
	}
	
}

%>
<h1> got it <%=userId %></h1>
<h2>  Welcome <%=session.getAttribute("user") %> </h2>
<h4> your session id is:<%=sessionId %> </h4>

<a href="first">LOG OUT</a>


</body>
</html>
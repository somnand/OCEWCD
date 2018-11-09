<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to TestProject platform</title>
</head>
<body>
<h3>This page test the ServletContext listener</h3>
<p>
Message : <%=application.getAttribute("listenerMessage") %><br/>
Message : ${applicationScope.listenerMessage }
<br/><br/>
Example of setInitParam() : <%=application.getInitParameter("dynamicParam")%><br/>
<%
Enumeration initNames=application.getInitParameterNames();
while(initNames.hasMoreElements())
{
	out.print(initNames.nextElement()+",");
}
%>
</p>
</body>
</html>

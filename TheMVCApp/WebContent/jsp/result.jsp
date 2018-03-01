<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Beer Advise</title>
</head>
<body>
<h2>result.jsp</h2>
<p>
	<%
	List styles=(List)request.getAttribute("styles");
	Iterator i=styles.iterator();
	
	while(i.hasNext())
	{
		out.print("<br/>Try : "+i.next());
	}	
	%>
</p>
</body>
</html>
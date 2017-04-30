<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Testing the basic JSP</title>
<%!
public int addNumbers(int x,int y)
{
	System.out.println("Logging result : "+(x+y));
	return x+y;	
}
public void throwsErrorOnCall()throws ServletException
{
	throw new ServletException("I am a ServletException");
}
%>
</head>
<body>
This JSP only shows a random test of JSP tags.<br/>
Result <%=addNumbers(4,3) %>
<br/>
This throws and error <%//throwsErrorOnCall(); %>
</body>
</html>
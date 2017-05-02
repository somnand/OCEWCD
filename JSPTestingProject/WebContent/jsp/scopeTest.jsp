<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Testing scopes in JSPs</title>
</head>
<body>
<%
String requestValue=request.getParameter("param");

if(requestValue!=null)
{
	session.setAttribute("param",requestValue);
	application.setAttribute("param",requestValue);
}

String sessionValue=(String)session.getAttribute("param");
String applicationValue=(String)application.getAttribute("param");
%>
Param value in scopes<br/>
Request <%=requestValue %><br/>
Session <%=sessionValue %><br/>
Application <%=applicationValue %><br/>
<br/><br/>
Param value in scopes using PageContext<br/>
<%
//String requestValue=request.getParameter("param");

if(requestValue!=null)
{
	pageContext.setAttribute("sessionValue",requestValue,PageContext.SESSION_SCOPE);
	pageContext.setAttribute("applicationValue",requestValue,PageContext.APPLICATION_SCOPE);
}	
%>
Request <%=requestValue %><br/>
Session <%=pageContext.getAttribute("param",PageContext.SESSION_SCOPE) %><br/>
Application <%=pageContext.getAttribute("param",PageContext.APPLICATION_SCOPE) %><br/>
</body>
</html>
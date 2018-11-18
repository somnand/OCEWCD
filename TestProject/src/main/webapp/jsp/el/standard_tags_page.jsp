<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="models.Message" %>
<%@page import="models.GenericMessage" %>     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>This page is for Expression Language tests</title>
</head>
<body>

Using general scripting <br/>
<%
GenericMessage userMsg = (GenericMessage)request.getAttribute("message");
%>

User message is <%=userMsg.getContent() %><br/>
with priority <%=userMsg.getPriority() %>

<br/><br/>
<%--
Using JSP Standard tags <br/><br/>

<jsp:useBean id="message" type="models.GenericMessage" scope="session"/>

User message is <jsp:getProperty name="message" property="content"/> <br/>
with priority <jsp:getProperty name="message" property="priority"/> <br/>
 --%>
</body>
</html>
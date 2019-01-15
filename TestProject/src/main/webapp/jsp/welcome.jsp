<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="util.LogingHelper" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/mainstyles.css"/>
<title>Welcome Page</title>
</head>
<body>
<%
	LogingHelper.log("Inside welcome.jsp");
%>
<div id="welcome_div" class="infoDiv">
<p>
<center>
Welcome <b><%=session.getAttribute("userId") %></b><br/>
User carried the session : ${pageContext.session.id}
</center>
</p>
</div>
</body>
</html>
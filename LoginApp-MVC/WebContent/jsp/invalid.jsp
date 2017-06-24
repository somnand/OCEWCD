<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="util.LogginHelper" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/mainstyles.css"/> 
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Invalid Entry</title>
</head>
<%
	LogginHelper.log("Inside invalid.jsp");
%>
<body>
	<div id="userMsg" class="infoDiv">
	<p>Invalid user id / password <br/>Try again.</p>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>No Scripts!!</title>
</head>
<body>

	<%
		int x = 9;
	%>
	<%
		for (int i = 0; i < x; i++)
		{
	%>
	This should print once !!<br/>
	<%
		}
	%>
</body>
</html>
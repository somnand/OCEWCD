<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Include tag test</title>
</head>
<body>
<b style="color:red">This is from main page</b><br/>
<%@include file="random_number_generator.jsp" %><br/>
<jsp:include page="random_number_generator.jsp"/><br/>
<b style="color:red">This is from main page</b><br/>
</body>
</html>
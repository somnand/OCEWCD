<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to TestProject : Core JSTL page</title>
</head>
<body>
<c:catch var="pageException">
<%int x=9/9; //Arithmetic Exception%>
This shouldn't be seen!!
</c:catch>
You just survived !! with error ${pageException.localizedMessage} 
</body>
</html>
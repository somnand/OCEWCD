<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isErrorPage="true"  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Oops! Error page</title>
</head>
<body>

<h3>Hi User : There is a fault in the system</h3>
Exception <br/> ${pageContext.exception.localizedMessage }


</body>
</html>
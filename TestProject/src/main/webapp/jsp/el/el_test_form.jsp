<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to TestProject : EL Page tester</title>
</head>
<body>
	This form is used to test the Page el_page.jsp
	<form action="el_page.jsp" method="post">
		Name : <input type="text" name="name" /><br /> 
		ID # : <input type="text" name="id" /><br /> 
		First Food : <input type="text"	name="food1" /><br /> 
		Second Food : <input type="text" name="food2" /><br />
		First Wish : <input type="text" name="wish" /><br /> 
		Second Wish : <input type="text" name="wish" /><br /> 
		<input type="submit" />
	</form>
	<br/>
	This form is used to test the Page standard_tags_page.jsp. Send a message across the JSPs.
	<form action="./transferMessage" method="get">
		Content : <input type="text" name="content" /><br /> 
		Priority : <input type="text" name="priority" /><br /> 		 
		<input type="submit" />
	</form>
</body>
</html>
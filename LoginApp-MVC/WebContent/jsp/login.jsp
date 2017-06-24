<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<link rel="stylesheet" type="text/css" href="css/mainstyles.css"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Welcome : Login 1.0</title>
</head>
<body>
	<center><h2>Login</h2></center>
	<br/><br/>
	<div id="login" class="loginDivCentered">
	<form action="login" method="post">
		<center><input type="text" name="userId" placeholder="Enter User Id"/></center>
		<center><input type="password" name="pwd" placeholder="Enter Password"/></center>
		<center><input type="text" name="pwd" placeholder="Enter PIN"/></center>
		<center><input type="submit" value="Authenticate"/></center>
	</form>
	</div>
</body>
</html>
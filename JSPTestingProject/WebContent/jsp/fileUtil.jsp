<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.io.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>File Utility JSP</title>
</head>
<body>
Some text from fileUtil.jsp
<%!
public String getPath()throws IOException
{
	File file=new File(this.toString());
	String filePath=file.getAbsolutePath();
	return "Util says "+filePath;		
}
%>
</body>
</html>
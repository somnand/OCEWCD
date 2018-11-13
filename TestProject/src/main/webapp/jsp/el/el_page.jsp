<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>This page is for Expression Language tests</title>
<!-- This section in head is for Java initialization -->
<%

	String newLine="This line is in PageContext scope !";
	//session.setAttribute("newLine", newLine);
	pageContext.setAttribute("newLine", newLine);	
	
		
%>
</head>
<body>
<p>
<b>This paragraph contains the implicit object information.</b><br/><br/>
<b>Headers :</b> ${header}<br/>
<b>Header Values :</b> ${headerValues}<br/>
<b>Param :</b> ${param}<br/>
<b>Param Values :</b> ${paramValues}<br/>
<b>Request Type :</b> <%=request.getMethod() %><br/>
<b>Request Type using EL:</b> ${pageContext.request.method }
</p>
<hr/>
<p>
New Line : <br/>
${newLine}
<br/>
Name of Person : ${param.name }<br/>
<b>Id : ${param.id } </b><br/>

First food he likes : ${param.food1}<br/>
${param.food2}  is the another food e likes too.<br/> 

<p style="color: red">
Wish 1 : ${paramValues.wish[0] }<br/>
Wish 2 : ${paramValues.wish[1] }<br/>
</p>
</p>
</body>
</html>
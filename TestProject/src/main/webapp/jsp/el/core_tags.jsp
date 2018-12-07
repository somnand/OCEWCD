<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to TestProject : Core JSTL page</title>
</head>
<body>
<b style="color: red">Invoke the page with the path /TestProject/coreTags</b><br/>
Message from Context : ${xmlContent}<br/>
Message printing using core tags : <c:out value="${xmlContent}" escapeXml="true" default="No message assigned!"/><br/><br/>
<b>Printing messges using EL + JSTL</b> <br/>
<c:forEach items="${messages}" var="i">
	${i}<br/>
</c:forEach>
<b>Printing messages using pure JSTL - Using tables</b> <br/>
<table border="1">
<tr>
<th>Priority</th>
<th>Content</th>
</tr>
<c:forEach items="${messages}" var="i">
<tr>
<td><c:out value="${i.priority }"/></td>
<td><c:out value="${i.content }"/></td>
</tr>
</c:forEach>
</table><br/><br/>
<b>Printing messages using pure JSTL - Using tables - Nested forEach loop</b> <br/>
<table border="1">
<c:forEach var="messageRow" items="${listOfMessages}">
<tr>
<c:forEach var="message" items="${messageRow}" varStatus="messageCount">
<td><c:out value="${messageCount.count}"/></td>
<td><c:out value="${message.priority}"/></td>
<td><c:out value="${message.content}"/></td>
</c:forEach>
</tr>
</c:forEach>
</body>
</html>
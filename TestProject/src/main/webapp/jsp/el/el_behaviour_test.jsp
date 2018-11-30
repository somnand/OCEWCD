<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>   
<%@ page import="models.Message" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Testing the Behaviour of ELs</title>
</head>
<body>

<%

Integer i = new Integer(3);

ArrayList list = new ArrayList();
list.add("tru");
list.add("false");
list.add("13");
list.add("2");

request.setAttribute("list", list);
request.setAttribute("integer", i);

Map map = new HashMap();
map.put("first element","first(1)");
map.put("second","second(2)");
map.put("third","third(3)");

Message message = new Message("Message in Request Scope but set in scriptlet!!",3);
request.setAttribute("message", message);
request.setAttribute("map", map);

%>

list[0] : ${list[0] }<br/>
list["2"] : ${list["2"] }<br/>

<jsp:useBean id="pageMessage" class="models.Message" scope="page">
<jsp:setProperty property="content" name="pageMessage" value="Message in Page Scope!!"/>
</jsp:useBean>

Expressions :<br/>
1. ${list[0] || list["1"]}<br/>
2. ${"2" > 3}<br/>
3. ${"2" == integer-1 }<br/>
4. ${42/0 }<br/><br/>

Model Message : ${requestScope["message"]["content"] }<br/>
Printing the first element in Bean : ${message.content}<br/>
Printing the first element in Map : ${map["first element"]}<br/>
Printing the first element in Map : ${map.second}<br/>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to TestProject : SQL JSTL page</title>
</head>
<body>
This page is to test the SQL tags in JSTL.<br/>
Invoke the page with the path /TestProject/sqlTags<br/>

<sql:setDataSource var="db" driver="oracle.jdbc.driver.OracleDriver" url="jdbc:oracle:thin:@localhost:1521:XE" user="hibernate" password="hibernate"/>
<sql:query var="resultSet" dataSource="db">select * from dual</sql:query>

Database result of query "select * from dual" : ${resultSet }<br/>

</body>
</html>
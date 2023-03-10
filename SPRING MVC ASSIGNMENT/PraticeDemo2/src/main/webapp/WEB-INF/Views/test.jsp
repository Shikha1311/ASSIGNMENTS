<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:errors path="c.*"/>
<%String s=(String)request.getAttribute("msg"); %>
<h1><%=s%></h1>
<form action="done" method="POST">
<p>College Name: <input type="text"name="name"/></p>
<p>College State: <input type="text" name="state"/></p>
<p>PIN Code: <input type="text" name="pin"/></p>
<p><button type="submit">SUBMIT</button></p>
</form>
</body>
</html>
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
<h1>Employee Management  Application</h1>
<form action="demo4" method="post">
<form:errors path="U.*"/>
<p>
Username : <input name="username" type="text">
</p>
Password  : <input name="password" type="password">
</p>
<p>
<button type="submit">SUBMIT</button>
</p>
</form>

</body>
</html>
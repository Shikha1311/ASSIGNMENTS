<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%String s=(String)request.getAttribute("name");%>
<h1>WELCOME <%=s%></h1>
<h2> You have logged successfully<h2>
</body>
</html>
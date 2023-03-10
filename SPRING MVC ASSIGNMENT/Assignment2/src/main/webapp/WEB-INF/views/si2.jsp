<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% String s=(String)request.getAttribute("msg");%>
<h1><%=s%></h1>
<% 
String name2=(String)request.getAttribute("re");
%>

<% 
String name=(String)request.getAttribute("si");
%>
<h2><%=name%></h2>
<h1><%=name2%></h1>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
String M2=(String)request.getAttribute("name");
%>
<h1><%=M2%></h1>

<% 
String M=(String)request.getAttribute("msg");
%>
<h1><%=M%></h1>

</body>
</html>
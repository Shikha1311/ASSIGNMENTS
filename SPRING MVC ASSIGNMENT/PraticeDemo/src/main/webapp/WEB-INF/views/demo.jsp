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
<% 
String name=(String)request.getAttribute("name");
%>
<h1><%=name%></h1>
<form action="Done" method="post">
<form:errors path="s.*" />
<p>
First Name:<input type="text" name="fname"></input>
</p>
<p>
Last Name:<input type="text" name="lname"></input>
</p>
<p>
Age :<input type="text" name="age"></input>
</p>
<p>
Language : <select name="lang" id="lang" multiple>
  <option value="English">English</option>
  <option value="Hindi">Hindi</option>
  <option value="Sankrit">Sankrit</option>
</select>
</p>
<p>
State :<input type="text" name="A.state"></input>
</p>
<p>
Pin :<input type="text" name="A.pin"></input>
</p>

<button type="submit">SUBMIT</button>
</form>
</body>
</html>
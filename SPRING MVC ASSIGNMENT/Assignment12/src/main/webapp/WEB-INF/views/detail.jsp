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
<h2>Banking Application</h2>
<form action="bank2" method="post">
<form:errors path="U.*"/>
<p>
Account No. : <input name="accountno" type="text">
</p>
<p>
Balance : <input name="balance" type="text">
</p>
<p>
<button type="submit">SUBMIT</button>
</p>

</form>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert data here</title>
</head>
<body>
<% String s=(String)request.getAttribute("msg");%>
<h1><%=s%></h1>
 <form action="test2" method="post">
   
     <fieldset>  
      <legend>Simple Interest Calculator:</legend>  
      <h3>Enter Principle in Rs:</h3>
      <input type="number" name="principle"/>
      <h3>Enter Time in years:</h3>
      <input type="number" name="time"/>
      <h3>Enter Rate of interest:</h3>
      <input type="number" name="rate"/>
      <h1></h1>
      <button type="submit">SUBMIT</button>
</fieldset>  
</form>  
</body>
</html>
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
 <form action="login22" method="post">
   <form:errors path="l.*" />
     <fieldset>  
      <legend>Login Here:</legend>  
      <h3>Please Enter Your Name :</h3>
      <input type="text" name="L.name"/>
      <h3>Please Enter Your Email :</h3>
      <input type="email" name="mail"/>
      <h3>Please Enter Your Password :</h3>
      <input type="password" name="L.pass"/>
      <h1></h1>
      <button type="submit">SUBMIT</button>
</fieldset>  
</form>  

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body> 

<%= request.getAttribute("id") %>



<form action="menu" method="post"> 
   menu<input type="text" name="menu"> <br><br>
   <input type="submit">


</form>


</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Exemple</title>
</head>
<body>
	<form method="post" action="result2.jsp">
		
		Name : <input type="text" name="name"/>
		<jsp:useBean id="person" class="teste.Person" type="teste.Person"/>
		<jsp:setProperty property="name" name="person" value="*"/>
		<input type="submit" value="OK">
	</form>
</body>
</html>
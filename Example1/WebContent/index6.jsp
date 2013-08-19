<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="minhaTag" uri="kathyClassicTags"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Exemple</title>
</head>
<body>
	<table>
		<minhaTag:iterageMovies>
			<tr><td> ${movie} </td></tr>
		</minhaTag:iterageMovies>
	</table>	
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>******User Details******</h1>
 ${#regObj.name} <br>
 ${#regObj.email} <br>
 ${#regObj.gender} <br>
 ${#re= "${#regObj.gender}"> <br>

</body>
</html>
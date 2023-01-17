<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Operation Form</h1>
      
      <form action="getDetails">
       User By ID:<input id="uid" name="UId"/> <br>
       <select name="ddFlag">
         <option value="select">Select Records</option>
         <option value="delete">Delete Records</option>
         <option value="update">Update Records</option>
         
        </select>
        <br>
        <br>
        <input type="submit" value="Click Now" />
      
       </form> 
</body>
</html>
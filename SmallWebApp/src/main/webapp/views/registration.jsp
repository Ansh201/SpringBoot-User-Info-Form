<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Registration form </h1>

      <form action="userdetails">

    User Name : <input id="UName" name="UName"/>
    <br>
    Email ID : <input id="EmailId" name="EmailId"/>
    <br>
    Password : <input type="password" id="Password" name="Password"/>
    <br>
    Gender :  <input type="radio" name="Gender" value="1" checked=true/>Male 
      <input type="radio" name="Gender" value="2"/>Female
    <br>
    Hobby :<input type="checkbox" name="Hobby"  value="Dancing"> Dancing
    <input name="Hobby"  type="checkbox" value="Singing">Singing
    <br>
    
    
    <br>
    <input type="submit" value="Register Now"/>
    </form>
</body>
</html>
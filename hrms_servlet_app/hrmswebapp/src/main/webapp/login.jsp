<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
</head>
<body>
<center> <h1> Login Form </h1> </center>   
    <form action="LoginServlet" method="post">  
        <div class="container">   
            <label>Username : </label>   
            <input type="text" placeholder="Enter Username" name="username" required>  </br>
            <label>Password : </label>   
            <input type="password" placeholder="Enter Password" name="password" required>  </br>
            <button type="submit">Login</button>   
        </div>   
    </form>     
</body>
</html>
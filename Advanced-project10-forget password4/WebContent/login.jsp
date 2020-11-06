<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="spr" uri="http://www.springframework.org/tags/form" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Bootstrap Elegant Modal Login Modal Form with Avatar Icon</title>
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css">
<style>
body  
{  
    margin: 0;  
    padding: 0;  
    background-color:dark;  
    font-family: 'Arial';  
}  
.login{  
        width: 400px;  
        overflow: hidden;  
        margin: auto;  
        margin: 300 0 0 250 px;  
        padding: 80px;  
        background:white;  
        border-radius: 5px ;
        border:solid;  
        
        }
          
.input{
margin-bottom:50px;

}


.table{
font-family:sans-serif;
height:20px;
font-weight:bold;

}

}


</style>
 
</head>
<body>

<spr:form action="login.htm" method="post" commandName="user" >
<div class="login" style="margin-top: 100px;">
	<table align="center" >
		<tr>
			<td  style="font-family: sans-serif;">
				Username
			</td>
			<td>
				<spr:input class="form-control" type="email" path="userName" style="height:30px; border-radius:5%; margin-bottom:10px;"/>
			</td>
		</tr>
		<tr>
			<td>
			Password
			</td>
			<td>
				<spr:password path="userPass" style="height:30px; border-radius:5%; margin-bottom:10px;"/>
			</td>
		</tr>
		
		<tr>
			<td>
				<a href="index.jsp" style="text-decoration: none;" >Back</a>
			</td>
			<td>
				<input type="submit"  value="Login" >
			</td>
		</tr>
		
		<tr>
			
			<td colspan="2">
				<a href="forgot_password.html">Forgot Password</a>
			</td>
		</tr>
	</table>
	</spr:form>

</div>

</body>
</html>
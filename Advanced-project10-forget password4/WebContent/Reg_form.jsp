<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="spr" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
body  
{  
    margin: 0;  
    padding: 0;  
    background-color:dark;  
    font-family: 'Arial';  
}  
.login{  
        width: 300px;  
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


}


</style>
<body>

<spr:form action="reg.htm" method="post" commandName="user" >
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
				<input type="submit"  value="Register" >
			</td>
		</tr>
	</table>
	</spr:form>

</div>
</body>
</html>
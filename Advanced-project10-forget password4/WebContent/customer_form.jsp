<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body  
{  
    margin: 0;  
    padding: 0;  
    background-color:dark;  
    font-family: 'Arial';  
}  
.conatiner{  
        width: 300px;  
        overflow: hidden;  
        margin: auto;  
        margin: 300 0 0 250 px;  
        padding: 80px;  
        background:white;  
        border-radius: 5% ;
        border:solid;  
        
        }
          
.input{
margin-bottom:50px;

}


}


</style>
</head>
<body>
 

<spr:form action="customer1.htm" method="post" commandName="cust" >
<div  class="container" style="margin-top:100px; border-radius:5%; border:solid; height:250px; width:400px;margin-left:80vh;">
	<table align="center" style="margin-top:50px;">
		<tr>
			<td>
				Customer Name
			</td>
			<td>
				<spr:input path="custName" style="height:30px; border-radius:5%; margin-bottom:10px;"/>
			</td>
		</tr>
		<tr>
			<td>
				Customer email-id
			</td>
			<td>
				<spr:input path="custEmailId" style="height:30px; border-radius:5%; margin-bottom:15px;"/>
			</td>
		</tr>
		
		<tr>
			<td>
				<a href="home.jsp" style="text-decoration: none;"  >Back</a>
			</td>
			<td>
				<input type="submit"  value="Next" >
			</td>
		</tr>
	</table>
	</div>
	</spr:form>

</body>
</html>
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
.login{  
        width: 270px;  
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
</head>
<body>
<spr:form action="product_update.htm" method="post" commandName="prod" >

<div class="login" style="margin-top:80px;">
	<table align="center" style="margin-top: 5px;" >

		<tr>
			<td>
				
			</td>
			<td>
				<spr:hidden path="productId"/>
			</td>
		</tr>

		<tr>
			<td>
				ProductName 
			</td>
			<td>
				
				<spr:input path="productName" style="height:30px; border-radius:5%; margin-bottom:10px;"/>
				
			</td>
		</tr>
		<tr>
			<td>
				Price
			</td>
			<td>
				<spr:input path="price" style="height:30px; border-radius:5%; margin-bottom:10px;"/>
			</td>
		</tr>
		
		<tr>
			<td>
				Quantity
			</td>
			<td>
				<spr:input path="quantity" style="height:30px; border-radius:5%; margin-bottom:10px;"/>
			</td>
		</tr>
		
		<tr>
			<td>
				Purchase Date
			</td>
			<td>
				<spr:input path="purchaseDate" style="height:30px; border-radius:5%; margin-bottom:10px;"/>
			</td>
		</tr>
		
		<tr>
			<td>
				Category
			</td>
			<td>
				<spr:input path="category" style="height:30px; border-radius:5%; margin-bottom:10px;"/>
			</td>
		</tr>
		
		<tr>
			<td>
				<a href="home.jsp" style="text-decoration: none;" >Back</a>
			</td>
			<td>
				<input type="submit"  value="Update" >
			</td>
		</tr>
	</table>
	</spr:form>
</div>


</body>
</html>
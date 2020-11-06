<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="com.shop.dto.Product"%>
<%@page import="java.util.List"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="customer3.htm" >	
	<table align="center" cellpadding="10" cellspacing="" border="1" style="margin-top: 20vh">
		<% 
		List<Product> elist = (List<Product>)request.getAttribute("list");
		float sum= 0.0f ;
		for(Product p : elist){
		%>
		<tr>
			<td>
				<%=p.getProductName()%>
			</td>
			
			<td>
				<%=p.getPrice()%>
			</td>
			
			<td>
				<%=p.getCategory()%>
			</td>
			
		</tr>
		<% 
		sum=sum + p.getPrice();
		} %>
		
		<tr>
			<td>
				Total
			</td>
			<td colspan="2">
				<%= sum %>
			</td>
		</tr>
		
		<tr>
			<td colspan="3">
				<input type="submit" value="Done">
			</td>
			
		</tr>
	</table>
	
</form>
</body>
</html>
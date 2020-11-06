<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr"%>
    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<spr:form action="show_Category1.htm" method="post" commandName="prod" >
	<table align="center" >
		<tr>
			<td>
				Enter Category:
			</td>
			<td>
				<spr:input path="category"/>
			</td>
		</tr>
		
		<tr>
			<td>
				<a href="home.jsp" >Back</a>
			</td>
			<td>
				<input type="submit"  value="Enter" >
			</td>
		</tr>
	</table>
	</spr:form>
	

</body>
</html>
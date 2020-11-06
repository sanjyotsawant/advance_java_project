<%@page import="com.shop.dto.Product"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<title>delete product</title>
<meta charset="utf-8" />
    <meta
      name="viewport"
      content="width=device-width, initial-scale=1, shrink-to-fit=no"
    />
    <link
      rel="stylesheet"
      href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
    />
    <link
      rel="stylesheet"
      href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
      integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
      crossorigin="anonymous"
    />
    <script
      src="https://kit.fontawesome.com/0ff6456f25.js"
      crossorigin="anonymous"
    ></script>
</head>
<body>
<%@ include file="header.jsp" %>





<div class="container-fluid">    
      
     <!-- My Pending -->
      <div class="row" >
        <div id="top" class="container-fluid ">
		<div class="row content">
			
		</div>
		
		
		
		
		<div class="row content">
			
				
				<div class=" col-sm-12 main jumbotron">
				<h3 class="text-center">
					<b>Delete Product</b>
					
					</h3>
							
				<div class="table-responsive" id="myTable"></div>
<spr:form action="delete1.htm" method="post" >
				<table class="table  table-striped ">
					<thead class="table-dark">
						<tr>
							<th></th>
							<th class="align-middle">Product Name</th>
							<th class="align-middle">Purchase Date</th>
							<th class="align-middle">Price</th>
							<th class="align-middle">Quantity</th>
							
							<th class="align-middle">Category</th>
							
						</tr>
					</thead>
					<tbody id="myTableBody">
		<% 
		List<Product> elist = (List<Product>)request.getAttribute("prodList");
		for(Product p : elist){
		%>
						
						<tr style="">
							<td class="align-middle">
				<input type="checkbox" value="<%= p.getProductId()%>" name="productId"/>
			</td>
							<td style="display:none" class="align-middle"><%=p.getProductId()%>
							</td>
							<td class="align-middle"><%= p.getProductName() %></td>
							<td class="align-middle"><%= p.getPurchaseDate() %></td>
							<td class="align-middle"><%= p.getPrice() %></td>
							
							<td class="align-middle"><%= p.getQuantity() %></td>

							<td class="align-middle"><%= p.getCategory() %></td>
							
							
							
						</tr>
						<% } %>
						<tr>
			
			
		</tr>
					
					</tbody>
				</table>
				<div>
				
				
					
				</div>
				<div class="row justify-content-between align-items-center" style="height: 50px;  font-size: 20px; ">
				<a href="home.jsp" style="color: grey"  >Back</a>
				<button class="btn-secondary btn-lg">	DELETE
				</button>
				
				
				
				
				</div>
</spr:form>	
			</div>
		</div>
	</div>

       
      </div>


       
      </div>
      


<%@ include file="footer.jsp" %>
</body>
</html>

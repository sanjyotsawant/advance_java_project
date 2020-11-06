<%@page import="com.shop.dto.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<title>products</title>
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






<div class="container-fluid">    
      
     <!-- My Pending -->
      <div class="row" >
        <div id="top" class="container-fluid ">
		<div class="row content">
			
		</div>
		
		
		
		
		<div class="row content">
			
				
				<div class=" col-sm-12 main jumbotron">
				<h3 class="text-center">
					<b>Product List</b>
					
					</h3>
							
				<div class="table-responsive" id="myTable"></div>
				<table class="table  table-striped ">
					<thead class="table-dark">
						<tr>
							<th class="align-middle">Product Name</th>
							<th class="align-middle">Purchase Date</th>
							<th class="align-middle">Price</th>
							<th class="align-middle">Quantity</th> 
							<th class="align-middle">Category</th>
							<th></th>
						</tr>
					</thead>
					<tbody id="myTableBody">
																		<% 
		List<Product> elist = (List<Product>)request.getAttribute("prodList");
		for(Product p : elist){
		%>
						
						<tr style="">
							<td class="align-middle" style="display:none" >
				<%=p.getProductId()%>
			</td>
							<td class="align-middle"><%= p.getProductName() %></td>
							<td class="align-middle"><%= p.getPurchaseDate() %></td>
							<td class="align-middle"><%= p.getPrice() %></td>
							<td class="align-middle"><%= p.getQuantity() %></td>
							<td class="align-middle"><%= p.getCategory() %></td>
							
							<td class="align-middle">
				<a href = "update_form.htm?productId=<%= p.getProductId() %>">Edit</a>
			</td>		
							
						</tr>
						<% } %>
						
					
					</tbody>
				</table>
				<div class="row justify-content-between align-items-center" style="height: 50px;  font-size: 20px; ">
				
				
				
				<a href="home.jsp" style="color: grey"  >
				
					<button class="btn-secondary btn-lg">	Back
				</button>	
				</a>
				
				</div>
			</div>
		</div>
	</div>

       
      </div>


       
      </div>
      


<%@ include file="footer.jsp" %>
</body>
</html>
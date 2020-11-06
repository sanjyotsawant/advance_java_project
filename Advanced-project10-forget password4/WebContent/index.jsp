<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Shop Management</title>

  
  <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
	<!-- Bootstrap core CSS -->
  <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="css/business-frontpage.css" rel="stylesheet">
  

</head>


<body style="height:0px;">


 <nav class="navbar navbar-inverse m-0 ">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">MyAppliance</a>
    </div>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="pre_reg_form.htm"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="pre_log_form.htm"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>
</nav>

  
  <header class="py-5 mb-5">
    <div class="container h-100">
      <div class="row h-100 align-items-center">
        <div class="col-lg-12">
         <img alt="myimages" src="<c:url  value="/resources/images/homeapp.jpg" />" style="height: 100%; width:100% ;background:cover;"> 
        </div>
      </div>
    </div>
  </header>


 <div class="container">

    <div class="row">
      <div class="col-md-8 mb-5">
        <h2>What We Do</h2>
        <hr>
        <p>For most of us, our day to day lives are made easier by a vast array of appliances that fulfil a multitude of useful purposes. From making our coffee in the morning to heating our bed at night, we are surrounded by appliances. It seems there is an appliance for just about everything now, from nose hair shavers to electric can openers, if you can think of it, it is out there for sale.</p>
        <p>Buy anything & everything at MyAppliances Electronics Store Online</p>

<p>TV sets & Accessories:</p>

<p> Browse through the basic and high-end range of TV sets at MyAppliances.com. Depending on your needs and choice, you can choose from the top brands; Samsung, Sony, LG  to name a few.</p>


<p>Home Appliances</p>

<p>Life without apt home appliances is unimaginable. But with the market being flooded with a plethora of options, it is easy to make choices. Be it Washing Machines, Microwave Ovens, MyAppliances offers you the best deals on home appliances online.</p>

      </div>
    
    </div>  
    
    
    
      <div class="col-md-4 mb-5">
        <div class="card h-100">
        <h4 class="card-title">Fridge</h4>
          <img class="card-img-top" src="<c:url  value="/resources/images/more.jpg"  />" alt="" style="height: 100%; width:100% ;background:cover;">
          <div class="card-body">
            <p class="card-text"></p>
          </div>
        </div>
      </div>
      <div class="col-md-4 mb-5">
        <div class="card h-100">
        <h4 class="card-title">Washing machine</h4>
          <img class="card-img-top" src="<c:url  value="/resources/images/protect.jpg"  />" alt="" style="height: 100%; width:100% ;background:cover;">
        </div>
      </div>
      <div class="col-md-4 mb-5">
        <div class="card h-100">
         <h4 class="card-title">TV sets</h4>
          <img class="card-img-top" src="<c:url  value="/resources/images/tv.jpg"  />" alt="" style="height: 100%; width:100% ;background:cover;" >
        </div>
      </div>
    
    
    
     <div class="col-md-4 mb-5">
        <h2>Contact Us</h2>
        <hr>
        <address>
          <strong></strong>
          <br>3481 Melrose Place
          <br>Palli Hills, Bandra
          <br>
        </address>
        <address>
          <abbr title="Email">Email:</abbr>
          <a href="mailto:#">name@example.com</a>
        </address>
      </div>
    
      
  </div>
  
  



  
  
  
  
  
  <footer class="page-footer font-small blue bg-dark" style="background: black; height:50px;">
  <div class="footer-copyright text-center text-white py-3" style="margin-top:30px;padding:15px;color:white;">© 2020 Copyright:
    <a href="#"> MyAppliances.com</a>
  </div>
  </footer>
  
  
  

<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	<script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
</body>
</html>
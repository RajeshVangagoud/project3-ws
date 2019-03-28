<%@ page language="java" contentType="text/html; charset=ISO-8859-1"   pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<!-- Added Newly  -->

<link rel="stylesheet"	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"	href="<c:url value="/js/validator/formValidation.min.css"/>" />
<link rel="stylesheet"	href="<c:url value="/css/login.css"/>" />
<link rel="stylesheet"	href="<c:url value="/css/bootstrap.min.css"/>" />
<style>
.help-block{
	color:red;
	    width: 100%;
    display: block;
}
</style>
</head>

<body>
<div class="wrapper fadeInDown">
  <div id="formContent" class="form-group">
    <!-- Tabs Titles -->
    <!-- Icon -->
    <div class="fadeIn first">
		<img src="images/Usericon.png" alt="" />
		           

    </div>
    <!-- Login Form -->
    <form action="${pageContext.request.contextPath}/login" id="loginForm" method="post" class="form-horizontal">
    
    	<div class="form-group">
     	  <input type="text" id="login" class="fadeIn second" name="email" placeholder="Email Address" value="${personDetails.email}">
     	</div>
     	 
     	<div class="form-group">
      	  <input type="password" id="password" class="fadeIn third" name="password" placeholder=" Password"><br><br>
	      <div style="color: red">
	     ${errormsg}
	     </div>
     </div>
        <div class="form-group" style="text-align: center;">
		  <label style="color: #17A589">You stay In</label>
			<select id="disabledSelect" class="form-control" name="stayIn">
				<c:forEach var="cities" items="${getcities}">
					<option value=${cities}>${cities}</option>
				</c:forEach>
			</select>
		</div>
        <div class="form-group" style="text-align: center;">
            <input type="checkbox" id="agreeForTerms" name="agreeForTerms">I agree to InstaReM's 
            <a href="#" data-toggle="modal" data-target="#myModal" class="col-blue">Terms &Conditions and Privacy Policy</a>
       </div>
	    
      <input type="submit" class="fadeIn fourth" value="Log In">
      <input type="button"  class="fadeIn fourth" value="SignUp" onclick="window.location.href='${pageContext.request.contextPath}/newUser'">
    </form>

    <!-- Remind Passowrd -->
    <div id="formFooter">
      <a class="underlineHover" href="${pageContext.request.contextPath}/forgotPassword">Forgot Password?</a>
      <a class="underlineHover" href="https://echequedev.devtpit.com">eCheque</a>
      
    </div>

  </div>
</div>
<div class="Rajesh Vanga">

</div>

<!-- Modal -->
<div id="myModal" class="modal fade" role="dialog">
  <div class="modal-dialog modal-lg">

    <!-- Modal content-->
    <div class="modal-content">
      <div class="modal-header pt-n">
        
        <h3 class="font-21">Terms and Conditions</h3>
        <button type="button" class="close font-21" data-dismiss="modal">&times;</button>
      </div>
      <div class="modal-body">
        <p class="font-12">Last updated: March 20, 2019</p>
        <p>Please read these Terms and Conditions ("Terms", "Terms and Conditions") carefully before using the www.verudix.com website and the Vox Reminder mobile application (together, or individually, the "Service") operated by Verudix Solutions ("us", "we", or "our").</p>
		<p>Your access to and use of the Service is conditioned upon your acceptance of and compliance with these Terms. These Terms apply to all visitors, users and others who wish to access or use the Service.</p>
      </div>
      
      <div class="modal-footer">
        <button type="button" class="btn btn-primary g-bg-blue waves-effect" data-dismiss="modal">Close</button>
      </div>
      
      <div class="modal-footer">
        <button type="button" class="btn btn-primary g-bg-blue waves-effect" data-dismiss="modal">Close</button>
      </div>
    </div>

  </div>
</div>
<div class="theme-bg"></div>
 
	<!-- JQuery libraries -->
	<script src="<c:url value="/js/jquery/jquery-2.1.4.min.js"/>" type="text/javascript"></script>
	<script src="<c:url value="/js/jquery/jquery.js"/>"	type="text/javascript"></script>
	<script src="<c:url value="/js/jquery/jquery-ui.min.js"/>"	type="text/javascript"></script>
	<script src="<c:url value="/js/jquery/jquery.min.js"/>"	type="text/javascript"></script>

	<!-- form validation libraries  -->
	<script	src="https://cdnjs.cloudflare.com/ajax/libs/es6-shim/0.35.3/es6-shim.min.js"></script>
	<script src="<c:url value="/js/validator/formValidation.min.js"/>" type="text/javascript"></script>
	<script src="<c:url value="/js/validator/bootstrap.min.js"/>" type="text/javascript"></script>
	
	<script src="<c:url value="/js/validation.js"/>" type="text/javascript"></script>
	


</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<script src="<c:url value="/js/jquery.js"/>" type="text/javascript"></script>
<script src="<c:url value="/js/jquery-ui.min.js"/>" type="text/javascript"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="<c:url value="/js/bootstrap.min.js"/>" type="text/javascript"></script>
<script src="<c:url value="/js/Login.js"/>" type="text/javascript"></script>
<script src="<c:url value="/js/formValidation.min.js"/>" type="text/javascript"></script>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<link rel="stylesheet" href="<c:url value="/css/login.css"/>">
</head>
<body>

<div class="wrapper fadeInDown">
  <div id="formContent"><br><br><br><br>
    <div class="fadeIn first">
				<img src="<c:url value="\images\lock.png"/>" alt="" />
    </div>
          <p>You can reset your password here.</p>
    <br>
      <input type="text" id="email" class="fadeIn second" name="email" placeholder="Email Address">
       <input type="text" id="otp" class="fadeIn second" name="otp" placeholder="Enter OTP here" style="display: none;">
      
      <br>
      <br>
             <div class="form-group" style="text-align: center;">
             <span id="wrongOTP" style="color: red"></span>
     </div>
      <input type="button" class="fadeIn fourth" id="sendPassword" value="Send My Password">
      
       <input type="button" class="fadeIn fourth" id="otpSubmit" value="Submit" style="display: none;">
       
      
<br><br>
  </div>
</div>
</body>
<script type="text/javascript">

$(document).ready(function() {
	
	$("#sendPassword").click(function() {
		debugger;
var email=$("#email").val();

		$.ajax({
			type : "POST",
			url : ("/resetPassword"),
			dataType : 'json',
			data : JSON.stringify(email),
			contentType : "application/json;charset=UTF-8",
			xhrFields : {
				withCredentials : true
			},
			success : function(data) {
				$("#otp").show();
				$("#otpSubmit").show();
				$("#sendPassword").hide();

				$("#otpSubmit").click(function() {
					var otp=$("#otp").val();
         if(data==otp){
				window.location.href = ("/newPassword");

         }else{
        	 $("#wrongOTP").html("Incorrect OTP");
         }
				});

			},
			error : function(xhr, status, error) {
				alert(error);

				console.error(error);
			},

	});
	});
});

</script>
</html>
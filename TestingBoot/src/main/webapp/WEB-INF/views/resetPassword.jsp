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


<!------ Include the above in your HEAD tag ---------->
</head>
<body>
<div class="wrapper fadeInDown">
  <div id="formContent">
    <!-- Tabs Titles -->

    <!-- Icon -->
    <div class="fadeIn first">
				<img src="<c:url value="\images\Usericon.png"/>" alt="" />
    </div>
    <!-- Login Form -->
    <form action="/saveNewpassword" method="post" id="saveform">
      <input type="text" id="login" class="fadeIn second" name="email"  readonly="readonly" value="${email}">
      <input type="text" id="password" class="fadeIn third" name="password" placeholder=" Password">
            <input type="text" id="reenterpassword" class="fadeIn third" name="reenterpassword" placeholder="Reenter Password">
      <br>
     <div style="color: red" id="reentermsg">
     </div>
      <br>
             <div class="form-group" style="text-align: center;">
    
     
      <input type="button" class="fadeIn fourth" id="btn_sub" value="Submit">
      </div>
    </form>


  </div>
</div>
</body>
<script type="text/javascript">
$(document).ready(function() {
	
	$("#btn_sub").click(function() {
		debugger;
		var password=$("#password").val();
		var reEnterpassword=$("#reenterpassword").val();
		if(password==reEnterpassword){
			alert();
			$("#saveform").submit();
		}else{
			$("#reentermsg").html("Password does not match");
		}
});
});

</script>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sample APP</title>
<link rel="stylesheet"	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"	href="<c:url value="/css/bootstrap.min.css"/>" />
<link rel="stylesheet"	href="<c:url value="/js/validator/formValidation.min.css"/>" />
<style>
.help-block{
	color:red;
}
</style>
</head>

<body>
	<form action="/save" id="registrationForm" method="post">
		<nav class="navbar navbar-expand-sm bg-dark navbar-dark" style="background-color: #D1F2EB !important;">
			<a style="font color: black" href="#">Personal Details</a>
		</nav>
		<br>
		<div class="row">
			<div class="col-sm-3">
				<div class="form-group">
					<div class="col-sm-12">
						<select class="form-control" id="title" name="title">
							<option value="">Title</option>
							<option value="mr">Mr</option>
							<option value="miss">Miss</option>
						</select>
					</div>
				</div>
			</div>
			<div class="col-sm-3">
				<div class="form-group">
					<div class="col-sm-12">
						<input type="text" id="firstname" class="form-control" name="firstName" placeholder="First Name" />
					</div>
				</div>
			</div>
			<div class="col-sm-3">
				<div class="form-group">
					<div class="col-sm-12">
						<input type="text" id="middlename" class="form-control" name="middleName" placeholder="Middle Name" />
					</div>
				</div>
			</div>
			<div class="col-sm-3">
				<div class="form-group">
					<div class="col-sm-12">
						<input type="text" id="lastname" class="form-control" name="lastName" placeholder="Last Name" />
					</div>
				</div>
			</div>
		</div>
		<div class="row">
	
		<div class="col-sm-6">
			<div class="form-group">
				<div class="col-sm-12">
	               <div class="input-group date" data-provide="datepicker">
	                <input type="text" class="form-control" placeholder="DOB(mm/dd/yyyy)" data-date-format="dd/mm/yyyy" name="persondob">
	               <div class="input-group-addon">
	             <span class="glyphicon glyphicon-th"></span>
	    </div>
	</div>
	
				</div>
			</div>
		</div>
			 
			
			
			<div class="col-sm-6">
				<div class="form-group">
					<div class="col-sm-12">
						<select class="form-control show-tick" id="nationality"	name="nationality">
						<c:forEach var="nationality" items="${getnationality}">
																		<option value="">Nationality</option>
						
							<option value=${nationality.nationality}>${nationality.nationality}</option>
							</c:forEach>
						</select>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-6">
				<div class="form-group">
					<div class="col-sm-12">
						<input type="text" id="email" name="email" placeholder="Email" class="form-control" />
					</div>
				</div>
			</div>
			<div class="col-sm-6">
				<div class="form-group">
					<div class="col-sm-12">
						<input type="password" id="password" name="password" class="form-control" placeholder="Password" />
					</div>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="col-sm-6">
				<div class="form-group">
					<div class="col-sm-12">
						<input type="password" id="reenterpassword" name="reenterpassword" class="form-control" placeholder="Reenter Password" />
					</div>
				</div>
			</div>
			<div class="col-sm-6">
				<div class="form-group">
					<div class="col-sm-12">
						<select class="form-control show-tick" id="sourceOfFunds" name="sourceOfFunds">
							<option value="">Source Of Founds</option>
							<option value="Salary">Salary</option>
								<option value="Bussiness">Bussiness</option>
						</select>
					</div>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="col-sm-6">
				<div class="form-group">
					<div class="col-sm-12">
						<select class="form-control show-tick" id="employeeStaus" name="employeeStaus">
												<option value="">EmployeeStaus</option>
						
							<option value="Working">Working</option>
							<option value="Retired">Retired</option>
						</select>
					</div>
				</div>
			</div>
			<div class="col-sm-6">
				<div class="form-group">
					<div class="col-sm-12">
						<select class="form-control show-tick" id="IntenededUseOfAccount" name="IntenededUseOfAccount">
						<option value="">IntenededUseOfAccount</option>
							<option value="Personal">Personal</option>
							<option value="Bussiness">Bussiness</option>
						</select>
					</div>
				</div>
			</div>
		</div>


		<div class="row">
			<div class="col-sm-6">
				<div class="form-group">
					<div class="col-sm-12">
						<input type="text" id="referralCode" name="referralCode" class="form-control" placeholder="Referral Code" />
					</div>
				</div>
			</div>
			<div class="col-sm-6">
				<div class="form-group">
					<div class="col-sm-12">
						<select class="form-control show-tick" id="industryType" name="industryType">
							<option value="">industryType</option>
							<option value="Army">Army</option>
                             <option value="">Industry Type</option>
							<option value="Aerospace">Aerospace</option>
							<option value="Chemical">Chemical</option>
							<option value="Computer">Computer</option>
							<option value="">Industry Type</option>
							<option value="Construction">Construction</option>
							<option value="Education">Education</option>
						</select>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-6">
				<div class="form-group">
					<div class="col-sm-12">
						<div class="form-line">
							<label>Are you PEP?</label>
							 <input type="radio" name="PEP" id="PEP" value="yes" checked> Yes 
							 <input type="radio" name="PEP" id="PEP" value="no"> No<br>
						</div>
					</div>
				</div>
			</div>
			<div class="col-sm-6">
				<div class="form-group">
					<div class="col-sm-12">
						<input type="text" id="netWorth" name="netWorth" class="form-control" placeholder="Net Worth" />

					</div>
				</div>
			</div>
		</div>
		<nav class="navbar navbar-expand-sm bg-dark navbar-dark" style="background-color: #D1F2EB !important;">
			<a style="font color: black" href="#">Other</a>
	    </nav>
		<div class="form-group">
			<div class="col-sm-3">
				<div class="form-line">
					<label>Are you Dual Citizen?</label> 
					<input type="radio"	name="dualCitizen" id="dualCitizen" value="yes" checked>Yes
					<input type="radio" name="dualCitizen" id="dualCitizen" value="no">	No<br>
				</div>
			</div>
		</div>
        <button type="reset" class="btn btn-default pull-center" onclick="window.location.href='/'">Cancel</button>
		<input type="submit" class="btn btn-info" name="register-submit" id="register-submit" tabindex="4"
			class="form-control btn btn-register" value="Register Now"
			style="float: center;">

	</form>


	<!-- JQuery libraries -->
	<script src="<c:url value="/js/jquery/jquery-2.1.4.min.js"/>" type="text/javascript"></script>
	<script src="<c:url value="/js/jquery/jquery.js"/>"	type="text/javascript"></script>
	<script src="<c:url value="/js/jquery/jquery-ui.min.js"/>" type="text/javascript"></script>
	<script src="<c:url value="/js/jquery/jquery.min.js"/>"	type="text/javascript"></script>

	<!-- form validation libraries  -->
	<script src="https://cdnjs.cloudflare.com/ajax/libs/es6-shim/0.35.3/es6-shim.min.js"></script>
	<script src="<c:url value="/js/validator/formValidation.min.js"/>" type="text/javascript"></script>
	<script src="<c:url value="/js/validator/bootstrap.min.js"/>" type="text/javascript"></script>
	
	<script src="<c:url value="/js/validation.js"/>" type="text/javascript"></script>
	<script src="<c:url value="/js/bootstrap-datepicker.js"/>" 	type="text/javascript"></script>
	

</body>
<script type="text/javascript">
$(document).ready(function() {
	var date = new Date();
	$('#datePicker').datepicker({
		 format: 'dd/mm/yyyy',
		 startDate: date,
		keyboardNavigation : false,
		forceParse : false,
		autoclose : true
	});
});





</script>

</html>
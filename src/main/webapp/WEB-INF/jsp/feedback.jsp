<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>

<head>
<title>Project 2 - User Feedback </title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">

</head>

<body>

	<div class="container">
		<h1>Feedback Form</h1>

		<form:form method="post" commandName="feedback">
			<form:hidden path="id" />
			<fieldset class="form-group">
				<form:label path="name">Name</form:label>
				<form:input path="name" type="text" class="form-control"
					required="required" />
				<form:errors path="name" cssClass="text-warning" />
			</fieldset>

			<fieldset class="form-group">
				<form:label path="emailId">Email Id</form:label>
				<form:input path="emailId" type="text" class="form-control"
					required="required" />
				<form:errors path="emailId" cssClass="text-warning" />
			</fieldset>
			
			<fieldset class="form-group">
				<form:label path="dob">Date of Birth</form:label>
				<form:input path="dob" type="text" class="form-control"
					required="required" />
				<form:errors path="dob" cssClass="text-warning" />
			</fieldset>
			
			
			<fieldset class="form-group">
				<form:label path="rating">Rating(range- 1 - 10)</form:label>
				<form:input path="rating" type="number" class="form-control"
					required="required" />
				<form:errors path="rating" cssClass="text-warning" />
			</fieldset>
			
			<fieldset class="form-group">
				<form:label path="suggestion">Any Suggestions/Comments ?</form:label>
				<form:input path="suggestion" type="text" class="form-control" />
				<form:errors path="suggestion" cssClass="text-warning" />
			</fieldset>
			

			<button type="submit" class="btn btn-danger">Submit Feedback</button>
		</form:form>
	</div>

	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	<script
		src="webjars/bootstrap-datepicker/1.0.1/js/bootstrap-datepicker.js"></script>
	<script>
		$('#dob').datepicker({
			format : 'dd/mm/yyyy '
		});
	</script>

</body>
</html>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome</title>
<!-- Put css link here in the head section -->
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	    		rel="stylesheet">
</head>
<body>
<%-- Hi ${name} <br/> --%>
<div class="container">
	<form:form action="/add-todo" method="post" commandName="todo">
	<h1>Please add a new todo:</h1>
		<fieldset class="form-group">
			<form:label path="desc">Description</form:label>
			<form:input type="text" path="desc" class="form-control" required="required"/>
			<form:errors path="desc" cssClass="text-warning"/>
		</fieldset>
		<div>
			<input type="submit" class="btn btn-success" value="Add"/>
		</div>
	</form:form>
</div> 

<!-- Put js script here in the end of body -->
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>

</html>
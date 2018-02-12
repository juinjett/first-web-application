<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
Hi ${name} <br/>
<div class="container">
	<table class="table table-striped">
		<caption>Your Todos are</caption>
		<thead>
			<tr>
				<th>Description</th>
				<th>Target Date</th>
				<th>Is completed?</th>
			</tr>
		</thead>
		
		<c:forEach items="${todo }" var="todo">
	<%-- 	${todo.id } ${todo.desc } </br>--%>		
			<tbody>
				<tr>
					<td>${todo.desc }</td>
					<td>${todo.targetDate }</td>
					<td>${todo.done }</td>
					<td><a class="btn btn-danger" href="/delete-todo?id=${todo.id }">Delete</a></td>
				</tr>
			</tbody>
		
		</c:forEach>
		
	</table>
</div>
<div>
<a class="btn btn-success" href="/add-todo">Add </a>

</div>

<!-- Put js script here in the end of body -->
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>

</html>
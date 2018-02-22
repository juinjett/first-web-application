<%@include file="common/header.jspf" %>
<%@include file="common/navigation.jspf" %>

<div class="container">
	<form:form method="post" commandName="todo">
	
		<form:hidden path="id"/>
		<h1>Please add a new todo:</h1>
		<fieldset class="form-group">
			<form:label path="desc">Description</form:label>
			<form:input type="text" path="desc" class="form-control" required="required"/>
			<form:errors path="desc" cssClass="text-warning"/>
		</fieldset>
		
		<fieldset class="form-group">
			<form:label path="targetDate">Description</form:label>
			<form:input type="text" path="targetDate" class="form-control" required="required"/>
			<form:errors path="targetDate" cssClass="text-warning"/>
		</fieldset>
		<div>
			<input type="submit" class="btn btn-success" value="Submit"/>
		</div>
	</form:form>
</div> 

<%@include file="common/footer.jspf" %>

<!-- <script>
	$('#targetDate').datepicker({
		format : 'dd/mm/yyyy'
	});
</script> -->
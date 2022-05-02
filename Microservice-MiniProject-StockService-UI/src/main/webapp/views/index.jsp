<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<body>
	<fieldset style="width: 300px;">
		<legend>Stock Calculator</legend>
		<form action="getTotalCost">
			Company : <input type="text" name="cname" required> <br>
			Quantity : <input type="number" name="qnty" required> <br>
			<input type="submit" value="submit" class="btn btn-lg btn-warning">
		</form>
	</fieldset>
	<h1>${price}</h1>

</body>
</html>
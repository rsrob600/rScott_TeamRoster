<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.codingdojo.web.models.Team" %>
<%@ page import="com.codingdojo.web.models.Player" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>New Team</title>
</head>
<body>

	<div class='container'>


		<div class="form">
			<h3>Create a new team</h3>
			
			<a href="/TeamRoster/Home">Home</a>
			
			
			<form method="post" action="/TeamRoster/teams">
				<input type="text" name="teamN">
				<input type="submit" value="Create Team">
			</form>
			
			
		</div>
		
	
		
	

	
	</div>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.codingdojo.web.models.Team" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap"%>
<!DOCTYPE html>

<!--testing array data presentation in html table -->
<%
String[][] teamData = {
{"Lakers", "8"},
{"Bulls", "10"},
{"Warriors", "7"},
{"Heat", "15"},
{"Hoosier", "11"}
};
request.setAttribute("arrTeam", teamData);
%>

<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Home</title>
</head>
<body>

	<div class='container'>
		<h1>Prototype Roster</h1><br>
		<!-- Create Team Link -->
		<a href="/TeamRoster/Teams">New Team</a><br>
			
		<!-- using testing array data from above -->	
		<table>
			<tr>
				<th>Team | </th>
				<th>Players | </th>
				<th>Action</th>
			</tr>
			<c:forEach var="team" items="${arrTeam}">
				<tr>		
					<td>"${team[0]}"</td>
					<td>"${team[1]}"</td>
					<td><a href="/TeamRoster/teams?team_id=">Details</a> <a href="/TeamRoster/Home?team_id=">Delete</a></td>
				</tr>
				</c:forEach>	
		</table>
		
		
		<!-- Testing from Teams Controller -->
			<!-- Instantiate Array from teams controller -->
				<!-- Populate array team list data to table -->
		
		
		
		
	</div>

</body>
</html>
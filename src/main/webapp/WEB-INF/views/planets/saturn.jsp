<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Saturn</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/solar/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-8nq3OiMMgrVFAHyRMMO+DTfMEciSY+c3Awhj/5ljQ1xck1Uv2BUtMjsjLD8GT5Er"
	crossorigin="anonymous">
<link rel="stylesheet" href="../css/spacestyle.css">
</head>
<body>
	<input type="button" class="btn btn-primary hBack"
		value="<- Return to Index" onclick="window.location='/'" />
	<input type="button" class="btn btn-primary" value="Create User"
		onclick="window.location='../create-user'" />
	<h1>Saturn</h1>
	<br>
	<table>
		<tr>
			<td><img src=${planet.gifImage }
				style="width: 350px; height: 300px;"></td>
			<td>
				<table class="table space-table">
					<tr>
						<th>Star Name</th>
						<th>Star Distance</th>
						<th>Year Discovered</th>
						<th>Radius</th>
						<th>Period</th>
					</tr>
					<tr>
						<td>${planet.starName }</td>
						<td>${planet.starDistance }</td>
						<td>${planet.yearDiscovered }</td>
						<td>${planet.radius }</td>
						<td>${planet.period }</td>
					</tr>
				</table> <br>

				<table class="table space-table">
					<tr>
						<th>Mass</th>
						<th>Temperature Calculated</th>
						<th>Minimum Temperature</th>
						<th>Maximum Temperature</th>
					</tr>
					<tr>
						<td>${planet.mass }</td>
						<td>${planet.tempCalculated }</td>
						<td>${planet.minTemp }</td>
						<td>${planet.maxTemp }</td>
					</tr>
				</table>
	</table>

	<p>If you like it, then you should of put a ring on it! Vacationing
		on Saturn is out of this world. Be the first to fully commit your
		hotel business on this exotic planet. Your guests will be able to view
		Saturn's rings in person as they hold their place in the atmosphere
		above them. If you think the Grand Canyon is cool wait until you see
		the rocky surface of good old Saturn. Not only is the surface made up
		of rocks it is also covered in ice that is structured in ways that are
		unimaginable. You really have to see it to believe it.</p>		
		
	<p id="xPoints_1" hidden=true>${saturnGraph1.getXPoints()}</p>
	<p id="yPoints_1" hidden=true>${saturnGraph1.getYPoints()}</p>
	<p id="title_1" hidden=true>${saturnGraph1.titleName}</p>
	<p id="xName_1" hidden=true>${saturnGraph1.xName}</p>
	<p id="yName_1" hidden=true>${saturnGraph1.yName}</p>

	<div class="container" id="graph1">
		<!-- Graph #1 goes here -->
	</div>

	<!--  JS that actually creates the graphs -->
	<script src="https://cdn.plot.ly/plotly-latest.min.js"></script>
	<script type="text/javascript" src="../scripts/graphs/line1.js"></script>
	
</body>
</html>
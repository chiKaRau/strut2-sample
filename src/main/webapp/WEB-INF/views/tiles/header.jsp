<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<h1>My Website</h1>
		<nav>
			<ul>
				<li><a href="<s:url action='home'/>">Home</a></li>
				<li><a href="<s:url action='contact'/>">Contact</a></li>
			</ul>
		</nav>
	</div>
</body>
</html>
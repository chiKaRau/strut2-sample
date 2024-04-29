<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<!DOCTYPE html>
<html>
<head>
<title>My Application</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
	<div id="header">
		<tiles:insertAttribute name="header" />
	</div>
	<div id="content">
		<tiles:insertAttribute name="body" />
	</div>
	<div id="footer">
		<tiles:insertAttribute name="footer" />
	</div>
</body>
</html>
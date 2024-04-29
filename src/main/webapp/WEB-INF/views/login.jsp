<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- login.jsp -->
	<s:form action="login">
		<s:textfield key="username" label="Username" />
		<s:password key="password" label="Password" />
		<s:submit value="Login" />
	</s:form>
</body>
</html>
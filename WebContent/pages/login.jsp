<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<h1>Please Login!!!!</h1>
<s:form action='login_action'>
	<s:textfield name="user.name" label="User Name"/>
	<s:textfield name="user.password" label="User Password"/>
	<s:submit value="Login"/>
</s:form>

</body>
</html>
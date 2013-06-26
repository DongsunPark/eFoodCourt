<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Basic Struts 2 Application - Welcome in test2 mode</title>
</head>
<body>

<s:form action='requestDispatcher_action'>
	<s:hidden name="nextTiles" value="login_tiles"/>
	<s:submit value="Login"/>
</s:form>

<s:form action='requestDispatcher_action'>
	<s:hidden name="nextTiles" value="register_tiles"/>
	<s:submit value="Register"/>
</s:form>

<a href="<s:url action="requestDispatcher_action">
    <s:param name="nextTiles">login_tiles</s:param>
</s:url>">login</a>



</body>
</html>


<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@taglib prefix="s" uri="/struts-tags"%>

<a href="<s:url action="home_action"/>">Home</a><br/>
<a href="<s:url action="requestDispatcher_action">
    <s:param name="nextTiles">login_tiles</s:param>
</s:url>">Login</a>
<br/>
<a href="<s:url action="requestDispatcher_action">
    <s:param name="nextTiles">register_tiles</s:param>
</s:url>">Register</a>


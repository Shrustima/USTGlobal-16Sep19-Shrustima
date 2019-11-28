<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="msg" class="java.lang.String" scope="request"/>
<%
String id = "";
Cookie[] cookies = request.getCookies();
if(cookies!=null) {
	for(Cookie cookie : cookies) {
		if(cookie.getName().equals("alwaysRemember")) {
			id = cookie.getValue();
		}
	}
}
%>
<body>
<h4><%=msg%></h4>
<fieldset align='center'>
<legend>Login</legend>
		<form action='./login' method='post'>
		<table>
		
		<tr>
		<td>Id:</td>
		<td><input name='id' type='number' value='<%=id%>'></td>
		</tr>
		
		<tr>
		<td>Password:</td>
	<td><input name ='password' type = 'password'></td>
	
		</tr>
		
		<tr>
		<td><input name ='rememberme' type = 'checkbox' value='checked'></td>
	<td>Remember Me</td>
		</tr>
		
		<tr>
		<td><input name ='reset' type = 'reset'></td>
		<td><input value='login' type='submit'></td>
		</tr>
		
		</table>
	</form>
		
		</fieldset>
<a href='./register.html'>Click here to register</a>


</body>
</html>
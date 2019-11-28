<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="msg" class="java.lang.String" scope="request"/>
<body>
 <a style="float:right" href="./home">Home</a>      <a href="./logout">Logout</a>
 <h4><%=msg%></h4>
<fieldset allign="center">
<legend>Change Password</legend>

<form action="./changepassword" method="post">

<table align="center">

			<tr>
				<td>New Password</td>
				<td><input name="password" type="password"></td>
			</tr>

			<tr>
				<td>Confirm Password</td>
				<td><input name="confirmpassword" type="Password"></td>
			</tr>
			<tr>
				<td><input type="reset" value="Reset"></td>
				<td><input type="submit" value="Change passord"></td>
			</tr>
</table>

</form>
</fieldset>
</body>
</html>
<%@page import="com.ustglobal.empspringmvc.dto.EmployeeBean" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% 
    EmployeeBean bean = (EmployeeBean)session.getAttribute("bean");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<a href="./home">Home</a>
	<a href="./logout" style="float: right;">Logout</a>
	
	<fieldset>
		<legend>Update Profile</legend>
		<form action="./updateprofile" method="post">
			<table>

				<tr>
					<td>NAME:</td>
					<td><input type="text" name="name" value="<%=bean.getName()%>"></td>
				</tr>


<tr>
					<td>PASSWORD:</td>
					<td><input type="password" name="password" value="<%=bean.getPassword()%>"></td>
				</tr>
				<tr>
					<td>EMAIL:</td>
					<td><input type="email" name="email" value="<%=bean.getEmail()%>"></td>
				</tr>

				

				<tr>
					<td>DOJ:</td>
					<td><input type="date" name="doj"></td>
				</tr>

				
				<td><input type="reset" value="Reset">
					<td><input type="submit" value="Update"></td>
				</tr>


			</table>
		</form>
		<h3>${msg}</h3>


	</fieldset>
	
</body>
</html>
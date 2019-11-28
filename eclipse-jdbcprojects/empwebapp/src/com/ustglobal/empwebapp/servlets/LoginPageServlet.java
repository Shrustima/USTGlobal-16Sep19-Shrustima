package com.ustglobal.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login.html")
public class LoginPageServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();

		String id = "";
		Cookie[] cookies = req.getCookies();
		if(cookies!=null) {
			for(Cookie cookie : cookies) {
				if(cookie.getName().equals("alwaysRemember")) {
					id = cookie.getValue();
				}
			}
		}
		out.println("<html>");
		out.println("<fieldset align='center'>");
		out.println("<legend>Login</legend>");
		out.println("<form action='./login' method='post'>");
		out.println("<table>");
		out.println("<tr>");
		out.println("<td>Id:</td>");
		out.println("<td><input name='id' type='number' value='"+id+"'></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td><td><input name ='password' type = 'password'></td>Password:</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td><input name ='rememberme' type = 'checkbox' value='checked'></td>");
		out.println("<td>Remember Me</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td><input name ='reset' type = 'reset'></td>");
		out.println("<td><input value='login' type='submit'></td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("</form>");
		out.println("<a href='./register.html'>Click here to register</a>");
		out.println("</fieldset>");
		out.println("</html>");


	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		doGet(req, resp);
	
	}
}

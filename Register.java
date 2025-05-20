package com.sid.controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Register")
public class Register extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		String name=req.getParameter("name");
		String age=req.getParameter("age");
		String add=req.getParameter("add");
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		out.println("<h2>Name : </h2>" + name);
		out.println("<h2>Age : </h2>" + age);
		out.println("<h2>Address : </h2>" + add);
		out.println("<h2>Email-Id : </h2>" + email);
		out.println("<h2>Password : </h2>" + pass);
	}
}


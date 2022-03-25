package com.trong.BaiTapSpringMVCFirst.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try (PrintWriter out = response.getWriter()) {
			String username= request.getParameter("username");
			String[] hobbies= request.getParameterValues("hobbies");
			String country= request.getParameter("country");
			
			out.println("<h1>User name:"+username+"</h1>");
			out.println("<h1>");
			for(String item: hobbies) {
				out.println("Hobbies:"+item+",");
			}
			out.println("</h1>");
			out.println("<h1>Country :"+country+"</h1>");

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

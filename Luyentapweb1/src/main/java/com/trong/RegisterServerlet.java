package com.trong;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class RegisterServerlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@GetMapping(value = {"/register","/",""})
	public String getRegister() {
		
		return "register";
		
	}
	@RequestMapping(value = { "/register" }, method = RequestMethod.GET)
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 req.getRequestDispatcher("register").forward(req, resp);
		 
	}

	@Override
	@RequestMapping(value = { "/register" },method = RequestMethod.POST)
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username= req.getParameter("username");
		String password= req.getParameter("password");
		String gender  = req.getParameter("gender");
		String married= req.getParameter("married");
		String nationality= req.getParameter("nationality");
		
		String[] favorites= req.getParameterValues("favorites");
		String note =req.getParameter("note");
		
		req.setAttribute("username", username);
		req.setAttribute("password", password);
		req.setAttribute("gender", gender);
		req.setAttribute("married", married);
		req.setAttribute("nationality", nationality);
		
		StringBuilder sb= new StringBuilder();
		for (String item: favorites) {
			sb.append(item).append(", ");
		}
		req.setAttribute("favorites", sb.toString());
		req.setAttribute("note", note);
		req.getRequestDispatcher("register.html").forward(req, resp);
	}
	
}

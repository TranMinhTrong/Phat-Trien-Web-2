package com.trong.BaiTapSpringMVCFirst.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeCyclleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroy method");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Init method");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doget method");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("do Post method");
	}

}

package com.trong.BaiTapSpringMVC.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class TamGiacServLet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/tamGiac.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uri = request.getRequestURI();
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/tamGiac.jsp");

		String aSt = request.getParameter("a");
		String bSt = request.getParameter("b");
		String cSt = request.getParameter("c");

		float a = Float.parseFloat(aSt);
		float b = Float.parseFloat(bSt);
		float c = Float.parseFloat(cSt);

		if ((a + b > c) && (b + c > a) && (a + c > b)) {
			if (uri.contains("chuvi")) {
				float cv = tinhChuVi(a, b, c);
				request.setAttribute("message", "Chu vi tam giac = " + cv);
			} else {
				float dt = tinhDienTich(a, b, c);
				request.setAttribute("message", "Dien tich tam giac = " + dt);
			}
		} else {
			request.setAttribute("message", "cac canh tam giac khong hop le");
		}
		rd.forward(request, response);

	}

	private float tinhDienTich(float a, float b, float c) {
		// TODO Auto-generated method stub
		float s = (a + b + c) / 2;
		float dt = (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));
		return dt;
	}

	private float tinhChuVi(float a, float b, float c) {
		// TODO Auto-generated method stub
		return a + b + c;
	}

}

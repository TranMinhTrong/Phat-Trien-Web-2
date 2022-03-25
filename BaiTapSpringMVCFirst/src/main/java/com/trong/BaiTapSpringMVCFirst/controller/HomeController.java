package com.trong.BaiTapSpringMVCFirst.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/home/")
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("register");
	}
	
	@RequestMapping("index")
	public String trangChu() {
		return "index";
	}
	
	@RequestMapping("about")
	public String gioiThieu() {
		return "about";
	}
	@RequestMapping("register")
	public String register() {
		return "register";
	}
	
}

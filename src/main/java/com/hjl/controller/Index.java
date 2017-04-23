package com.hjl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Index
 *
 * @author hjl
 * @date 2017/4/23
 */
@Controller("index")
@RequestMapping("/test")
public class Index {
	
	
	@RequestMapping("redirect")
	public String test(HttpServletResponse response , RedirectAttributes attr){
		attr.addFlashAttribute("code", "999999");
		attr.addFlashAttribute("state", "777777");
		return "redirect:http://localhost:8080/test/login";
	}
	
	
	@RequestMapping("login")
	public String login(HttpServletRequest request ,String code , String state){
		HttpSession session = request.getSession();
		session.setAttribute("code" ,code);
		session.setAttribute("state" , state);
		return "redirect:http:localhost:8080/index.jsp";
	}
	
	
	public static void print(Object o) {
		System.out.print(o);
	}
	
	public static void println(Object o) {
		System.out.println(o);
	}
	
	public static void main(String[] args) {
		
	}
}

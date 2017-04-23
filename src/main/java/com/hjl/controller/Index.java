package com.hjl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

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
	public String test(HttpServletResponse response){
		
		return "redirect:http://baidu.com";
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

package br.com.alura.mvc.mundi.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	@GetMapping("/hello")
	public String Hello(HttpServletRequest Request) {
		Request.setAttribute("nome", "Mundo");
		return "hello";
	}

}

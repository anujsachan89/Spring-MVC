package com.spring.test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldSpring {
	@RequestMapping("/hello")
	public ModelAndView helloWorld() {
		String message = "HELLO HOW ARE YOU FEELING TODAY ?";
		return new ModelAndView("page", "message", message);
	}
	@RequestMapping("/login")
	public ModelAndView helloworld(){
		String message1 = "HELLO YOU ARE AT LOGIN PAGE ";
		return new ModelAndView("page", "message", message1);
		
	}
}

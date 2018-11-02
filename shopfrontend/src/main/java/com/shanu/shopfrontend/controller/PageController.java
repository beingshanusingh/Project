package com.shanu.shopfrontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	
	
	
	@RequestMapping(value= {"/","home","index"})
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		
		mv.addObject("Hello", "Hello World! in Spring");
		
		return mv;
	} 
	

}

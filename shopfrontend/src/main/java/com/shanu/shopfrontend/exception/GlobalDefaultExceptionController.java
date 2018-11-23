package com.shanu.shopfrontend.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalDefaultExceptionController {

	
	
	
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ModelAndView handlerNoHandlerFoundException() {
		
		ModelAndView mv = new ModelAndView("error");
		
		mv.addObject("errorTitle", "The Page is not Constructed");
		mv.addObject("errorDescription", "The Page is not Available");
		mv.addObject("title", "404 Error");
		return mv;
	}
	/*To Handle Product Exception*/
	@ExceptionHandler(ProductNotFoundException.class)
	public ModelAndView productNotFoundException() {
		
		ModelAndView mv = new ModelAndView("error");
		
		mv.addObject("errorTitle", "Product Not Found");
		mv.addObject("errorDescription", "No Product Available");
		mv.addObject("title", "404 Error");
		return mv;
	}
	
	/*To Handle Category Exception*/
	@ExceptionHandler(CategoryNotFoundException.class)
	public ModelAndView categoryNotFoundException() {
		
		ModelAndView mv = new ModelAndView("error");
		
		mv.addObject("errorTitle", "Category Not Found");
		mv.addObject("errorDescription", "No Category Available");
		mv.addObject("title", "404 Error");
		return mv;
	}
	/*To Handle General Exception*/
	@ExceptionHandler(Exception.class)
	public ModelAndView noException(Exception ex) {
		
		ModelAndView mv = new ModelAndView("error");
		
		mv.addObject("errorTitle", "Contact The Service Adminstrator");
		mv.addObject("errorDescription", ex.toString());
		mv.addObject("title", "Error");
		return mv;
	}
	
}


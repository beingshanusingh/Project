package com.shanu.shopfrontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shanu.shopbackend.dao.CategoryDAO;
import com.shanu.shopbackend.dto.Category;

@Controller
public class PageController {
	
	
	/*Create an Instance of CategoryDAO.java interface and add the data to the Front end
	 * but before  @Aautowired the Interface here with the CategoryDAOImpl
	 *  @Repositry("addCategoryList") and use the method list()*/
	@Autowired
	private CategoryDAO addCategoryList;
	
	
	// Page Mapping for HomePage
	@RequestMapping(value= {"/","home","index"})
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
		mv.addObject("userClickHome", true);
		//Adding Category Data from the CategoryDAO interface List
		mv.addObject("categories", addCategoryList.list());

		return mv;
	} 
	
	//Page Mapping for About us
	@RequestMapping(value = "/about")
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About Us");
		mv.addObject("userClickAboutUs", true);

		return mv;
	} 
	
	@RequestMapping(value = "/contact")
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact Us");
		mv.addObject("userClickContactUs", true);

		return mv;
	} 
	 
	//For Show all products
	@RequestMapping(value = "/show/all/products")
	public ModelAndView showAllProducts() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Shop");
		mv.addObject("categories", addCategoryList.list());
		mv.addObject("userClickAllProducts", true);

		return mv;
	} 
			
	//For Side Bar For Show all products
		@RequestMapping(value = "/show/category/{id}/products")
		public ModelAndView showCategoryProducts(@PathVariable("id") int id ) {
			ModelAndView mv = new ModelAndView("page");
			mv.addObject("categories", addCategoryList.list());
			//Category DAO to fetch a single Category.
			Category category = null;
			category = addCategoryList.get(id);
			//For Single Category
			mv.addObject("category", category);
			mv.addObject("title", category.getName());
			mv.addObject("userClickCategoryProducts", true);

			return mv;
		} 	
	
	
	} 
	


package com.shanu.shopfrontend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shanu.shopbackend.dao.ProductDAO;
import com.shanu.shopbackend.dto.Product;

@Controller
@RequestMapping("/json/data")
public class JsonDataController {

	/*
	 * To fetch the products that we have added and pass it to the List<Product>
	 * getAllProducts method.
	 */
	@Autowired
	private ProductDAO productDAO;

	/*
	 * To send the list of active products
	 * @ResponseBody annotation will pass the data in the form of JSON to the view.
	 * It will connect automatically through the backend product which we have
	 * mentioned.
	 */
	@RequestMapping("/all/products")
	@ResponseBody
	public List<Product> getAllProducts() {
		return productDAO.listActiveProducts();
	}
	
	@RequestMapping("/category/{id}/products")
	@ResponseBody
	public List<Product> getActiveProductsByCategory(@PathVariable int id){
		return productDAO.listActiveProductsByCategory(id);
	}  
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

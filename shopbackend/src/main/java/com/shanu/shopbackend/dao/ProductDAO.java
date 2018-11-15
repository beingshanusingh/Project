package com.shanu.shopbackend.dao;

import java.util.List;

import com.shanu.shopbackend.dto.Product;

public interface ProductDAO {
	
	
	
	
	
	//To Fetch One Product Based on it's ID.
	Product get(int productId);
	//To add the products Inside a ist
	List<Product> list();
	
	//To check the product CRUD
	boolean add(Product product);
	boolean update(Product product);
	boolean delete(Product product);
	
	
	//Business Methods to check the product details based on it's prefrences.
	List<Product> listActiveProducts();
	List<Product> listActiveProductsByCategory(int categoryId);
	List<Product> getLatestActiveProducts(int count);
	
	
}

package com.shanu.backend.dao;

import java.util.List;

import com.shanu.shopbackend.dto.Category;

public interface CategoryDAO {
	
	/*Creating a Category type casted variable List which we have created in Category.java class and a method list()*/
	List<Category> list();	
	
	/*To fetch the category based on it's ID, Category.java Class */
	Category get(int id);

}

package com.shanu.shopbackend.dao;

import java.util.List;

import com.shanu.shopbackend.dto.Category;

public interface CategoryDAO {

	/*
	 * Creating a Category type casted variable List which we have created in
	 * Category.java class and a method list()
	 */
	List<Category> list();

	/* To fetch the category based on it's ID, Category.java Class */
	Category get(int id);

	// To check the category is added or not
	boolean add(Category category);

	// To update the category
	boolean update(Category category);

	// To delete the category
	boolean delete(Category category);

}

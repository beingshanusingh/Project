 package com.shanu.backend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.shanu.backend.dao.CategoryDAO;
import com.shanu.shopbackend.dto.Category;





//Here the @Repositary is Auto Wired in pagecontroller.java where we are calling the data of the list.
@Repository("addCategoryList")
public class CategoryDAOImpl implements CategoryDAO {
	
	
/* Implemented the List of Category in which we will store the data. */
	private static List<Category> categories = new ArrayList<>();
	
	static {
		/*Category.java class is used here and an object is created and data is been set
		 *  and It will be added inside the 
		 *  Category List Generic   */
		
		//First category
		Category category = new Category();
		category.setId(1);
		category.setName("Mobile");
		category.setDescription("This is a Mobile");
		category.setImageURL("CAT_1.png");
		/*All the data is added inside the categories ArrayList Index 1*/
		categories.add(category);
		
		//Second Category
		category = new Category();
		category.setId(2);
		category.setName("Television");
		category.setDescription("This is a Television");
		category.setImageURL("CAT_2.png");
		/*All the data is added inside the categories ArrayList Index 2*/
		categories.add(category);
		
		//Third Category
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is a Laptop");
		category.setImageURL("CAT_1.png");
		/*All the data is added inside the categories ArrayList Index 3*/
		categories.add(category);
		
		
	}
		
	
	
	@Override
	public List<Category> list() {
		
		//Return the list that we added inside the static block to CategoryDAO Interface.
		return categories;
	}

}

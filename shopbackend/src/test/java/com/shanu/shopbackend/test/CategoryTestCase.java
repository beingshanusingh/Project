package com.shanu.shopbackend.test;

import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.shanu.shopbackend.dao.CategoryDAO;
import com.shanu.shopbackend.dto.Category;

public class CategoryTestCase {

	
	
	
	
	/* Load all the variables */
	/* Used to Access all the beans */
	private static AnnotationConfigApplicationContext context;
	private static CategoryDAO categoryDAO;
	private Category category;

	@BeforeClass
	public static void init() {
			context = new AnnotationConfigApplicationContext();
			context.scan("com.shanu.shopbackend");
			context.refresh();
			categoryDAO = (CategoryDAO)context.getBean("addCategoryList");
		}
	
//For Adding Category
/*	@Test
	public void testAddCategory() {
		category = new Category();
		category.setName("Television");
		category.setDescription("Thi is a test Case");
		category.setImageURL("CAT_Test.png");
		assertEquals("Succesfully Added the Category", true, categoryDAO.add(category));
	}*/
	
	
	//To fetch the single category
	/*
	@Test
	public void testGetCategory() {
		category= categoryDAO.get(1);
		assertEquals("Succesfully Fetch the single category", "Television", category.getName());
	}
	*/
	
	//To Update the category
	/*
	@Test
	public void testUpdateCategory() {
		category= categoryDAO.get(1);
		category.setName("TV");
		assertEquals("Succesfully UPDATED", true, categoryDAO.update(category));
	}
*/	
	/*
	@Test
	public void testActivateCategory() {
		category= categoryDAO.get(1);
		assertEquals("Succesfully UPDATED", true, categoryDAO.delete(category));
	}
	*/
	
	/*
	 * To fetch the Active Category from the database.
	 
	
	@Test
	public void testListCategory() {
		assertEquals("Succesfully fetch the list of category from the table", 3, categoryDAO.list().size());
}
*/
	
	

		
		
	
	

}

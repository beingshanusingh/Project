package com.shanu.shopbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shanu.shopbackend.dao.ProductDAO;
import com.shanu.shopbackend.dto.Product;

public class ProductTestCase {

	private static AnnotationConfigApplicationContext context;

	private static ProductDAO productDAO;
	private Product product;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.shanu.shopbackend");
		context.refresh();
		productDAO = (ProductDAO) context.getBean("productDAO");

	}

	@Test
	public void testCRUDProduct() {

		/*
		 * To add the product into product Category add() method product = new
		 * Product(); product.setName("Oppo Selfie S53"); product.setBrand("Oppo");
		 * product.setDescription("This is some description for oppo mobile phones!");
		 * product.setUnitPrice(25000); product.setActive(true);
		 * product.setCategoryId(3); product.setSupplierId(3);
		 * assertEquals("Something went Wrong", true, productDAO.add(product));
		 */

		/*
		 * To update The product by it's id update() method. product= productDAO.get(2);
		 * product.setName("Samsung Galaxy S7");
		 * assertEquals("Something went wrong while updating the product",true,
		 * productDAO.update(product));
		 */

		/*
		 * To Deactiave/Delete the product product = productDAO.get(7);
		 * product.setActive(false);
		 * assertEquals("Something Went Wrong While Deleting the product",true,
		 * productDAO.delete(product));
		 */

		/*
		 * To get the product list.
		 * 
		 * assertEquals("Something went Wrong While Getting the list",7,productDAO.list(
		 * ).size());
		 */

	}

	/*
	 * To test the factory methods
	 * 
	 * @Test public void testListActiveProducts() {
	 * assertEquals("Something Went Wrong",6,productDAO.listActiveProducts().size())
	 * ; }
	 */

	/*
	 * To test the active products based on it's category.
	 * 
	 * @Test public void testListActiveProductsByCategory() {
	 * assertEquals("Something went wrong",4,productDAO.listActiveProductsByCategory
	 * (3).size()); }
	 */

	/*
	 * To test the latest active product
	 * 
	 * @Test public void testGetLatestActiveProducts() {
	 * assertEquals("Something went Wrong",3,productDAO.getLatestActiveProducts(3).
	 * size()); }
	 */

}

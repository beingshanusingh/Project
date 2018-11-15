 package com.shanu.shopbackend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.shanu.shopbackend.dao.CategoryDAO;
import com.shanu.shopbackend.dto.Category;

//Here the @Repositary is Auto Wired in pagecontroller.java where we are calling the data of the list.
@Repository("addCategoryList")
@Transactional
public class CategoryDAOImpl implements CategoryDAO {
	
	/* To test the Category added or not through Hibernate Boolean*/
	@Autowired
	private SessionFactory sessionFactory;
		
	/*
	 * To Fetch the active Category from the database.
	 * selectActiveCategory is the HQL hibernate language that will be later converted to SQL query. 
	 * Please be sure about the ENTITY name.It Should be same as mentioned in the Category.java
	 * 
	 * Query is from Hibernate Query Interface. It will convert The HQL to SQL automatically 
	 * and will fetch the datta from the database.
	 * 
	 * */
	@Override
	public List<Category> list() {
		String selectActiveCategory="FROM Category WHERE active = :active";
		return sessionFactory.getCurrentSession().createQuery(selectActiveCategory,Category.class).setParameter("active", true)
				.getResultList();
		
		
	}


//For retrieving single category ID
	@Override
	public Category get(int id) {
		
		return sessionFactory.getCurrentSession().get(Category.class, Integer.valueOf(id));
	} 

/*
 * To add the category
 * */
	@Override
	public boolean add(Category category) {
		
		try {
			//Add the category to the database table
			sessionFactory.getCurrentSession().persist(category);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

/*
 * To Update the category
 * */
	@Override
	public boolean update(Category category) {
		try {
			//Add the category to the database table
			sessionFactory.getCurrentSession().update(category);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	
	/*
	 * To Delete or Unactiavted 
	 */

	@Override
	public boolean delete(Category category) {
		category.setActive(false);
		try {
			//Add the category to the database table
			sessionFactory.getCurrentSession().update(category);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

}

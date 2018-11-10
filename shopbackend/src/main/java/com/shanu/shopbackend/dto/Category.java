
package com.shanu.shopbackend.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*For the Category for the products. Use to send the data to the Database*/

/*@Entity is used to map with the database with the help of Hibernate Persistence API*/

/*
 * If you will  not specify entity 
 * then it will get by default Class name as entity name.
 * */
@Entity
public class Category {
	
	
	/* Private field */
	@Id //Auto Increment 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String description;
	
	@Column(name="image_url") //To match the name with the database 
	private String ImageURL;
	
	@Column(name="is_active")//To match the name with the database 
	private boolean active;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImageURL() {
		return ImageURL;
	}
	public void setImageURL(String imageURL) {
		ImageURL = imageURL;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", description=" + description + ", ImageURL=" + ImageURL
				+ ", active=" + active + "]";
	}

}

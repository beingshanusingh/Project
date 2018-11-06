package com.shanu.shopbackend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages="com.shanu.shopbackend.dto")
@EnableTransactionManagement
public class HibernateConfig {

	
	private final static String DATABASE_URL="jdbc:mysql://localhost/shopdb";
	private final static String DATABASE_DRIVER="com.mysql.jdbc.Driver";
	private final static String DATABASE_DIALECT="org.hibernate.dialect.MySQLDialect";
	private final static String DATABASE_USERNAME="root";
	private final static String DATABASE_PASSWORD="root";
	
	
	
	/*DataSource Interface is used to create an object once 
	 * will be used by the connection every time it will be called
	 * from the Connection Pool*/
	@Bean
	public DataSource getDataSource() {
		
		/*This class is used to combine dbcp and Connection pool combine.  */
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(DATABASE_DRIVER);
		dataSource.setUrl(DATABASE_URL);
		dataSource.setUsername(DATABASE_USERNAME);
		dataSource.setPassword(DATABASE_PASSWORD);
		return dataSource;
		
	}
	
	/*Session Factory Interface will be created to generate various session. 
	 * and dataSource Bean is passed as an argument*/
	@Bean 
	public SessionFactory getSessionFactory(DataSource dataSource) {
		
		
		/*Creating a LocalessionFactory builder object with the dataSource */
		LocalSessionFactoryBuilder builder = new LocalSessionFactoryBuilder(dataSource);
		builder.addProperties(getHibernateProperties());
		builder.scanPackages("com.shanu.shopbackend.dto");
		
		/*Return to buildSessionFactory() method. Hibernate Inbuilt Method */
		return builder.buildSessionFactory();
		
	}
   // Private method to pass the dialect and few other properties to SessionFactory
	private Properties getHibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.dialect", DATABASE_DIALECT);
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.format_sql", "true");
	
		return properties;
	}
	
	/*sessionFactory Bean passed as an argument*/
	@Bean 
	public HibernateTransactionManager getTranscationManager(SessionFactory sessionFactory) {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
		return transactionManager;
		
	}
	
}

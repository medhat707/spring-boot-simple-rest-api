package com.waytodev.cruddemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
/*
 * i connected this app with oracle db not mysql
 * configuration is in the properties file
 * second i turned off this annoying spring characters which comes when app starts
 * third i cancelled all logging stuff and just showed the warning and errors on console
 * now i created a new package and inside it a Student class to map  the db table
 * inside the class we created constructors. setters and getters and toString method
 */

import com.waytodev.cruddemo.dao.EmployeeDAO;
import com.waytodev.cruddemo.dao.StudentDAO;
import com.waytodev.cruddemo.entity.Employee;
import com.waytodev.cruddemo.entity.Student;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.waytodev.cruddemo.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;


/*--------------------RREVIOUS LESSON -----------------------
 * the idea here is to have an interface that has all CRUD methods
 * integrated and once i entend this class i will have an access
 * to all these CRUD operations
 * NO NEED TO CREATE A DAO INTERFACE
 * behid the scenes: 
 * 1. spring creates the implementation of JpaRepository interface (proxy class(
 * 2. spring creates an object from this proxy class 
 * 3. when we add the JpaRepository to our service
 * 4. Spring will inject this proxy class into this service
 * STEPS:
 * 1. create the class and extend the JpaRepository
 * 2. go to the service class, delete the DAO and inject the JpaRepository
/*--------------------CURRENT LESSON -----------------------
 * in this lesson we make use of spring data rest 
 * in short, we let spring create a rest api for us 
 * that means we don't need service layer or a rest controller
 * STEPS
 * 1. inject the spring data rest dependency to pom.xml
 * 2. go ahead and delete the service package and controller package
 * 3. we only need 3 items [entity, dao, pom entry]
 * 4. Optional:: we can customize our end point paths in the properties file
 * 5. when using update method we have to give the id in the URL 
 * and not giving it as json data
 */
 
 


@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) 
	{
		SpringApplication.run(CruddemoApplication.class, args);
	}
}







package com.waytodev.cruddemo.entity;

import jakarta.annotation.Generated;
import jakarta.annotation.sql.DataSourceDefinition;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

//Entity means this java class will be mapped to the db table "student"
@Entity
@Table(name="student")
public class Student {
	//define fields
	//generatedvalue for getting new id everytime i run the program 
	//note here this sequence must match the sequence in the oracle db
	//so i created a sequence in oracle called my_sequence
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_sequence")
	@SequenceGenerator(name = "my_sequence", sequenceName = "my_sequence", allocationSize = 1)
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name="last_name")
	private String last_name;
	
	@Column(name="email")
	private String email;
	
	
	//define constructors
	public Student() {
	}
	
	// constructor with arguments
	public Student(String first_name, String last_name, String email) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
	}
	
	//define setters and getters
	public String getFirst_name() {
		return first_name;
	}


	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	//define toString() method
	@Override
	public String toString() {
		return "Student [id=" + id + ", first_name=" + first_name + 
				", last_name=" + last_name + ", email=" + email
				+ "]";
	}
	
}

package com.hsbc.model.beans;

import com.hsbc.test.Gender;

public class Employee {
	private int id;
	private String name;
	//private String gender;
	
	private Gender gender;
	public Employee(int id, String name, Gender gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + "]";
	}
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
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	
	
}

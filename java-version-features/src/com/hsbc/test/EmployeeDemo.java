package com.hsbc.test;

import com.hsbc.model.beans.Employee;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee emp1 = new Employee(100, "Alexandar", Gender.MALE);
		System.out.println(emp1);
		Employee emp2 = new Employee(200, "Jennifer", Gender.FEMALE);
		System.out.println(emp2);
		
		System.out.println(Gender.MALE);
		System.out.println(Gender.FEMALE);
		Gender[] genders = Gender.values();
		for(Gender g : genders) {
			System.out.println("Gender: "+g);
		}
	}

}

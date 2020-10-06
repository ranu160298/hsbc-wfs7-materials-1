package com.hsbc.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeDao {
	private static List<Employee> employees = new ArrayList<Employee>();
	
	public void store(Employee employee) {
		employees.add(employee);
	}
	
	public List<Employee> getEmployees() {
		return employees;
	}
	
	// to get the top3 employees
	public List<Employee> getTop3Employees(String type) {
		// have a new list and iterate the old list to get the top 3 items
		// add those iterated item to the new list and break 
		// after the 3rd iteration
		List<Employee> top3List = new ArrayList<Employee>();
		int counter = 0;
		if(type.equals("dob")) {
			Collections.sort(employees, (e1, e2) -> e1.getDob().compareTo(e2.getDob()));
		}
		for(Employee e : employees) {
			top3List.add(e);
			counter++;
			if(counter == 3) 
				break;
		}
		
		return top3List;
	}
}

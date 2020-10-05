package com.hsbc.java8;

import java.util.ArrayList;
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
	public List<Employee> getTop3Employees() {
		// have a new list and iterate the old list to get the top 3 items
		// add those iterated item to the new list and break 
		// after the 3rd iteration
		
		return null;
	}
}

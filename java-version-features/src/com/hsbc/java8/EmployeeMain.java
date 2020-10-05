package com.hsbc.java8;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		int option = 0;
		Scanner scanner = new Scanner(System.in);
		EmployeeDao dao = new EmployeeDao();
		do {
			System.out.println("1: Store 2: Sort 0: Exit");
			option = scanner.nextInt();
			switch(option) {
			case 1 : 
				Employee employee = new Employee();
				System.out.println("Enter id:");
				employee.setId(scanner.nextInt());
				System.out.println("Enter name:");
				employee.setName(scanner.next());
				System.out.println("Enter salary");
				employee.setSalary(scanner.nextDouble());
				System.out.println("Enter dob (yyyy-MM-dd)");
				LocalDate dob = LocalDate.parse(scanner.next());
				employee.setDob(dob);
				dao.store(employee);
				break;
			case 2: 
				// few more options should be asked
				System.out.println("You want to sort by 1: Id in Asc 2: Id in Desc 3: DOB in Asc 4: DOB in Desc 5: Salary in Asc 6: Salary in Desc");
				option = scanner.nextInt();
				List<Employee> employees = dao.getEmployees();
				if(option == 1) {
					Collections.sort(employees, (e1, e2) -> e1.getId() - e2.getId());
					System.out.println(employees);
				} if (option == 2) {
					
				} if (option == 3) {
					Collections.sort(employees, (e1, e2) -> e1.getDob().compareTo(e2.getDob()));
					System.out.println(employees);
				} if (option == 4) {
					
				}
				break;
			}
		} while(option != 0);
	}

}

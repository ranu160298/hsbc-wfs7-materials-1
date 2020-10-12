package com.hsbc;

import org.springframework.stereotype.Repository;

@Repository
public class CustomerDaoImpl2 implements CustomerDao {

	public CustomerDaoImpl2() {
		System.out.println("CustomerDaoImpl2() created");
	}
	@Override
	public void createCustomer() {
		System.out.println("createCustomer inside CustomerDaoImpl2");
	}

}

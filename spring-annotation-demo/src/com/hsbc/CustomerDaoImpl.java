package com.hsbc;

import org.springframework.stereotype.Repository;

// by default bead id will be classname, but first letter will be in lowercase
@Repository
public class CustomerDaoImpl implements CustomerDao {

	public CustomerDaoImpl() {
		System.out.println("CustomerDaoImpl() created");
	}
	@Override
	public void createCustomer() {
		System.out.println("createCustomer() inside CustomerDaoImpl");
	}

}

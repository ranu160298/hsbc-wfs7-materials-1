package com.hsbc.model.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

	@Override
	public String fetchUserById(int id) {
		if(id == 100) 
			return "MS Dhoni";
		return "Virat Kholi";
	}

}

package com.example.springbootrevision;

import java.util.List;

public interface UserService {
	public List<User> getAllUsers();
	public List<User> getAllUsersSortByDob();
	public List<User> getAllUsersSortByName();
	
	public List<User> getUserByName(String name);
	
	
}

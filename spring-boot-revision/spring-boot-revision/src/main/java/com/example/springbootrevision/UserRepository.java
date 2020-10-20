package com.example.springbootrevision;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Integer>{

	@Query(value = "select u from User u")
	public List<User> getAllUsers();
	
	@Query(value = "select u from User u where u.name = ?1")
	public List<User> getUserByName(String name);
	
	
}

package com.example.springbootrevision;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getAllUsers() {
		
		return userRepository.getAllUsers();
	}

	@Override
	public List<User> getAllUsersSortByDob() {
		
		return getAllUsers().stream().sorted((d1, d2) -> d1.getDob().compareTo(d2.getDob())).collect(Collectors.toList());
	}

	@Override
	public List<User> getAllUsersSortByName() {
		// TODO Auto-generated method stub
		return getAllUsers().stream().sorted((n1, n2) -> n1.getName().compareTo(n2.getName())).collect(Collectors.toList());
	}

	@Override
	public List<User> getUserByName(String name) {
		// TODO Auto-generated method stub
		return userRepository.getUserByName(name);
	}

}

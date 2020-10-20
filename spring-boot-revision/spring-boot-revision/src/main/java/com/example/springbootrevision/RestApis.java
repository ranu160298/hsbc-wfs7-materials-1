package com.example.springbootrevision;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:4201"})
public class RestApis {
	
	@Autowired
	private UserService service;
	
	@RequestMapping(value = "/springTest", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
	public String test() {
		return "hello world";
	}
	@RequestMapping(value = "/getUsers", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<User> getUsersAPI() {
		return service.getAllUsers();
	}
	@RequestMapping(value = "/getUsersDob", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<User> getUsersDobAPI() {
		return service.getAllUsersSortByDob();
	}
	@RequestMapping(value = "/getUsersName", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<User> getUsersNameAPI() {
		return service.getAllUsersSortByName();
	}
	@RequestMapping(value = "/getUsersName/{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<User> getUserByNameApi(@PathVariable("name") String n) {
		return service.getUserByName(n);
	}
}

package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entity.Users;
import com.springrest.springrest.services.UserServices;

@RestController
public class MyController {
	
	@Autowired
	private UserServices userServices;
	
	// get all users
	@GetMapping("/user")
	public List<Users> getUsers(){
		return this.userServices.getUser();
	}
	
	// single user
	@GetMapping("/user/{userId}")
	public Users getUsers(@PathVariable String userId) {
		return this.userServices.getUser(Long.parseLong(userId));
	}
	
	// create user
	@PostMapping(path="/add", consumes="application/json")
	public Users addUser(@RequestBody Users user) {
		return this.userServices.addUser(user);
	}
	
	// Update the users
	@PutMapping("/update")
	public Users updateUser(@RequestBody Users user) {
		return this.userServices.updateUser(user);
	}
	
	
	
	// delete user
	@DeleteMapping("/delete/{userId}")
	public Users deleteUser(@PathVariable String userId) {
		return this.userServices.deleteUser(Long.parseLong(userId));
	}
	
	
}

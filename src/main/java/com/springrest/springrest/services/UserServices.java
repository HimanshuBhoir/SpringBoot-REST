package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entity.Users;

public interface UserServices {

	public List<Users> getUser();
	
	public Users getUser(long userId);

	public Users addUser(Users user);

	public Users deleteUser(long userId);

	public Users updateUser(Users user);
}

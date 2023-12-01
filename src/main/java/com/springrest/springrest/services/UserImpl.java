package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.entity.Users;
import com.springrest.springrest.repository.UserDao;

@Service
public class UserImpl implements UserServices {
	
//	List<Users> list;
	
	@Autowired
	private UserDao userDao;
	
	public UserImpl() {
		
	}

	@Override
	public List<Users> getUser() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

	@Override
	public Users getUser(long userId) {
		// TODO Auto-generated method stub
		return userDao.findById(userId).orElse(null);
	}

	@Override
	public Users addUser(Users user) {
		// TODO Auto-generated method stub
		userDao.save(user);
		return user;
	}

	@Override
	public Users updateUser(Users user) {
		// TODO Auto-generated method stub
		userDao.save(user);
		return user;
	}

	@Override
	public Users deleteUser(long userId) {
		// TODO Auto-generated method stub
		Users user = userDao.findById(userId).orElse(null);
		userDao.delete(user);
		return user;
	}

}

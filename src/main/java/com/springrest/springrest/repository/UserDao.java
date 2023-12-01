package com.springrest.springrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entity.Users;

public interface UserDao extends JpaRepository<Users, Long>{


}

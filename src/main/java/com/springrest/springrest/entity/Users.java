package com.springrest.springrest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Users {

	@Id
	private long id;
	private String name;
	private int age;
	
	public Users(long id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}

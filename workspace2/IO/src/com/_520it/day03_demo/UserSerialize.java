package com._520it.day03_demo;

import java.io.Serializable;


/*
 * 需要序列化数据的类
 */
public class UserSerialize implements Serializable{
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	transient private int password;
	private String a;
	private String b;
	
	public UserSerialize(String name, int age, int password) {
		super();
		this.name = name;
		this.age = age;
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserSerialize [name=" + name + ", age=" + age + ", password="
				+ password + "]";
	}
	
	
	
}

package com._520it.eclipse;

public class Test extends Object {
	private String name;
	private Integer age;
	private Integer gender;

	public Test(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Test [name=" + name + ", age=" + age + "]";
	}

}

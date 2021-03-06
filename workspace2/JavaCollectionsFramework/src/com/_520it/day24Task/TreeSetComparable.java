package com._520it.day24Task;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetComparable {
	public static void main(String[] args) {
		//测试
		Set<People> people = new TreeSet<>();
		people.add(new People(18, "张三"));
		people.add(new People(86, "李四光"));
		people.add(new People(11, "王麻子"));
		people.add(new People(56, "张家辉"));
		people.add(new People(22, "牛子在"));
		System.out.println(people);
		System.out.println("===================================");
		Set<People> people2 = new TreeSet<>(new Comparator<People>() {
			public int compare(People o1, People o2) {
				return o2.getAge() - o1.getAge();
			}
		});
		people2.add(new People(18, "张三"));
		people2.add(new People(86, "李四光"));
		people2.add(new People(11, "王麻子"));
		people2.add(new People(56, "张家辉"));
		people2.add(new People(22, "牛子在"));
		System.out.println(people2);
	}
}

class People implements Comparable<People>{
	private int age;
	private String name;
	
	
	public People(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public int compareTo(People o) {
		return this.age - o.age;
	}

	public int getAge() {
		return age;
	}


	public String getName() {
		return name;
	}


	public String toString() {
		return "people [age=" + age + ", name=" + name + "]";
	}


	
}

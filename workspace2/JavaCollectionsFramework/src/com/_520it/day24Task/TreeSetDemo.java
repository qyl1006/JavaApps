package com._520it.day24Task;

import java.util.TreeSet;

//演示自然排序  与 定制排序
public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<StudentTest> t = new TreeSet();
		t.add(new StudentTest("小米", 17));
		t.add(new StudentTest("小明", 33));
		t.add(new StudentTest("张三", 12));
		t.add(new StudentTest("大师", 23));
		
		System.out.println(t.size());
		System.out.println(t);
		//========================
		
	}
}

//定义一个类
class StudentTest implements Comparable<StudentTest>{
	private String name;
	private int age;
	
	StudentTest(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public int compareTo(StudentTest other) {
		if(this.age > other.age){
			return 1;
		}else if(this.age < other.age){
			return -1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "StudentTest [name=" + name + ", age=" + age + "]";
	}
	
	
}

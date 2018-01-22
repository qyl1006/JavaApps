package com._520it.day24Task;

import java.util.TreeSet;

//��ʾ��Ȼ����  �� ��������
public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<StudentTest> t = new TreeSet();
		t.add(new StudentTest("С��", 17));
		t.add(new StudentTest("С��", 33));
		t.add(new StudentTest("����", 12));
		t.add(new StudentTest("��ʦ", 23));
		
		System.out.println(t.size());
		System.out.println(t);
		//========================
		
	}
}

//����һ����
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
package com._520it.Set;

import java.util.HashSet;
/*
 * �ܽ�:  �����Ҫ�������Զ���Ķ���洢����ϣ����,������ �Ķ���Ӧ�ø���equals��hashCode����,���ڸ÷������ṩ�Լ����жϹ���.
    ����ʹ��Eclipse�����Զ�����hashCode��equals����.

 */

public class HashSetDemo3 {
	public static void main(String[] args) {
		HashSet set  = new HashSet();
		set.add(new Student(1, "С��", 17));
		set.add(new Student(1, "С��", 18));
		set.add(new Student(2, "����", 17));
		set.add(new Student(4, "����", 17));
		
		System.out.println(set.size());
		System.out.println(set);
	}
}

class Student{
	private Integer ID;
	private String name;
	private Integer age;
	public Student(Integer iD, String name, Integer age) {
		super();
		ID = iD;
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	
}
package com._520it.Set;

import java.util.HashSet;

//��֤HashSet�ж����������Ƿ����  ��ͨ���Ƚ����������equals() �� hashCode() ��Ϊ true  �����
public class HashSetDemo2 {
	public static void main(String[] args) {
		HashSet s = new HashSet();
		s.add(new A());
		s.add(new A());
		s.add(new B());
		s.add(new B());
		s.add(new C());
		s.add(new C());
		System.out.println(s.size());  ///5 
		System.out.println(s);   //������ΪC��ͬһ��  ��ΪC��equals  �� hashCode �Ƚ϶�Ϊtrue
	}
}

class A{
	public int hashCode(){
		return 1;
	}
}
class B{
	public boolean equals(Object obj){
		return true;
	}
}
class C{
	public int hashCode(){
		return 2;
	}
	
	public boolean equals(Object obj){
		return true;
	}
}
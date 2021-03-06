package com._520it.Set;

import java.util.HashSet;

//验证HashSet判断两个对象是否相等  是通过比较两个对象的equals() 与 hashCode() 都为 true  则相等
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
		System.out.println(s);   //它会认为C是同一个  因为C的equals  与 hashCode 比较都为true
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
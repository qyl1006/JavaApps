package com._520it.Linked;

public class LinkedTest {
	public static void main(String[] args) {
		//添加节点 并打印
		MyLinkedDemo my = new MyLinkedDemo();
		my.addNext("A");
		/*my.addNext('B');
		my.addNext('C');
		my.addPrev("4");
		my.addPrev("3");
		my.addPrev(2);
		my.addPrev(1);*/
		System.out.println(my.size);
		System.out.println(my.toString());
		
		my.delete("A");
		System.out.println("=======ening==============");
		System.out.println(my.size);
		System.out.println(my.toString());
	}
}

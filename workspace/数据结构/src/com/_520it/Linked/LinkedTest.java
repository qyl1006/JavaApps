package com._520it.Linked;

public class LinkedTest {
	public static void main(String[] args) {
		//添加节点 并打印
		MyLinkedDemo my = new MyLinkedDemo();
		my.addNext("A");
		my.addNext('B');
		my.addNext(12);
		my.addPrev("D");
		System.out.println(my.toString());
	}
}

package com._520it.day01._04线程安全;

public class TestDemo {
	public static void main(String[] args) {
		//测试
		String str = "凤姐";
		str += "凤姐";
		str += "小明";
		System.out.println(str);

	}
}


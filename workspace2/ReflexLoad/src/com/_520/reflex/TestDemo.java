package com._520.reflex;
/*
 //
 */
import java.util.ArrayList;
import java.util.List;

public class TestDemo {
	public static void main(String[] args) {
		test(12);
		
		List<String> arr = new ArrayList<>();
		System.out.println(arr);
		
		arr.add(null);
		System.out.println(arr);
		arr.remove(null);
		System.out.println(arr);
		
		
		
	}

	private static void test(Integer i) {
		System.out.println("Integer");
	}
	private static void test(int i) {
		System.out.println("int");
		
	}
}

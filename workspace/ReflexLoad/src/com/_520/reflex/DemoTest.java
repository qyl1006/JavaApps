package com._520.reflex;

import java.lang.reflect.Method;
import java.util.Date;

public class DemoTest {
	public static void main(String[] args) throws Exception {
//		Object obj = new java.util.Date();
//		Method c = obj.getClass().getMethod("toLocaleString");
//		System.out.println(c.invoke(obj));
		
		test();
		
	}

	private static void test() throws Exception {
		Date d = new java.util.Date();
		Class c = java.util.Date.class;
		System.out.println(c);
		Method m = c.getMethod("toLocaleString");
		System.out.println(m);
		
		System.out.println(m.invoke(d));
	}
}

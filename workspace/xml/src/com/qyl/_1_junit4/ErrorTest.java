package com.qyl._1_junit4;
/*
 * 纠错练习
 * 报错显示三个Error: 1) 方法是公共静态的,不需要static
 * 					2) 方法有参数 
 *					3) 方法无返回
 */ 

import org.junit.Test;

public class ErrorTest {
//	@Test
//	public static String testError(int a) throws Exception{
//		System.out.println("DOMTest.testError()");
//		return null;
//	}
	
	//纠错后的正常代码
	@Test
	public void testError() throws Exception{
		System.out.println("DOMTest.testError()");
	}
	
}

package com.qyl._1_junit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/*
 * 定义一个测试类 
 * 练习使用JUnit4
 * 注意: 方法是public修饰的 无返回的 该方法上必须贴有@Test标签
 * 
 * 总结: 测试方法必须公共无参无返回 贴有@Test注解
 */
public class EmployeeDAOTest {
	@Test
	public void testPrint1(){
		System.out.println("打印成功1");
	}
	
	@Test
	public void testPrint2(){
		System.out.println("打印成功2");
	}
	
	@After
	public void testPrint3(){
		System.out.println("打印成功3");
	}
	
	@Before
	public void testPrint4(){
		System.out.println("打印成功4");
	}
}

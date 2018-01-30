package com.qyl._1_junit4;

import org.junit.Assert;
import org.junit.Test;

//测试类
public class MathTest {
	private IMath math = new MathImp(); //面向接口编程
	
	@Test
	public void testAdd(){
		int res = math.add(12, 12);
		//断言
		Assert.assertEquals("断言失败",24 , res);
	}
	
	@Test
	public void testRide(){
		int res = math.ride(10, 2);
		
		Assert.assertEquals("断言失败", 5, res);
	}
}

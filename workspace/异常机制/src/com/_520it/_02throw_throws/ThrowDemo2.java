package com._520it._02throw_throws;

public class ThrowDemo2 {
	public static void main(String[] args) {
		
				
		int ret = business(10, 0);
		System.out.println(ret);
			
			
	}
		
		//定义方法
	public static int business(int a, int b)
	{
		try
		{
			int ret = a / b;
			return ret;
		}catch (ArithmeticException e)
		{
			System.out.println("123xx");
		}
		return 0;
	}
}


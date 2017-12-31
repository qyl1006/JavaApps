package com._520it._02throw_throws;


//演示throw的用法
public class ThrowDemo {
	public static void main(String[] args) {
		try
		{	
			int ret = business(10, 0);
			System.out.println(ret);
		}catch(ArithmeticException e)
		{
			System.out.println("除数不能为零");
		}
		
	}
	
	//定义方法
	public static int business(int a, int b)
	{
		if (b == 0) {
			throw new ArithmeticException("除数不能为零");
		}
		int ret = a / b;
		return ret;
	}
}

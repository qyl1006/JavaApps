package com._520it._02throw_throws;

public class ThrowsDemo {
	public static void main(String[] args) {
		
		int ret = business(10, 0);
		System.out.println(ret);
	
		
	}
	
	//���巽��
	public static int business(int a, int b) throws ArithmeticException
	{
		if (b == 0) {
			throw new ArithmeticException("��������Ϊ��");
		}
		int ret = a / b;
		return ret;
	}
}

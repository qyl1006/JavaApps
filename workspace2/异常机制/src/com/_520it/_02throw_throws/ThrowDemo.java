package com._520it._02throw_throws;


//��ʾthrow���÷�
public class ThrowDemo {
	public static void main(String[] args) {
		try
		{	
			int ret = business(10, 0);
			System.out.println(ret);
		}catch(ArithmeticException e)
		{
			System.out.println("��������Ϊ��");
		}
		
	}
	
	//���巽��
	public static int business(int a, int b)
	{
		if (b == 0) {
			throw new ArithmeticException("��������Ϊ��");
		}
		int ret = a / b;
		return ret;
	}
}

package com._520it._03abnormal;

//测试判断用户注册时用户名存在时调用自定义异常类
public class LogicDemo {
	public static void main(String[] args) {
		try
		{
			String entry = "will";
			logon(entry);
		}catch (AbnormalDemo e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}
	//注册
	public static void logon(String s)
	{
		if (new MySqlDemo().query(s))
		{
			throw new AbnormalDemo(s + "已经被注册");
		}
		System.out.println("注册成功");;
	}

}

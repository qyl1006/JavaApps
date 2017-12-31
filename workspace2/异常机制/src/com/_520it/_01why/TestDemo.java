package com._520it._01why;



//finally语句块表示最终都会执行的代码,无论有没有异常
//语法 try----catch---catch----finally  语法2 try-----finally
public class TestDemo {
	public static void main(String[] args) {
		
		int[] arr = new int[]{1, 2, 3, 4};
		String s1 = "12a";
		String s2 = "0s";
		
		try
		{
			
			int a = Integer.parseInt(s1);
			int b = Integer.parseInt(s2);
			int set = a / b;
			System.out.println("商为: " + set);
			System.out.println(arr[111]);
		}catch (ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("除数不能为零");
		}catch (NumberFormatException e)
		{
			e.printStackTrace();
			System.out.println("转换异常");
		}catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("其它异常 大BOSS");
		}finally
		{
			System.exit(0); //接收终止当前正在运行的JVM
			System.out.println("尝试finally--->表示最终都会执行的代码---->关闭资源");
		}
		
		
		System.out.println("enging.......");
	}
	
}



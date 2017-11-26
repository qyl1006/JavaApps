//for循环
public class ForDemo
{
	public static void main(String[] args)
	{
		/*
			for循环:
				格式：
				for(初始化语句;boolean表达式;循环后操作语句)
				{
					循环体语句
				}

		*/
		//需求: 叫100次帅哥
		for (int count = 1; count <= 500 ; count ++ )
		{
			System.out.println("帅哥" + count);
		}

		//需求: 打印1到100
		for (int num = 1; num <= 100 ; num ++ )
		{
			System.out.println(num);
		}

		// 计算1到100所有正整数之和
		int result = 0;
		for (int number = 1; number <= 100 ; number ++)
		{
			result += number;
		}
		System.out.println(result);
		//System.out.println(number); // 这个会报错ForDemo.java:34: 错误: 找不到符号  原因:变量number有作用域
	

	}
}
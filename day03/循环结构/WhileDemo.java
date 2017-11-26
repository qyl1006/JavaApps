//while语句
public class WhileDemo
{
	public static void main(String[] args)
	{
		/*
			while循环:
			格式：
			while(boolean表达式)
			{
					循环体s
			}
			
		*/
		// 需求: 打印500次帅哥
		int count = 0;
		while (count < 500)
		{
			count ++;
			System.out.println("帅哥" + count);	
		}
		System.out.println("ending--------");
		
		
		//需求: 从1数到100 , 打印1---100
		int num = 1;
		while (num <= 100)
		{
			System.out.println(num);
			num ++;
		}

		//需求 : 计算1到100所有正整数之和
		int num1 = 1;
		int result = 0;
		while (num1 <= 100)
		{
			result += num1;
			num1 ++;
		}
		System.out.println(result);

	}

}
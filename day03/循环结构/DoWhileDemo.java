// do while 循环
public class DoWhileDemo
{
	public static void main(String[] args)
	{
		/*
			do while循环:
				格式：
				do
				{
					  循环体语句
				}
				while(boolean表达式);
		*/
		//需求: 叫500胜帅哥,,打印500次帅哥
		int count = 0;
		do
		{
			System.out.println("帅哥" + (count + 1));
			count ++;
		}
		while (count < 500);

		// 打印1到100
		int num = 0;
		do
		{
			
			System.out.println(num+1);
			num ++;
		}
		while (num < 100);

		//需求: 计算1到100所有正整数之和
		int num1 = 1;
		int result = 0;
		do
		{
			result += num1;
			num1 ++;
		}
		while (num1 <= 100);
		System.out.println(result);

	}
}
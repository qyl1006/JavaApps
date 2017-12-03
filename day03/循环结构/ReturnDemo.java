//return控制循环语句
public class ReturnDemo
{
	public static void main(String[] args)
	{
		// return语句 表示结束循环所在的方法(main), 方法都结束了, 循环结构自然页结束了
		for (int i = 1; i <= 10 ; i ++ )
		{
			if (i == 4)
			{
				continue;
			}
			System.out.println(i);
		}
		System.out.println("------ending----");
		System.out.println("============");

		//与 continue 语句 做个比较
		for (int i = 1; i <= 10 ; i ++ )
		{
			if (i == 4)
			{
				return;
			}
			System.out.println(i);
		}
		System.out.println("------ending----"); // return之后,方法结束,自然方法内的return下面的的都不执行
	

	}
}	


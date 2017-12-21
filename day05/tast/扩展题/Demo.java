//测试类
public class Demo
{
	public static void main(String[] args)
	{
		//打印出 [1, 500] 之间是 5 的倍数的之和。
		int sum = 0;
		for (int i = 1;i <= 500 ; i ++ )
		{
			if (i % 5 == 0)
			{
				sum += i;
			}
		}
		System.out.println(sum);
		System.out.println("=================");

		//打印出 [1, 100] 之间最大的 10 个奇数。
		int counter = 0;//计数器
		for (int i = 100; i >= 1  ;i --)
		{
			if (i % 2 != 0)
			{
				System.out.println(i);
				counter ++;
				if (counter == 10)
				{
					return;
				}
			}
		}
		
	}
}

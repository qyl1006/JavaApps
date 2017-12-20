//测试类
public class Demo
{
	public static void main(String[] args)
	{
		//需求2: 找出 [1, 500] 之间偶数的个数。
		int count = 0;// 偶数计数器
		for (int i = 1;i <= 500 ; i++ )
		{
			if (i % 2 == 0)
			{
				count ++;
			}
		}
		//打印
		System.out.println("偶数得个数为:" + count);

		//需求3 [1, 500] 之间能整除 7 的数的总和。求 [1, 1000] 之间能整除3且整除 5 的数个数。
		// 1)
		int sum = 0;// 和
		for (int i = 1;i <= 500 ;i ++ )
		{
			if (i % 7 == 0)
			{
				sum += i;
			}
		}
		System.out.println(sum);

		// 2)
		int count2 = 0;//计数器
		for (int i = 0;i <=1000; i ++ )
		{
			if (i % 3 == 0 && i % 5 == 0)
			{
				count2 ++;
			}
		}
		System.out.println(count2);


		//需求4: 打印 [1, 100] 正方形数，比如 1，4，9，...。 PS 看不懂意思!!!!

	}
}
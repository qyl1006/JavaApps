//全套循环
public class NestedDemo
{
	public static void main(String[] args)
	{
		//需求: 四个人每个人都从1数到100
		for (int m = 0; m < 4 ; m++)
		{
			for (int n = 0; n < 100 ; n++)
			{
				System.out.println(n + 1);
			}
			System.out.println("=================");
		}
		//若外循环的循环次数是m次，内循环的循环次数是n次，那么内层循环的循环次数需要 m * n次。
		//这个嵌套循环一共循环了 4*100 次

		//嵌套实例
		for (int n = 1; n <= 5; n ++ )
		{
			for (int m =1; m <= n ; m ++ )
		    {
				System.out.print("*");
			}
			System.out.println();
		}
	}
		
		
}
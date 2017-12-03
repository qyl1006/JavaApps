//控制循环结构
public class BreakDemo
{
	public static void main(String[] args)
	{
		//break 关键字 结束当前所在的循环
		// 注意 break之后的语句, 执行不到,, 若编写了,则语法报错
		for (int i = 1; i <= 10  ; i ++ )
		{
			System.out.println(i);
			if (i == 5)
			{
				break;
				//System.out.println("==="); // 会报错 
			}
		}
		System.out.println("\t" + "=======");

		// 需求: 打印出1到100前10个4的倍数的数字.
		int count = 0;
		for (int i = 1; i <= 100 ; i ++ )
		{
			if (i % 4 == 0)
			{
				System.out.println(i);
				count ++;
				if (count == 10)
				{
					break;
				}
			}
		}
	}
}
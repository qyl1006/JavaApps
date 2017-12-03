//continue控制循环语句
public class ContinueDemo
{
	public static void main(String[] args)
	{
		// continue语句 表示 跳过 当前这次的循环, 继而进行下一次循环.
		//注意: continue之后的语句,执行不到, 若编写.则语法报错

		//需求: 从1数到10, 当数到4的时候,跳过
		for (int i = 1; i <= 10 ; i ++ )
		{
			if (i == 4)
			{
				continue;
				//System.out.println("====="); //报错: 无法访问的语句
			}
			System.out.println(i);
		}
		System.out.println("============");

		//需求: 输出打印100到200之间不能被4整除的数.
		for (int i = 100; i <= 200 ; i ++ )
		{
			if (i % 4 == 0)
			{
				continue;
			}
			System.out.println(i);
		}
	}
}
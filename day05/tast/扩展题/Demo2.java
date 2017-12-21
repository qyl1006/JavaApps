//测试类
public class Demo2
{
	public static void main(String[] args)
	{
		//打印出 5 行的等腰三角形。
		
		for (int i = 1; i <= 10 ; i ++ )
		{
			for (int j = i; j < 10; j ++ )
			{
				System.out.print(" ");
			}
			for (int n = 1;n <= i ; n++ )
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
//测试类
public class TestDemo2
{
	public static void main(String[] args)
	{
		//  1)
		double d = -23.8;//定义温度
		String s = "阴天";
		if (d < 0.0 && s == "阴天")
		{
			System.out.println("阴冷");
		}else if (d < 0.0 && s == "晴天")
		{
			System.out.println("晴冷");
		}else if (d > 0.0 && s == "阴天")
		{
			System.out.println("阴暖");
		}else if (d > 0.0 && s == "晴天")
		{
			System.out.println("晴暖");
		}



		//  2)
		int a = 3;
		int b = 4;
		int c = 5;
	
		
		//调用
		System.out.println(Test.judgment(a, b, c));

		int[] arr = new int[3];
		System.out.println(arr[0]); //  0?
	}
}


//定义一个类
class Test
{
	public static int judgment(int a, int b, int c)
		{
			if (a == b && a == c)
			{
				return 2;
			}else if (a == b)
			{
				return 1;
			}else if (a == c)
			{
				return 1;
			}else if (b == c)
			{
				return 1;
			}else
			{
				return 0;
			}
		}

	int[] arr;
		
}
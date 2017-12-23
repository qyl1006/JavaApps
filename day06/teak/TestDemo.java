/*
	注册 登陆系统 使用二维数据存储数据.ing  挖坑	
*/
//用户系统
class TestSystem
{
	private static int[][] arr = new int[10][2];
	
	public static int[] sign = new int[10];//已注册标志器

	//注册用户
	public static void register(int user, int password)
	{
		for (int index = 0;index < arr.length ;index ++ )
		{
			if (arr[index][0] == user)
			{
				System.out.println("你已注册,请登陆");
				return;
			}else if (arr[index][0] == 0)
			{
				
				arr[index][0] = user;
				arr[index][1] = password;
				sign[index] = index;
				System.out.println("恭喜你注册成功,请登陆");
				return;
			}else
			{
				System.out.println("注册名额已用完, 下次来");
				return;
			}
		}
	}

	//登陆系统
	public static void logIn(int user, int password)
	{
		for (int index = 0; index < arr.length ;index ++ )
		{
			if (user == arr[index][0] && password == arr[index][1])
			{
				System.out.println("恭喜! 登陆成功");
				return;
			}else
			{
				System.out.println("账号或密码不正确");
				return;
			}
		}
	}

	//(管理员)打印显示"数据库" 账号密码
	public static void print()
	{
		for (int index = 0;index < arr.length ;index ++ )
		{
			System.out.println("账号" + (index + 1) + ":" + arr[index][0]);
			System.out.println("账号" + (index + 1) + "密码:" + arr[index][1]);
		}
	}
}

//用户注册标志判断
class Sign
{
	public static int judgment(int j)
	{
		int[] arr = TestSystem.sign;
		for (int index = 0;index < arr.length ;index ++ )
		{
			if (arr[index] == j)
			{
				return 1;
			}else
			{
				return 0;
			}
		}
	}
}



//测试类
public class TestDemo
{
	public static void main(String[] args)
	{
		//注册
		TestSystem.register(12306, 112233);
		TestSystem.register(12301, 112233);
		TestSystem.register(12302, 112233);
		TestSystem.register(12303, 112233);
		TestSystem.register(12304, 112233);
		TestSystem.register(12305, 112233);
		
		//登陆
		TestSystem.logIn(12306, 1122333);

		//管理员功能 查看账号密码
		TestSystem.print();
	}
}
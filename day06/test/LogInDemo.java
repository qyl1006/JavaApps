/*
	需求: 定义一个登陆的方法
		 返回参数: 1  表示登陆成功
		           0  表示账号或密码不正确
				   -1 表示该账号不存在 
*/
class Test
{
	public static int logIn(String s, int i)
	{
		System.out.println("登陆成功,欢迎再次回到魔兽世界");
		return 1;
	}
}


//测试类
public class LogInDemo
{
	public static void main(String[] args)
	{
		//测试
		Test.logIn("情深深雨蒙蒙", 12306);
	}
}
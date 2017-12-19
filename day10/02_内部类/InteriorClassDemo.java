//尝试佐证证明实例内部类的特性
//外部类
class Test
{
	String	name = "外部类成员Test.name";

	//内部类
	static class Test2
	{
		static String name = "内部类成员";
		public void print()
		{
			
		}
	}

	public void print()
	{
		
	}
}

//测试类
public class InteriorClassDemo
{
	public static void main(String[] args)
	{
		System.out.println(123);

		//创建静态内部类对象
		Test.Test2 t = new Test.Test2();

		System.out.println(Test.Test2.name);
	}
}
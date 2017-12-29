/*
	需求:   分别定义是个不同的方法,并调用
			1)无参数无返回
			2)无参数有返回
			3)有参数无返回
			4)有参数有返回
		总结: 对于有返回的方法,应该定义一个返回值想对应的类型变量去接受返回的结果.

*/
//测试类
public class MethodDemo2
{
	public static void main(String[] args)
	{
		
		//测试各个方法
		Test m = new Test();  //创建Test对象	
		//无参数无返回
		m.a();

		//无参数有返回
		m.b();
		int i = m.b();
		System.out.println(i);
		
		//有参数无返回
		m.c("有参数无返回");

		//有参数有返回
		m.d("有参数有返回");
		String s = m.d("有参数有返回");
		System.out.println(s);

	}
}

//自定义方法
class Test
{
	//无参数无返回
	public void a()
	{
		System.out.println("无参数无返回");
	}

	//无参数有返回
	public int b()
	{
		System.out.println("无参数有返回");
		return -1;
	}

	//有参数无返回
	public void c(String s)
	{
		System.out.println(s);
	}

	//有参数有返回
	public String d(String s)
	{
		return s;
	}
}
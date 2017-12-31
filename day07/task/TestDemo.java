//测试类
class Test
{
	int i;

	static void test()
	{
		System.out.println(i);
	}
}


public class TestDemo
{
	public static void main(String[] args)
	{
		//System.out.println(new Test().test()); //报错  错误: 无法从静态上下文中引用非静态
	}
}
//test

//定义一个类 测试类的构造器写法
class Abc
{
	Integer a;

	Abc() //结果:  构造器的方法名(构造器是个特殊的方法)是和类名 一样的  包括首字母大写的
	{
		System.out.println(1234);
		int[] arr = new int[6];
	}
}



public class Test
{
	int a;
	public static void main(String[] args)
	{
		new Abc();
	}
}
/*
	需求: 定义一个常用功能的方法,并且调用它
	步骤:   1)在MethodDemo类定义一个常用打印分割线的无参数无返回方法wire()
			2)调用wire()方法重复打印,
	注意:调用最好使用类名调用,
*/
//测试类
public class MethodDemo
{

	//值定义方法wire()
	public static void wire()
	{
		System.out.println("----------------------");
	}

	public static void main(String[] args)
	{
		//调用wire()
		MethodDemo.wire();
		MethodDemo.wire();
		MethodDemo.wire();
	}
}
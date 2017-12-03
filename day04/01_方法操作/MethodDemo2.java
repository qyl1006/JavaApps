//方法的定义和调用
public class MethodDemo2
{
	/*
		方法的定义格式:
			[修饰符]   返回值类型   方法名称([形参1,形参2,...])
			{
				方法体;
				[如果方法需要给调用者返回一个结果,此时使用return 值];
			}
	*/

	// 1) 无参数无返回
	// 需求: 定义一个方法,, 专门打印============
	static void print()
	{
		System.out.println("=====================");
	}

	// 2) 有参数无返回   需求: 打印任意数
	static void print2(String val)
	{
		System.out.println(val);
	}
	
	// 3) 无参数有返回  需求: 返回我的年龄17
	static int getAge()
	{
		return 17;
	}

	// 4) 有参数有返回  需求: 求两个数的之和
	static int getSum(int a, int b)
	{
		return a + b;
	}


	public static void main(String[] args)
	{
		MethodDemo2.print(); //调用方法

		MethodDemo2.print2("1234");  // 调用方法, 并把需要打印的字符串传递
		MethodDemo2.print2("Hello");
		MethodDemo2.print2("您好");

		//MethodDemo2.getAge();  // 无显示返回的结果,没有接收返回结果的变量
		int age = MethodDemo2.getAge();   //定义一个变量接收方法返回的结果
		System.out.println(age);

		// 定义变量sum接收getAge返回的结果
		int sum = MethodDemo2.getSum(11, 123);
		System.out.println(sum);

		sum = MethodDemo2.getSum(1111, 123);
		System.out.println(sum);
	}


}
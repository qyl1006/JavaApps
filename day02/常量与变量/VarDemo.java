//变量操作
public class VarDemo
{
	//static int age = 24;

	public static void main(String[] args)
	{
			/*
				1):变量的定义格式:
				     数据类型 变量名
					 如 int   age
				2):给变量赋值(初始化)
				     age = 17
				3):在声明变量的时候,并做初始化
				    int age = 17;
			  注意:变量必须初始化(赋值)之后才能使用,初始化才是真正的内存分配空间
			  定义多个变量不应该一行一起定义...每一行定义一个变量
			*/
		//int age = 17;  //定义数据类型int,变量为age,并赋值17给变量age
		//System.out.println("今年我的年龄是:" + age);

		//age = 18;  // 赋值18给变量age
		//System.out.println("明年我的年龄是:" + age);

		System.out.println(age);
		
		
	}
	static int age = 24;

}
//整数类型
/*
	byte、short、int、long类型：
整型常量的四种表示形式：
①　二进制整数
②　八进制整数
③　十进制整数
④　十六进制整数

需求: 定义变量 演示
*/

//演示类
public class IntegerDemo
{
	public static void main(String[] args)
	{
		//二进制
		int i = 0B110;
		
		//八进制
		int i2 = 012;

		//十进制
		int i3 = 110;

		//十六进制
		int i4 = 0X12;

		System.out.println(i);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
	}
}
//总结: 整型常量默认是int型 
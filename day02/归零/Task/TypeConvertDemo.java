//需求: 1)数据类型转换: 1) 自动转换 2) 强制转换
//		2) 以Integer包装类为例,,演示int转double float byte 其它转换类似 API有对应方法
		
/*
定义:
	1) 自动转换 一句话 小转大 当把小数据范围类型的数值或变量赋给另一个大数据范围类型变量，系统可以完成自动类型转型。
	2) 强制转换  大转少 当把大范围类型的数值或变量赋给另一个小范围类型变量时，此时系统不能自动完成转换，需要加上强制转换符，但这样的操作可能造成数据精度的降低或溢出，所以使用时要格外注意。

	步骤: 分别测试不同数据类型(小转大)(大转小)转换的结果  
*/

//测试类
public class TypeConvertDemo
{
	public static void main(String[] args)
	{
		//小转大
		//整数
		byte b = 12;
		int i = b;

		short s = 11;
		int i2 = s;

		int i3 = 10;
		long l = i3;

		//小数

		float f2 = 13F ;
		double d = f2; //编译通过


		//大转小
		long ls = 10;
		int is = (int)ls;

		int is2 = 19;
		short ss = (short)is2;

		short ss2 = 14;
		byte bs = (byte)ss2; //编译通过

		//加深记忆 用Ieteger包装类举例子 其它转换类似 API有对应方法
		// int转double
		int iii = 100;

		//new临时对象
		System.out.println(new Integer(iii).doubleValue());

		//int转byte
		byte bbb = new Integer(iii).byteValue(); //编译通过 证明
		System.out.println(new Integer(iii).byteValue());

		//int转float
		System.out.println(new Integer(iii).floatValue());
		
	}
}

/*
	总结:  boolean 类型是不可以转换为其他数据类型
			
			强制转换有可能数据溢出,为什么? 因为每个数据类型的范围有限,都是有范围的  例如 小数类型(double float)强制转换int
*/
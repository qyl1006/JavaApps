/*
	 方法的重载设计(overload):
		重载方法的定义是在同一个类中，某方法允许存在一个以上的同名方法，只要它们的参数列表不同即可。

		方法重载的作用：屏蔽了同一功能的方法由于参数不同所造成方法名称不同。

*/

//定义求两个数之和的重载方法
class Test
{
	//两个int数之和
	public static int getSum(int i , int j)
	{
		return i + j;
	}

	//两个double数之和
	public static double getSum(double i, double j)
	{
		return i + j;
	}
}

//测试类
public class  OverloadDemo
{
	public static void main(String[] args)
	{
		//调用方法测试
		// 1) 两个int数之和,并打印结果
		System.out.println(Test.getSum(22, 33));

		//  2) 两个double数之和, 并打印结果
		System.out.println(Test.getSum(23.222, 3.14));
	}
}

/*总结:  
		1)作用: 屏蔽了同一功能的方法由于参数不同所造成方法名称不同。
		2)一些判断方法: “两同一不同”
							两同：同类中，方法名相同；
							一不同：方法参数列表不同（参数类型、参数个数、参数顺序）；
									只要参数类型,参数个数,参数顺序有一个不同,参数列表就不同.

		最后注意的地方:		方法重载和方法的返回值类型无关，只是一般要求返回值类型一致。
							参数列表和参数的名称没关系,方法的重载和形参没关系.


*/ 
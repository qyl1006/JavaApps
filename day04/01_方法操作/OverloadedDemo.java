//方法的重载设计
public class OverloadedDemo
{
	/*
		方法的重载设计(overload):
			重载方法的定义是在同一个类中，某方法允许存在一个以上的同名方法，只要它们的参数列表不同即可。

			方法重载的作用：屏蔽了同一功能的方法由于参数不同所造成方法名称不同。
	*/
	//需求: 在同一类中,分别定义求两个整数,小数之和的方法
	// 定义两个整数之和的方法
	static int getSum(int a, int b)
	{
		return a + b;
	}
	
	// 定义两个小数之和的方法
	static double getSum(double a, double b)
	{
		return a + b;
	}
	
	//调用
	public static void main(String[] args)
	{
		double sum = OverloadedDemo.getSum(54, 78);
		System.out.println(sum);
	}
}
/*
	表达式  定义: 由数字 运算符(加减乘除等) 数字分组符号(括号) 常量 变量等以能求得结果的有意义排列的组合 这个组合就是表达式
	
	需求: 打印表达式
	步骤:   一: 直接组合一个两个常量相加的表达式 打印结果

			二: 定义int变量a 与 b 并赋值 组合成相加的表达式 打印出结果
*/ 


//演示类
public class ExpressionDemo
{
	public static void main(String[] args)
	{
		//打印一个两个数字进行相加的表达式所得的结果
		System.out.println(3 + 5);

		//定义int变量a 与 b 并赋值 组合成相加的表达式 打印出结果
		int a = 12;
		int b = 134;
		System.out.println(a + b);

	}
}
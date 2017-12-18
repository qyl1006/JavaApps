/*
	逻辑运算符  故名思意  是用来进行逻辑运算的
	语法格式为:boolean  result = 表达式A   逻辑运算符   表达式B;
	
	需求: 演示各个逻辑运算符号用法 及 比较 & 与 && | 与 || 运算的好处

	总结: 开发一般使用 || && 性能好 少执行一些判断 节约内存?

*/


//测试类
public class LogicalOperatorDemo
{
	public static void main(String[] args)
	{
		System.out.println(true & true);
		System.out.println(true & false);
		System.out.println(false & true);
		System.out.println(false & false);
		// && 的点 
		System.out.println(false && (10 / 0) == 1);  //运行不报错  证明 && 性能好与 &
		
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);

	}
}


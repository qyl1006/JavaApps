/*
	需求: 两个变量a b交换  演示不同得方式

	PS: 位运算符总结:
		左移位:  m左移n位 最后结果为: m * 2的n次方

		右移位:  m右移n位, 最后的结果为: m / 2的n次方

	步骤:  有四种解决思路
			1) 定义一个第三方变量 通过对它们得值进行转移到第三方变量来实现a b变量交换

			2) 通过异或位运算实现 本质是利用异或位运算得特性来实现位置转换 
				例如 如果x ^ y = z 可以推出 它们之间任意两个进行异或位运算 都可以得到另外一个

			3)算术运算 可以抽象具体到x轴上来形象地展示理解

			4) 利用转换Integer实例来互换来实现 a b变量交换  也可以new出Integer对象利用引用地址转换实现

*/

public class SwapVarDemo
{
	public static void main(String[] args)
	{
		int a = 10;
		int b =20;

		//第一种
		int c = a;
		a = b;
		b = c;
		System.out.println("a的值: " + a + " b的值: " + b);

		//第二种  此时 a = 20 b = 10
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("a的值: " + a + " b的值: " + b);

		//第三种 此时 a = 10 b = 20
		a = b - a;
		b = b - a;
		a = b + a;
		System.out.println("a的值: " + a + " b的值: " + b);

		//第四种  此时 a=20 b=10  和第一种方法类似
		Integer i = a; //底层自动装箱
		Integer j = b;
		Integer n = i;
		i = j;
		j = n;
		System.out.println(i == 10); //底层自动拆箱
		System.out.println(j == 20);
		
	}
}
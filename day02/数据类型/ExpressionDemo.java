/*
	java表达式
	表达式(expression):是由数字 运算符(括号) 常量 变量以能求得有意义排列的组合
	用运算符连接的变量/常量可称为表达式,也就是说表达式是由常量 变量 运算符 括号组成能求得值的有意义结果的语句
*/
public class ExpressionDemo
{
	public static void main(String[] args)
	{
		System.out.println(1+2+3);

		int a = 33;
		int b = 12;
		int c = 8;
		int d = (a + b )/c;
		System.out.println(d);
	}
}
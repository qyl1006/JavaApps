/*	算术运算符
	用于比较两个变量或常量之间的关系，比较运算符的结果是boolean类型,其操作格式为:
		boolean  result = 表达式A   比较运算符   表达式B;
		--------------------------------------------------------------------
		==：等于，若比较的是两个操作数都是数值类型，即使他们的类型不同，只要值相同就返回true。

	需求: 打印演示 各个运算符 用法 及 结果(boolean)
*/

//测试类
public class ComparisonOperatorDemo
{
	public static void main(String[] args)
	{
		System.out.println("23 == 3");
		System.out.println("23 != 3");
		System.out.println("23 > 3");
		System.out.println("23 < 3");
		System.out.println("23 <= 3");
		System.out.println("23 >= 3");
	}
}

//总结: 返回的值为boolean true 或 false
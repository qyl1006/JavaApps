/* if语句
语法格式: if(boolean表达式)
			{
				 条件执行体
			}
			if后面跟的{}表示一个整体—代码块，我们在这称为条件执行体，也就是说条件为true，就执行这一块代码块

	需求: 测试if语句
*/


//测试类
public class IfDemo
{
	public static void main(String[] args)
	{
		if (true)
		{
			System.out.println("A");
			System.out.println("B");
			System.out.println("C");
			System.out.println("D");
		}
	}
}

//总结:  1)在if(boolean表达式)后面,{}前面,是没有分号的.

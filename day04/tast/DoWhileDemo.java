/**
	do while循环:
		格式：
		do
		{
			  循环体语句
		}
		while(boolean表达式);
	总结:	do while循环特点：先执行一次循环体，再判断表达式，若为true就执行循环体，否则，跳过循环体。
			也就是说do while是先执行后判断，即使判断条件为false，该循环至少会执行一次。 
	需求:打印大哥大 5次
*/

//测试类
public class DoWhileDemo
{
	public static void main(String[] args)
	{
		int i = 0;
		do
		{
			System.out.println("大哥大");
			i ++;
		}
		while (i < 5);
	}
}
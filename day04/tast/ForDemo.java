/**
	for循环:
		格式：
		for(初始化语句;boolean表达式;循环后操作语句)
		{
			循环体语句
		}
	需求: 打印5次大哥大
*/

//测试类
public class ForDemo
{
	public static void main(String[] args)
	{
		for (int i = 0;i < 5 ; i ++)
		{
			System.out.println("大哥大");
		}
	}
}

//总结: boolean表达式：表达式为false时，循环终止,为true,才执行循环体。
//		一般常见得循环变量名称:i,j,k,m,n.

/*
	字符串 所谓字符串，就是一串字符，也就是N个字符连接在一起（N可以表示0或多个）
	需求: 打印字符串
	步骤: Look
*/

//演示类
public class StringDemo
{
	public static void main(String[] args)
	{
		//打印字符串
		String s = "我" + 521 + "爱" + "ni";
		String s2 = 1+3-2*2/1 + "";

		System.out.println(s);
	}
}

//总结: 字符串拼接:字符串和任意数据类型相连接,结果都是字符串类型. 如以上的变量s2

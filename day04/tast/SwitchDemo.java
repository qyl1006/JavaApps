/**
	switch语句结构的格式如下：
		switch(整型表达式){
			case A值:
					表达式结果等于条件1时，执行此语句；
			break；
			case B值:
					表达式结果等于条件2时，执行此语句；
			break；
				...
									 case C值:
					表达式结果等于条件N时，执行此语句；
			break；

			default:
					以上值都不满足时，执行此语句；
			break；//一般不写
		}

	需求: 如果今天星期一至星期五之间,输出今天上班;否则输出加班,
	PS 通过反编译证明 Switch只支持int类型(String 和 枚举)
*/

//测试类
public class SwitchDemo
{
	public static void main(String[] args)
	{	
		//字符串
		String s = "星期日";
		switch(s)  //反编译得到: switch (s1.hashCode())  返回此字符串的哈希码 底层还是int类型
		{
			case "星期一" : 
			case "星期二" : 
			case "星期三" : 
			case "星期四" : 
			case "星期五" : System.out.println("今天上班");break;
			case "星期六" : 
			case "星期日" : System.out.println("今天加班");break;
		}

		//枚举
		switch(Today.G) //反编译得到:[Today.G.ordinal()]) 
		{
			case A:break;
			case B:break;
			case C:break;
			case D:break;
			case E:break;
			case F:break;
			case G:System.out.println("test");break;
		}
	}
}

//尝试
enum Today
{
	A,B,C,D,E,F,G;
}

//总结: 本质:switch仅仅只能支持int类型
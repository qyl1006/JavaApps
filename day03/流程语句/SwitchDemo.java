//switch语句  
//需求: 如果今天是周一,就打印输出周一;如果今天是周二,就打印输出周二;如果今天是周三,就打印输出周三;.......
public class SwitchDemo
{
	public static void main(String[] args)
	{
		/*
			switch格式:
				switch(整型表达式)
				{
					case 值1: 执行的语句; break;
					case 值2: 执行的语句; break;
					case 值3: 执行的语句; break;
					---
					default: 上述的值都不是表达式的结果,就执行这里的语句;
				}
		*/
		int weekday = 8;
		switch(weekday)
		{
			case 1 : System.out.println("周1"); break;
			case 2 : System.out.println("周2"); break;
			case 3 : System.out.println("周3"); break;
			case 4 : System.out.println("周4"); break;
			case 5 : System.out.println("周5"); break;
			case 6 : System.out.println("周6"); break;
			case 7 : System.out.println("周7"); break;
			default : System.out.println("没有这个日期");
		}
		//需求: 判断工作日与休息日
		int day = 8;
		switch(day)
		{
			case 1 : 
			case 2 : 
			case 3 : 
			case 4 : 
			case 5 : System.out.println("工作日"); break;
			case 6 : 
			case 7 : System.out.println("休息日"); break;
			default : System.out.println("没有这个日期");
		}
	}
}
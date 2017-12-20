/** 语法格式:
	if(boolean表达式A){
     条件执行体
	}else if (boolean 表达式B){
		 条件执行体B
	}else{
		 条件执行体C
	}

	需求: 给出17年12月的一个日期,判断今天星期几? 如日期超出日期数范围,打印错误()
			PS: 12月有31天
*/

//测试类
public class IfElseIfElseDemo
{
	public static void main(String[] args)
	{
		
		int today = 131;
		if (today <= 0 || today > 31)
		{
			System.out.println("17年12月没有这个日期数");
		}else if (today % 7 == 0)
		{
			System.out.println("今天星期" + 4);
		}else if(today % 7 <= 3)
		{
			System.out.println("今天星期" + (today % 7 + 4));
		}else
		{
			System.out.println("今天星期" + (today % 7 - 3));
		}
	}
}

/**总结:1):不能在if(boolean表达式),使用分号.
		2):不能在else if(boolean表达式),使用分号.
		3):不能直接使用else if语句,必须先使用if语句.
		4):最后的else语句,表示上述所有条件都为false
			的时候才会执行的代码
*/
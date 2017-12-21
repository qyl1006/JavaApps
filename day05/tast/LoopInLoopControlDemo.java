/*
		控制循环结构语句		
*/
//测试类
public class LoopInLoopControlDemo
{
	public static void main(String[] args)
	{
		/*break语句
		break:终止当前所在的循环. stop
	总结: break之后的语句执行不了,所以不能编写.
	需求: 证明
		*/
		//例如
		while (true)
		{
			System.out.println("测试");
			break;
		}


		/*
			continue语句: 继续的意思. skip.
			跳过当前的循环,进入下一次循环操作.
		总结:break之后的语句执行不了,所以不能编写.
		需求:证明
		*/
		System.out.println("===========================");

		for (int i = 1;i <= 5 ;i ++ )
		{
			if (i == 3)
			{
				continue;   //运行后显示: 单i=3时,程序跳过当前循环,进入下一个循环,所以打印显示: 1 2 4 5
			}
			System.out.println(i);
		}

		/*	return:
				表示结束循环所在的方法，方法都结束了，循环结构自然也就结束了。

				注意:
				break、continue、return后面的语句永远没有机会执行，所以不能再跟任何语句，否则编译失败
			
			需求: 证明
		*/
		System.out.println("===========================");
		for (int i = 0;i < 5 ; i ++ )
		{
			if (i == 4)
			{
				return;
			}
			System.out.println(i);
		}
		System.out.println("eng=======");  //通过显示结果发现: 这句话没有打印出来 所以可以推出 return直接结束当前方法
		
	}
}
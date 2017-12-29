/*
	总结:  定义方法必须搞清楚
				 1):是否需要定义返回值类型.
			     2):是否需要形式参数.

*/

//自定义方法
class Test
{
	//1 定义一个方法multiply,返回求任意两个int类型参数的乘积
	public int multiply(int i , int j)
	{
		return i * j;
	}

	//2 定义一个方法isFive接收一个int类型参数 若是5的倍数返回true 否则返回false
	public boolean isFive(int i)
	{
		if (i % 5 == 0)
		{
			return true;
		}else
		{
			return false;
		}
	}

	//定义一个方法checkWorkOrReset,根据传入的参数(int类型), 若是[1  5]打印工作日 [6 7]休息日 其它非法参数
	public void checkWorkOrReset(int i)
	{
		if (1 <= i && i <= 5)
		{
			System.out.println("工作日");
		}else if (i == 6 || i == 7)
		{
			System.out.println("周末休息日");
		}else
		{
			System.out.println("您输入的数字没有这一天,请重新输入,谢谢!");
		}
	}

	//定义一个方法printValue循环打印 , 次数(int类型) 和打印内容(String)由参数决定
	public void printValue(int i , String s)
	{
		for (int j = 0;j < i ;j ++ )
		{
			System.out.println(s);
		}
	}

}

//测试类
public class TestsDemo
{
	public static void main(String[] args)
	{
		//创建Test的对象
		Test t = new Test();
		//测试
		// 1) 求任意两个数的乘积
		System.out.println(t.multiply(5, 4));  //20

		// 2) 若是5的倍数返回true 否则返回false
		System.out.println(t.isFive(11));

		//  3) 判断工作日 周末
		t.checkWorkOrReset(6);

		//  4) 方法printValue循环打印 , 次数(int类型) 和打印内容(String)由参数决定
		t.printValue(5, "你好! 世界!");

		
	}
}
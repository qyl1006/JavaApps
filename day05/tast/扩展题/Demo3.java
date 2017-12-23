//测试类
public class Demo3
{
	public static void main(String[] args)
	{
		//需求 2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。
		double sum = 0;
		double sum2 = 0;
		for (int i = 1;i <= 20 ;i ++ )
		{
			sum += Test.fn(i + 1); //前20位所有分母之和
			sum2 += Test.fn(i);		//前20位所有分子之和
		}
		System.out.println(sum);
		System.out.println(sum2);
		System.out.println(sum / sum2);
	}
}

//递归  (第n个数的分母)
class Test
{
	public static double fn(int n)
	{
		if ( n == 1)
		{
			return 1.0;
		}else if (n == 2)
		{
			return 2.0;
		}else
		{
			return fn(n - 1) + fn(n - 2);
		}
	}
}
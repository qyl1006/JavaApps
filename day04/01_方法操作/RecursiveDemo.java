public class RecursiveDemo
{
	//方法递归 斐波纳契数列 其通项公式为：F（0）=0，F(1)=1，Fn=F(n-1) +F(n-2)（n>=3，n∈N*）
	static int fn(int n)
	{
		if (n == 0)
		{
			return 0;
		}else if (n == 1)
		{
			return 1;
		}else   //意思是: n不等于1 和 0时 
		{
			return fn(n - 1) + fn(n - 2);
		}
	}

	public static void main(String[] args)
	{
		int a = RecursiveDemo.fn(17);
		System.out.println(a);
	}
	
}
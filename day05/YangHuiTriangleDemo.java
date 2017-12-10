//杨辉三角
public class YangHuiTriangleDemo
{
	//求杨辉三角某个位置的数字的方法
	static int sumC(int n, int i)
	{
		int sum = 0;
		if (n >= 0 && i >= 0)
		{
			if (n == 0 && i == 0)
			{
				return 1;
			}else if (n == 1 && i == 0)
			{
				return 1;
			}else if (n == 1 && i == 1)
			{
				return 1;
			}else{
				sum = sumC(n - 1, i) + sumC(n-1, i - 1);
				return sum;
			}
		}
		return sum;
	}
	
	//杨辉三角的二维数组方法

	static int[][] yangHui(int m1)
	{
		int[][] arr = new int[m1][m1];
		for (int n = 0; n < m1; n ++ )
		{
			for (int i = 0; i < n + 1; i ++ )
			{
				arr[n][i] = sumC(n, i);
				if (sumC(n, i) != 0)
				{
					System.out.print(sumC(n, i) + "\t"); //打印出来
				}

			}
			System.out.println("\r");
		}
		return arr;
	}
	
	public static void main(String[] args)
	{
		//调用一下 试试
		System.out.println(sumC(7,6));
		int[][] arr = yangHui(10);
		/*
		for (int i = 0; i < arr.length ; i ++ )
		{
			System.out.println("数组arr每个元素的长度: " + arr[i].length);
			for (int j = 0; j < arr[i].length; j ++ )
			{
				System.out.print(arr[i][j]);
			}
			System.out.println("\r");
			System.out.println("=========");
		}
		*/
	}
}
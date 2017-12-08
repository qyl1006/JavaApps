//多维数组 (数组中数组)
public class MultidimensionalArraysDemo
{
	public static void main(String[] args)
	{
		//创建一个二维数组并初始化, 和一维数组定义格式类似
		int[][] arr = new int[][] {
				{1, 2, 3},
				{4, 5},
				{9}
			};
		
		System.out.println(arr.length);
		System.out.println(arr); // [[I@15db9742

		for (int i = 0; i < arr.length ; i ++ )
		{
			System.out.println(arr[i]);
			System.out.println("数组arr每个元素的长度: " + arr[i].length);
			for (int j = 0; j < arr[i].length; j ++ )
			{
				System.out.println(arr[i][j]);
			}
		}
		
	}
}
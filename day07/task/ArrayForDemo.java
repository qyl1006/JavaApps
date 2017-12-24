/*
	//需求: 遍历数组,打印出各个元素
*/


//测试类
public class ArrayForDemo
{
	public static void main(String[] args)
	{
		//定义数组并初始化
		int[][] arr = new int[][]{
			{1, 2, 3, 4, 5},
			{6, 7, 8, 9},
			{10, 11}
		};

		//遍历数组并打印
		for (int index = 0;index < arr.length; index ++ )
		{
			for (int i = 0;i < arr[index].length ;i ++ )
			{
				System.out.println("arr数组元素为: " + arr[index][i]);
			}
		}

		
	}
}
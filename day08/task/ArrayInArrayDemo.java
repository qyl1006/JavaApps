/*
	需求: 定义一个二维数组 并初始化 并进行设置值 获取值 遍历打印数组元素的操作

	思路:  二维数组和一维数组都是数组,所以它们具有相似性,同理一些操作也一样,可以参照模仿一维数组的操作.
*/

//测试类
public class ArrayInArrayDemo
{
	public static void main(String[] args)
	{
		//定义一个二维数组并初始化;
		int[][] test = new int[10][3];

 		int[][] arr = new int[][]{
			{1, 2, 3, 4, 5, 6, 7},
			{8, 9, 10, 11, 12},
			{11, 12, 13}
		};

		//获取值
		System.out.println(arr[2][1]); //12

		//设置值
		arr[2][1] = 120;
		System.out.println(arr[2][1]); // 120

		//遍历数组并打印
		for (int i = 0;i < arr.length ; i ++ )
		{
			for (int j = 0;j < arr[i].length ;j ++ )
			{
				System.out.println(arr[i][j]);
			}
		}

		System.out.println("===========================================");

		//增强for循环二维数组 实现
		for(int[] i : arr)     //i 为二维数组中的 各个一维数组的引用内存空间的内存地址值 
		{                        // 其实可以通过它可以操作各个一维数组的堆里存储的值
			for (int ii : i)
			{
				System.out.println(ii);
			}
		}
	}

}
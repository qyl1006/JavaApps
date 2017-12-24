/*
	需求: 使用增强for循环遍历打印数组元素
*/

//测试类
public class ForEachDemo
{
	public static void main(String[] args)
	{
		//数组
		int[] arr = new int[]{1, 2, 3, 4, 5, 6};	

		//增强for循环
		for(int a : arr )
		{
			System.out.println(a);
		}

		System.out.println("=================================");
		//二维数组
		int[][] arrs = new int[][]{
			{1, 2, 3, 4, 5},
			{6, 7, 8, 9},
			{10, 11}
		};

		

		//增强for循环二维数组
		for(int[] i : arrs)     //i 为二维数组中的 各个一维数组的引用内存空间的内存地址值 
		{                        // 其实可以通过它可以操作各个一维数组的堆里存储的值
			for (int ii : i)
			{
				System.out.println(ii);
			}
		}
	}
}

//总结: 增强for循环不能操作数组的索引, 所以说如果需要操作数组的话,就应该使用for循环
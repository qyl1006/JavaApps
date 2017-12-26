/*
	需求: 求一个数组中某元素出现索引(第一次/最后一次)
	思路: 求第一次出现的索引: 把数组从头(索引0开始)遍历,然后逐个元素与需要查找的key做比较 如果相等 就打印相应的索引值

		 求最后一次的索引: 把数组从尾(索引为arr.length - 1)开始遍历, 然后逐个元素与需要查找的key做比较 如果相等 就打印相应的索引值

		否则: 返回 -1
*/

//测试类
public class ArraySearchDemo
{
	public static void main(String[] args)
	{
		//定义一个数组
		int[] arr = new int[]{0, 3, 3, 7, 9, 1, 5, 2, 6, 8, 10, 11, 23, 65, 0, 3};

		//元素3第一次出现的索引
		int i = TestDemo.arrayFirst(arr, 65);
		System.out.println(i);

		//元素3最后一次出现的索引
		int j = TestDemo.arrayLast(arr, 3);
		System.out.println(j);
		
	}
}

class TestDemo
{
	//key元素第一次出现的索引
	// arr为要查找元素的数组;  key为需要查找的元素
	public static int arrayFirst(int[] arr, int key)
	{
		for (int i = 0;i < arr.length ;i ++ )
		{
			if (arr[i] == key)
			{
				return i;
			}
		}
		return -1;
	}

	//key元素最后一次出现的索引
	// arr为要查找元素的数组;  key为需要查找的元素
	public static int arrayLast(int[] arr, int key)
	{
		for (int i = arr.length - 1; i >= 0; i -- )
		{
			if (arr[i] == key)
			{
				return i;
			}
		}
		return -1;
		
	}
}
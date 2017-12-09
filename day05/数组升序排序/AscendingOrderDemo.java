//数组升序排列
public class AscendingOrderDemo
{

	//打印数组元素的方法
	static void printArray(int[] arr)
	{
		if (arr == null)
		{
			System.out.println("null");
			return;
		}
		String ret = "[";
		for (int index = 0; index < arr.length; index ++ )
		{
			ret = ret + arr[index];
			if (index != arr.length - 1)
			{
				ret = ret + ", ";
			}
		}
		ret = ret + "]";
		System.out.println(ret);	
	}


	//数组相邻元素互换方法 ------该方法不够健壮 变量index1 index2 需要判断
	static void swap(int[] arr, int index1, int index2)
	{
		int i = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = i;
	}

	//数组升序排列方法  冒泡排序 ------降序的方法 把if判断条件改成 < 号
	static void rise1(int[] arr)
	{
		for (int m = 1; m < arr.length; m ++ )
		{
			for (int n = 0; n < arr.length - m; n ++ )
			{
				if (arr[n] > arr[n + 1])
				{
					swap(arr, n, n + 1);
				}
			}
		}
	}

	//数组升序排序方法 选择排序  降序的方法 把if判断条件改成 < 号
	//这个不是真正的 选择排序方法 rise3 才是
	static void rise2(int[] arr)
	{
		for (int m = 1; m < arr.length; m ++ )
		{
			for (int index = m; index < arr.length; index ++ )
			{
				if (arr[m - 1] > arr[index])
				{
					swap(arr, m - 1, index);
				}
			}
		}
	}

	// 选择排序法
	static void rise3(int[] arr)
	{
		for (int i = 1; i <= arr.length - 1; i ++ )
		{
			int j = i - 1;
			for (int index = i; index <= arr.length - 1; index ++ )
			{
				if (arr[index] < arr[j])
				{
					j = index;
				}
			}
			swap(arr, i - 1, j);
		}
	}


	//调用方法测试
	public static void main(String[] args)
	{
		int[] arrs = new int[]{5, 7, 4, 9, 1, 3, 10, 2, 12, 6};

		System.out.println("进行排序操作前:");

		printArray(arrs);
		//调用方法进行升序排列
		rise3(arrs);

		System.out.println("进行排序操作后:");
		printArray(arrs);
	}
}
//自行封装数组操作工具ArrayUtil类												
public class ArrayUtil
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


	//编写二分法方法
	static int binarySearch(int[] arr, int key)
	{
		int left = 0;
		int right = arr.length - 1;
		while (left <= right)
		{
			int min = (left + right) / 2;
			int minNum = arr[min];
			if (minNum == key)
			{
				return min;
			}else if (minNum > key)
			{
				right = min - 1;
			}else if (minNum < key)
			{
				left = min + 1;
			}
		}
		return -1;
	}

	//获取最大值方法
	static int getMax(int[] nums)
	{
		int max = nums[0];//
		for (int index = 1; index < nums.length; index ++ )
		{
			if (nums[index] > max)
			{
				max = nums[index];
			}
		}
		return max;
	}

	//获取最小值方法
	static int getMin(int[] nums)
	{
		int min = nums[0];//
		for (int index = 1; index < nums.length; index ++ )
		{
			if (nums[index] < min)
			{
				min = nums[index];
			}
		}
		return min;
	}

	//求杨辉三角某一位置的数字的方法
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
	
	//杨辉三角的二维数组方法(打印)

	static int[][] yangHui(int m1)
	{
		int[][] arr = new int[m1][m1];
		for (int n = 0; n < m1; n ++ )
		{
			for (int j = n; j < m1; j ++ )
			{
				System.out.print(" ");
			}

			for (int i = 0; i < n + 1; i ++ )
			{
				arr[n][i] = sumC(n, i);
				if (sumC(n, i) != 0)
				{
					System.out.print(sumC(n, i) + " "); //打印出来
				}

			}
			System.out.println("\r");
		}
		return arr;
	}

}


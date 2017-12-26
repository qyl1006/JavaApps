/*
	需求: 求一个数组中最小/最大值的元素
	思路: 假设一个元素为最小值min/最大值max,循环数组使各个元素与之比较,若有元素小于/大于该
			假设值,就把该元素赋值给min/max.
*/		




//测试类
public class ArrayOperationDemo1
{
	public static void main(String[] args)
	{
		//定义一个数组
		int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 11, -1, -2, -6, 0};

		//调用方法
		System.out.println(getMax(arr));// 11  最大元素
		System.out.println(getMin(arr)); // -6 最小元素
		

	}


	//定义求数组最小元素的方法
	static int getMin(int[] arr)
	{
		int min = arr[0];
		for (int i = 0;i < arr.length ;i ++ )
		{
			if (arr[i] < min)
			{
				min = arr[i];
			}
		}
		return min;
	}

	//定义求数组最大元素的方法
	static int getMax(int[] arr)
	{
		int max = arr[0];
		for (int i = 0;i < arr.length ;i ++ )
		{
			if (arr[i] > max)
			{
				max = arr[i];
			}
		}
		return max;
	}
}

//总结: 
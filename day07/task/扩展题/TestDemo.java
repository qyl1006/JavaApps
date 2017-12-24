/*
	需求: 、定义一个方法,接收一个 int 类型数组,求出该数组索引是偶数位置元素之和
												求出该数组索引是奇数位置元素之和
																
*/

//测试类
public class TestDemo
{
	public static void main(String[] args)
	{
		//调用方法测试
		int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
		
		//索引为偶数的元素和
		System.out.println(Test.getSumEven(arr));

		//索引为奇数的元素和
		System.out.println(Test.getSumOdd(arr));

		//倒序  打印数组 效果
		int[] arrs = Test.test(arr);
		for (int i = 0 ;i < arrs.length ; i ++ )
		{
			System.out.println(arrs[i]);
		}
	}
}


//定义方法
class Test
{
	//求任意数组索引是偶数位置元素之和
	public static int getSumEven(int[] arr)
	{
		int sumEven = 0;
		for (int index = 0; index < arr.length ;index ++ )
		{
			if (index != 0 && index % 2 == 0)
			{
				sumEven += arr[index];
				
			}
		}
		return sumEven;
	}

	//求任意数组索引是奇数位置元素之和
	public static int getSumOdd(int[] arr)
	{
		int sumOdd = 0;
		for (int index = 0;index < arr.length ;index ++ )
		{
			if (index != 0 && index % 2 == 1)
			{
				sumOdd += arr[index];
			}
		}
		return sumOdd;
	}

	//数组倒序方法
	public static int[] test(int[] arr)
	{
		int[] newArr = new int[arr.length];
		for (int i = 0;i < arr.length ; i ++)
		{
			newArr[arr.length - 1 - i] = arr[i];
		}
		return newArr;
	}

}
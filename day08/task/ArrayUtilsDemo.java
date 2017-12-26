/*
	//打印数组 思路: 首先我们想要打印的结果为{a, b, c..}形式的,---String字符串----1) 定义一个String字符串 2)for循环遍历数组,
						使每个元素与之前定义的String的变量组成一个新字符串,之后打印
	
	逆序排列数组  思路: 在定义的方法中新定义一个新数组来接收原数组遍历出来的各个元素,因为要求最后结果时逆序排列数组,所以需要逆着赋值.
*/

//测试类
public class ArrayUtilsDemo
{
	public static void main(String[] args)
	{
		//测试 打印数组
		int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
		arrayPrint(arr);

		//逆序排列数组
		int[] arrs = arrayReverseOrder(arr);
		arrayPrint(arrs);
		
	}

	//定义打印方法
	public static void arrayPrint(int[] arr)
	{
		if (arr == null)
		{
			System.out.println("该数组为空引用null");
		}else
		{
			String s = "{";
			for (int i = 0;i < arr.length ;i ++ )
			{
				if (i == arr.length - 1)
				{
					s += arr[i] + "}";
				}else
				{
					s += arr[i] + ", ";
				}
			}
			System.out.println(s);
		}

	}

	//逆序排列数组元素方法
	public static int[] arrayReverseOrder(int[] arr)
	{
		int[] newArray = new int[arr.length];
		for (int i = 0 ; i < arr.length;i ++ )
		{
			newArray[arr.length - 1 - i] = arr[i];
		}
		return newArray;
	}
}
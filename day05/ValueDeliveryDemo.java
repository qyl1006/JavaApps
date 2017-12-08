//方法参数的值传递机制之 基本数据类型
public class ValueDeliveryDemo
{
	public static void main(String[] args)
	{
		int x = 10;
		System.out.println("main方法前,x= " + x);
		x = ValueDeliveryDemo.change(x);
		System.out.println("main方法后,x= " + x);
		//System.out.println("main方法后,x= " + abc);

		System.out.println("===============");

		//调用方法 ----- 值传递 引用数据类型
		int[] arr = new int[]{11, 12, 13, 15, 18};
		printArray(arr); //打印数组arr  结果: [11,12,13,15,18]

		swap(arr, 1, 3);//运行 swap方法 结果: 12(temp值) [I@15db9742(说明:这是直接打印arrs) [11, 15, 13, 12, 18](打印arrs数组)
		printArray(arr); //打印arr main方法中arr数组 因为引用(地址值)堆内存空间共享的, 所以 [11, 15, 13, 12, 18]

	}




	static int change(int xx)
	{
		System.out.println("change方法前,xx= " + xx);
		xx = 50;
		System.out.println("change方法后,xx= " + xx);
		return xx;
	}

	//方法参数的值传递机制之 引用数据类型
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

		//在数组arrs中交换arrs[index1]与arrs[index2]的位置
	static void swap(int[] arrs, int index1, int index2)
	{
		int temp = arrs[index1];
		arrs[index1] = arrs[index2];
		arrs[index2] = temp;

		System.out.println(temp);
		System.out.println(arrs);
		printArray(arrs);

	}
}
//数组拷贝
public class ArrayCopyDemo
{
	/*从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束。
	从 src 引用的源数组到 dest 引用的目标数组，数组组件的一个子序列被复制下来。
	被复制的组件的编号等于 length(拷贝粘贴元素的长度或者个数) 参数。
	源数组中位置在 srcPos 到 srcPos+length-1 之间的组件被分别复制到目标数组中的 destPos 到 destPos+length-1 位置。
	*/
	
	static void arrayCopy(int[] src, int srcPos, int[] dest, int destPos, int length)
	{
		for (int index = srcPos; index < length + srcPos; index ++ )
		{
			dest[destPos] = src[index];
			destPos ++;
		}
	}

	//打印数组元素的方法
	static void printArray(double[] arr)
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


	//调用方法测试
	public static void main(String[] args)
	{
		double[] srcs = new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		double[] dests = new double[10];
		
		System.out.println("源数组:");
		printArray(srcs);
		System.out.println("拷贝前目标数组:");
		printArray(dests);
		//拷贝
		//arrayCopy(srcs, 2, dests, 6, 3);
		System.arraycopy(srcs, 2, dests, 6, 3); //直接调用JDK底层编写好的方法 可查询API来获取介绍

		System.out.println("从源数组索引位置 2 开始,拷贝元素个数为 3, 从目标数组索引位置 6 粘贴");
		System.out.println("拷贝后目标数组:");
		printArray(dests);

	}
}
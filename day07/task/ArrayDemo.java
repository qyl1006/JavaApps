/*
	需求: 引出一组数组,不初始化, 并直接打印它的引用内存值
*/

//测试类
public class ArrayDemo
{
	//引出数组,不做初始化
	static int[][] arrs;
	static int[] arr;

	public static void main(String[] args)
	{
		//打印数组
		System.out.println(arrs);  // null
		System.out.println(arr);  // null
	}
}

//总结: 直接定义数组,但没有初始化,表示该数组没有引用堆里的任何内存空间地址值,
//		所以打印出来结果为 null 空引用 PS 如果此时操作数组会报错 空指针错误 NullPointerException


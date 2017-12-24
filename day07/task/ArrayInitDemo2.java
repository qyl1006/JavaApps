/*
	数组的动态初始化操作:
	 由我们来设置数组的元素个数(数组长度),而每一个数组元素的初始值有系统决定.
	语法:
		数组元素类型[]  数组名 = new  数组元素类型[ length ];

*/

//测试类
public class ArrayInitDemo2
{
	public static void main(String[] args)
	{
		//动态初始化一个二维数组
		int[][] arr = new int[10][10];

		//获取数组arr的长度,并打印
		System.out.println(arr.length);

		//获取数组值
		System.out.println(arr);//打印数组的引用内存空间的地址值
		System.out.println(arr[9][9]);// 0

		//设置数组值
		System.out.println("=======================");
		
		arr[9][9] = 110;
		System.out.println(arr[9][9]);

	}
}


//总结: 动态初始化一般都是不知道该数组元素的具体值,因为不知道需要存储哪些数据
//		,所以只能使用动态初始化
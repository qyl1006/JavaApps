/*
	数组的静态初始化操作:
    特点: 有我们自己来为每一个数组元素设置初始化值,而数组的长度由系统(JVM)决定.
	语法:
	      数组元素类型[]  数组名 = new 数组元素类型[]{元素1,元素2,元素3,.......};

*/


//测试类
public class ArrayInitDemo1
{
	public static void main(String[] args)
	{
		//静态初始化一个int的二维数组
		int[][] arr = new int[][]{
			{1, 2, 3, 4, 5},
			{6, 7, 8, 9},
			{10, 11}
		};

		//获取该数组arr的长度,并打印
		System.out.println(arr.length);

		//获取数组值并打印
		System.out.println(arr);  //打印数组的引用内存空间的地址值
		
		System.out.println(arr[2][1]);  // 11
		//设置某个数组值
		
		arr[2][1] = 110;
		System.out.println(arr[2][1]);  // 110
	}
}

//总结: 静态初始化的使用必须预先知道
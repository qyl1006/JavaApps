/*
	数组操作的常见异常
		1)NullPointerException:空指针异常(空引用).
		2)ArrayIndexOutOfBoundsException:数组的索引越界异常.

		需求: 代码佐证上述异常

*/

//测试类
public class ExceptionDemo
{
	public static void main(String[] args)
	{
		// 1)
		int[] arr = null;
		System.out.println(arr); //可以正常编译运行 原因:arr数组在栈帧中是存在的,但是没有引用任何内存空间,为null.而打印操作数组并没有动用内存空间的数据
		//System.out.println(arr.length); //报错 .NullPointerException

		// 2)
		arr = new int[]{1, 2, 3, 4};
		//System.out.println(arr[5]); // 报错 ArrayIndexOutOfBoundsException 因为数组的索引为[0 , arr.length)

	}
}
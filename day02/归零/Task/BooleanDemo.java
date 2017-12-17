/*
	boolean类型：通常用于逻辑运算和程序流程控制(条件选择/循环)

	需求: 演示boolean用法

*/

//演示类
public class BooleanDemo
{
	public static void main(String[] args)
	{
		int[] arrs = new int[]{1, 2, 3, 4, 5, 119, 120, 110, 12306};
		
		//演示boolean的用法
		Test.print(arrs);

	}
}

//创建类
class Test
{
	//定义静态方法
	public static void print(int[] arr)
	{
		int i = 0; //统计循环次数
		for (int index = 0; index < arr.length; index ++ )
		{
			if (arr[index] == 110) //boolean为true 运行
			{
				System.out.println(arr[index]);
			}
			i ++;
			
		}
		System.out.println("循环次数: " + i);
	}
}

/*
	总结: false和true是boolean的常量  不能赋值给其它值给boolean 否则报错
*/
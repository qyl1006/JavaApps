/**
	嵌套循环	
	循环解决的是:某一个操作重复执行.
	如果一个重复的操作需要做N次,此时得使用嵌套循环.
	  可以吧内层循环看成是一个整体.

	需求: 给出一个三维int数组arr,使用 嵌套循环 打印出每个元素的值.

	
*/

//测试类
public class LoopInLoopDemo
{
	public static void main(String[] args)
	{
		int[][][] arr = new int[][][]{
			{
				{1, 2, 3, 4, 5},
				{6, 7, 8, 9, 10},
				{11, 12}
			},
			{	
				{13, 14, 15, 16, 17},
				{18, 19, 20},
				{21, 22}
			},
			{
				{23, 24, 25, 26},
				{27, 28, 29},
				{30}
			}
		};

		//打印
		for (int index = 0;index < arr.length ; index ++ )
		{
			for (int i = 0;i < arr[index].length ; i ++ )
			{
				for (int n = 0;n < arr[index][i].length ;n ++ )
				{
					System.out.println(arr[index][i][n]);
				}
			}
		}
	}

}

/*
	若外循环的循环次数是m次，内循环的循环次数是n次，那么内层循环的循环次数需要 m * n次。
	循环注意:
			 1.使用循环嵌套时，内层循环和外层循环的循环控制变量不能相同。
		　   2.循环嵌套结构的书写，最好采用“右缩进”格式，以体现循环层次的关系。
		　  

*/
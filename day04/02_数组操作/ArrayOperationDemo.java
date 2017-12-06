// 数组的基本操作
public class ArrayOperationDemo
{
	public static void main(String[] args) 
	{
		/*
			数组的基本操作:
     1:数组基本操作:
       获取元素:          元素类型 变量 =  数组名[index];
       设置元素:          数组名[index] = 值;
       遍历数组元素: 建议使用for循环,事先知道循环的次数.
       数组长度:  int len = 数组名.length;  length是属性,不是方法.
       索引范围:  从0开始,逐一递增.   [0,数组名.length-1]
    2:操作数组常见异常:
       NullPointerException:空指针异常(空引用).
            当数组还未初始化,就直接操作数组.
        String[] bs = null;
        System.out.println(bs.length)
       ArrayIndexOutOfBoundsException:数组的索引越界异常.

		*/
		int[] nums = new int[]{1, 2, 3, 4, 5};

		int one = nums[0]; //获取数组第一个元素
		int end = nums[nums.length - 1]; // 获取数组最后一个元素

		System.out.println("nums数组的长度为:" + nums.length); // 数组长度
		System.out.println("nums数组第一个数为:" + one);
		System.out.println("nums数组最后一个数为:" + end);
		System.out.println("=======================" );

		nums[0] = 100;  //更改数组第一个元素的值
		nums[nums.length - 1] = 500;// 更改第二个
		System.out.println("nums数组第一个数为:" + nums[0]);
		System.out.println("nums数组最后一个数为:" + nums[nums.length - 1]);
		System.out.println("=======================" );

		//System.out.println(nums[0]);
		//System.out.println(nums[1]);
		//System.out.println(nums[2]);
		//System.out.println(nums[3]);
		//System.out.println(nums[4]);
		for (int index = 0;index < nums.length;index ++ ) //遍历打印数组元素
		{
			System.out.println(nums[index]);
		}
		
		System.out.println("=======================" );

		// 需求: 用for循环来更改设置数组元素(暂能把所有数组元素更改成一样的,不知道能不能更改设置不同的值)
		for (int index = 0;index < nums.length; index ++ )
		{
			nums[index] = 250;
			System.out.println(nums[index]);
		}
		System.out.println("=======================" );
		


		
	}
}

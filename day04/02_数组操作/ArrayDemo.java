//数组的定义
public class ArrayDemo
{
	public static void main(String[] args)
	{
		/*
			数组: 在程序设计中,为了处理方便,把具有相同类型的若干变量按有序的形式组织起来的一种数据形式.这些按一定
					顺序排列的同类型数据的集合称为数组. 数组中的每一个数据称之为数组元素,数组中的元素以索引来表示
					其存放的位置,索引从0开始,步长是1.
			数组的定义:	1) 数组元素的类型[] 数组名; 如: int[] ages; 推荐这种
						2) 数组元素的类型 数组名[];  int ages[];
						注意: 数组必须先初始化(赋值操作), 才能使用, 因为初始化表示在内存中分配空间
		*/

		/* 1)   
		// 静态初始化  特点:有我们自己来为每一个数组元素设置初始化值,而数组的长度由系统(JVM)决定
		// 静态初始化语法:    数组元素类型[]  数组名 = new 数组元素类型[]{元素1,元素2,元素3,.......};
			 举例:
			   int[] nums = new  int[]{1,3,5,7,9};
		*/

		int[] ages1 = new int[]{1,2,3,4,5};
		System.out.println(ages1.length);  //打印数组的长度,多少个元素

		ages1 = new int[]{1,2,3};
		System.out.println(ages1.length);

		ages1 = null;  // null 表示没有引用任何内存空间
		

		// 2)
		//int ages[];

		/*
			数组的动态初始化操作:
			  特点:由我们来设置数组的元素个数(数组长度),而每一个数组元素的初始值有系统决定.
			  语法:    数组元素类型[]  数组名 = new  数组元素类型[ length ];
					 比如:
					 int[] ages = new  int[100];
		 */
		 int[] ages = new int[3];
		 System.out.println(ages.length); //打印数组的长度,多少个元素


		 ages = new int[5];
		 System.out.println(ages.length); //打印数组的长度,多少个元素

		
	}

}
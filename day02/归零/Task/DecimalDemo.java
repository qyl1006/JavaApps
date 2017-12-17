/*   小数类型
	顾名思义 就是用来表示 小数的 
	1) float 表示单精度类型
	2) double 表示双精度类型

	需求: Test小数类型
*/

//演示类
public class DecimalDemo
{
	public static void main(String[] args)
	{
		//测试
		float f = 31.223F;
		double d = 4.254D; //后面可以不加D 因为小数类型默认double

		//int num = 3.14E2;  //编译报错 
	}
	
}

/*
	1) Java里只有浮点型的变量才可以接受科学计算式结果  其它类型因为精度问题
	2) double float 都不能精度的表示精确的小数 例如 银行系统数据精度的要求  
	3) BigDecimal类型，它表示任意精度的数据  可以解决 2) 的精度需求
*/
/*
	数据溢出 定义: 当要表示的数据超出数据类型的临界范围时，称为溢出。溢出情况发生时程序并没有做数据范围检查处理，此时会出现数据紊乱情况。

	需求: 演示数据溢出
	步骤:	1) 测试一个int数据的最大值加 1 出现的结果 与 int的最少值减 1 出现的结果   
			2) 把上述过程转换成二进制进行运算 分析对比1)所得结果 找到其原因
			  
*/

//测试类
class OverFlowDemo
{
	public static void main(String[] args)
	{
		//int最大值
		int intMax = 2147483647;
		//打印 intMax + 1的结果
		System.out.println(intMax + 1);  //-2147483648

		//int的最少值
		int intMin = -2147483648;
		//打印intMin减 - 1 的结果
		System.out.println(intMin - 1); // 2147483647
	}
}

//总结启示: 在进行较大数据运算的时候,应考虑数据溢出异常问题
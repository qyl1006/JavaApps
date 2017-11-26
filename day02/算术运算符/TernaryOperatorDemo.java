//三元运算符
public class TernaryOperatorDemo
{
	public static void main(String[] args)
	{
		//需求:给一个小数,需要求出其四舍五入的结果,,怎么完成该问题?
		/*
			思路步骤分解分析
			1) 获取3.49的整数部分---------3
			2) 获取3.49的小数部分----3.49---0.49
			3) 把0.49和0.5做比较:
						0.49 >=0.5  ----------3+1
						0.49<0.5 -------------3

			三元运算符格式:
			数据类型 变量 = boolean表达式 ? 值1 : 值2;

			如果boolean表达式的结果是true, 三元运算表达式结果就是值1;
				boolean表达式的结果是false, 三元运算表达式结果就是值2


		*/
		double num = 3.5123 ;

		int num1 = (int)num; //整数部分
		double num2 = num - num1;
		System.out.println(num2);

		int abc = num2 >= 0.5 ? num1 + 1 : num1;
		System.out.println(abc);
	
	    //比较两个值,找出最大/小值
		int a = 20;
		int b = 22;
		String max = a >= b ? "最大值:" + a : "最大值:" + b;
		System.out.println(max);

		//判断一个数是否是偶数或奇数
		int c = -22223;
		String parity = c % 2 == 0 ? "偶数" : "奇数";
		System.out.println(parity);
	}
}
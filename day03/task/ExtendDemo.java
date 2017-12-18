/*
	需求:
		1、计算 5 个月的生活大概开销（spending），比如
		rent（房租）        = 800.00
		mealCost（吃饭）    = 900.00
		clothingCosts（买衣服） = 300.00
		otherCosts（其他费用）    = 300.00


		2、计算 12 个月贷款利息之和（totalInterest）。假如学费(tuition) 16000.00，每月利率（rate）1%，不用利滚利。

		3、定义一个 int 变量(unfinishedCount)存放当前你作业未完成次数，定义一个 String 变量(result)存放三元运算符返回的结果，达到 3 次或以上就存放“开除”，否则存放“还在”。

		4、定义一个 int 变量存放一个三位数的正数，分别求出百位数上的值、十位数上的值和个位数上的值。
			
*/


//测试类
public class ExtendDemo
{
	public static void main(String[] args)
	{
		//第一个问题
		double rent = 800;
		double meal_cost = 900;
		double clothing_costs = 300;
		double other_costs = 300;
		double sum = rent + meal_cost + clothing_costs + other_costs;
		System.out.println("5个月的生活开销为: " + sum);

		//第二个问题
		double interests = 16000.00 * (1.0 / 100.0);
		System.out.println(interests);

		//第三个问题
		int i = 2;
		String s = i >= 3 ? "开除" : "还在";
		System.out.println(s);

		//第四个问题
		int a = 234;
		int nnn = a / 100;//a百位数的数字
		int nn = (a - nnn * 100) / 10; //十位数的数字
		int n = a % 10; //a个位数的数字
		System.out.println("百位数: " + nnn + " 十位数:" + nn + " 个位数:" + n);
		
	}
}
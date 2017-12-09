//方法的可变参数
public class VariableParameterDemo
{
	//需求:编写一个方法,统计使用数组传递过来的总和.
	static double getSum1(double[] arr, double discount)
	{
		double sum = 0.0;
		for (int index = 0; index < arr.length ; index ++ )
		{
			sum += arr[index];
		}
		return sum * discount;
	}

	static double getSum2(double[] arr, double discount)
	{
		double sum = 0.0;
		for(double price : arr)
		{
			sum += price;
		}
		return sum * discount;
	}

	//可变参数方法   可变参数必须作为方法的最后一个参数,避免参数的歧义性,---方法最大只有一个可变参数
	static double getSum3(double discount, double ... arr)
	{
		double sum = 0.0;
		for(double price : arr)
		{
			sum += price;
		}
		return sum * discount;

	}


	//调用方法测试
	public static void main(String[] args)
	{
		double[] arrs = new double[]{10.0, 20.0, 30.0, 40.0};
		System.out.println(getSum1(arrs, 0.8));
		System.out.println(getSum2(arrs, 0.8));

		System.out.println(getSum3(0.8,10.0, 20.0, 30.0, 40.0));
	}

}
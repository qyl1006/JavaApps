//�����Ŀɱ����
public class VariableParameterDemo
{
	//����:��дһ������,ͳ��ʹ�����鴫�ݹ������ܺ�.
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

	//�ɱ��������   �ɱ����������Ϊ���������һ������,���������������,---�������ֻ��һ���ɱ����
	static double getSum3(double discount, double ... arr)
	{
		double sum = 0.0;
		for(double price : arr)
		{
			sum += price;
		}
		return sum * discount;

	}


	//���÷�������
	public static void main(String[] args)
	{
		double[] arrs = new double[]{10.0, 20.0, 30.0, 40.0};
		System.out.println(getSum1(arrs, 0.8));
		System.out.println(getSum2(arrs, 0.8));

		System.out.println(getSum3(0.8,10.0, 20.0, 30.0, 40.0));
	}

}
//�������������
public class OverloadedDemo
{
	/*
		�������������(overload):
			���ط����Ķ�������ͬһ�����У�ĳ�����������һ�����ϵ�ͬ��������ֻҪ���ǵĲ����б�ͬ���ɡ�

			�������ص����ã�������ͬһ���ܵķ������ڲ�����ͬ����ɷ������Ʋ�ͬ��
	*/
	//����: ��ͬһ����,�ֱ�������������,С��֮�͵ķ���
	// ������������֮�͵ķ���
	static int getSum(int a, int b)
	{
		return a + b;
	}
	
	// ��������С��֮�͵ķ���
	static double getSum(double a, double b)
	{
		return a + b;
	}
	
	//����
	public static void main(String[] args)
	{
		double sum = OverloadedDemo.getSum(54, 78);
		System.out.println(sum);
	}
}
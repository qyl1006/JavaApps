//������
public class Demo3
{
	public static void main(String[] args)
	{
		//���� 2/1��3/2��5/3��8/5��13/8��21/13...���������е�ǰ20��֮�͡�
		double sum = 0;
		double sum2 = 0;
		for (int i = 1;i <= 20 ;i ++ )
		{
			sum += Test.fn(i + 1); //ǰ20λ���з�ĸ֮��
			sum2 += Test.fn(i);		//ǰ20λ���з���֮��
		}
		System.out.println(sum);
		System.out.println(sum2);
		System.out.println(sum / sum2);
	}
}

//�ݹ�  (��n�����ķ�ĸ)
class Test
{
	public static double fn(int n)
	{
		if ( n == 1)
		{
			return 1.0;
		}else if (n == 2)
		{
			return 2.0;
		}else
		{
			return fn(n - 1) + fn(n - 2);
		}
	}
}
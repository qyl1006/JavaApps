public class RecursiveDemo
{
	//�����ݹ� 쳲��������� ��ͨ�ʽΪ��F��0��=0��F(1)=1��Fn=F(n-1) +F(n-2)��n>=3��n��N*��
	static int fn(int n)
	{
		if (n == 0)
		{
			return 0;
		}else if (n == 1)
		{
			return 1;
		}else   //��˼��: n������1 �� 0ʱ 
		{
			return fn(n - 1) + fn(n - 2);
		}
	}

	public static void main(String[] args)
	{
		int a = RecursiveDemo.fn(17);
		System.out.println(a);
	}
	
}
//������
public class Demo
{
	public static void main(String[] args)
	{
		//��ӡ�� [1, 500] ֮���� 5 �ı�����֮�͡�
		int sum = 0;
		for (int i = 1;i <= 500 ; i ++ )
		{
			if (i % 5 == 0)
			{
				sum += i;
			}
		}
		System.out.println(sum);
		System.out.println("=================");

		//��ӡ�� [1, 100] ֮������ 10 ��������
		int counter = 0;//������
		for (int i = 100; i >= 1  ;i --)
		{
			if (i % 2 != 0)
			{
				System.out.println(i);
				counter ++;
				if (counter == 10)
				{
					return;
				}
			}
		}
		
	}
}

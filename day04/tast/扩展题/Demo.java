//������
public class Demo
{
	public static void main(String[] args)
	{
		//����2: �ҳ� [1, 500] ֮��ż���ĸ�����
		int count = 0;// ż��������
		for (int i = 1;i <= 500 ; i++ )
		{
			if (i % 2 == 0)
			{
				count ++;
			}
		}
		//��ӡ
		System.out.println("ż���ø���Ϊ:" + count);

		//����3 [1, 500] ֮�������� 7 �������ܺ͡��� [1, 1000] ֮��������3������ 5 ����������
		// 1)
		int sum = 0;// ��
		for (int i = 1;i <= 500 ;i ++ )
		{
			if (i % 7 == 0)
			{
				sum += i;
			}
		}
		System.out.println(sum);

		// 2)
		int count2 = 0;//������
		for (int i = 0;i <=1000; i ++ )
		{
			if (i % 3 == 0 && i % 5 == 0)
			{
				count2 ++;
			}
		}
		System.out.println(count2);


		//����4: ��ӡ [1, 100] �������������� 1��4��9��...�� PS ��������˼!!!!

	}
}
//return����ѭ�����
public class ReturnDemo
{
	public static void main(String[] args)
	{
		// return��� ��ʾ����ѭ�����ڵķ���(main), ������������, ѭ���ṹ��Ȼҳ������
		for (int i = 1; i <= 10 ; i ++ )
		{
			if (i == 4)
			{
				continue;
			}
			System.out.println(i);
		}
		System.out.println("------ending----");
		System.out.println("============");

		//�� continue ��� �����Ƚ�
		for (int i = 1; i <= 10 ; i ++ )
		{
			if (i == 4)
			{
				return;
			}
			System.out.println(i);
		}
		System.out.println("------ending----"); // return֮��,��������,��Ȼ�����ڵ�return����ĵĶ���ִ��
	

	}
}	


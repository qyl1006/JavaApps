//continue����ѭ�����
public class ContinueDemo
{
	public static void main(String[] args)
	{
		// continue��� ��ʾ ���� ��ǰ��ε�ѭ��, �̶�������һ��ѭ��.
		//ע��: continue֮������,ִ�в���, ����д.���﷨����

		//����: ��1����10, ������4��ʱ��,����
		for (int i = 1; i <= 10 ; i ++ )
		{
			if (i == 4)
			{
				continue;
				//System.out.println("====="); //����: �޷����ʵ����
			}
			System.out.println(i);
		}
		System.out.println("============");

		//����: �����ӡ100��200֮�䲻�ܱ�4��������.
		for (int i = 100; i <= 200 ; i ++ )
		{
			if (i % 4 == 0)
			{
				continue;
			}
			System.out.println(i);
		}
	}
}
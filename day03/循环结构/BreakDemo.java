//����ѭ���ṹ
public class BreakDemo
{
	public static void main(String[] args)
	{
		//break �ؼ��� ������ǰ���ڵ�ѭ��
		// ע�� break֮������, ִ�в���,, ����д��,���﷨����
		for (int i = 1; i <= 10  ; i ++ )
		{
			System.out.println(i);
			if (i == 5)
			{
				break;
				//System.out.println("==="); // �ᱨ�� 
			}
		}
		System.out.println("\t" + "=======");

		// ����: ��ӡ��1��100ǰ10��4�ı���������.
		int count = 0;
		for (int i = 1; i <= 100 ; i ++ )
		{
			if (i % 4 == 0)
			{
				System.out.println(i);
				count ++;
				if (count == 10)
				{
					break;
				}
			}
		}
	}
}
//forѭ��
public class ForDemo
{
	public static void main(String[] args)
	{
		/*
			forѭ��:
				��ʽ��
				for(��ʼ�����;boolean���ʽ;ѭ����������)
				{
					ѭ�������
				}

		*/
		//����: ��100��˧��
		for (int count = 1; count <= 500 ; count ++ )
		{
			System.out.println("˧��" + count);
		}

		//����: ��ӡ1��100
		for (int num = 1; num <= 100 ; num ++ )
		{
			System.out.println(num);
		}

		// ����1��100����������֮��
		int result = 0;
		for (int number = 1; number <= 100 ; number ++)
		{
			result += number;
		}
		System.out.println(result);
		//System.out.println(number); // ����ᱨ��ForDemo.java:34: ����: �Ҳ�������  ԭ��:����number��������
	

	}
}
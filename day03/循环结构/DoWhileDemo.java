// do while ѭ��
public class DoWhileDemo
{
	public static void main(String[] args)
	{
		/*
			do whileѭ��:
				��ʽ��
				do
				{
					  ѭ�������
				}
				while(boolean���ʽ);
		*/
		//����: ��500ʤ˧��,,��ӡ500��˧��
		int count = 0;
		do
		{
			System.out.println("˧��" + (count + 1));
			count ++;
		}
		while (count < 500);

		// ��ӡ1��100
		int num = 0;
		do
		{
			
			System.out.println(num+1);
			num ++;
		}
		while (num < 100);

		//����: ����1��100����������֮��
		int num1 = 1;
		int result = 0;
		do
		{
			result += num1;
			num1 ++;
		}
		while (num1 <= 100);
		System.out.println(result);

	}
}
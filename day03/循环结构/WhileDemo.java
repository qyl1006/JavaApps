//while���
public class WhileDemo
{
	public static void main(String[] args)
	{
		/*
			whileѭ��:
			��ʽ��
			while(boolean���ʽ)
			{
					ѭ����s
			}
			
		*/
		// ����: ��ӡ500��˧��
		int count = 0;
		while (count < 500)
		{
			count ++;
			System.out.println("˧��" + count);	
		}
		System.out.println("ending--------");
		
		
		//����: ��1����100 , ��ӡ1---100
		int num = 1;
		while (num <= 100)
		{
			System.out.println(num);
			num ++;
		}

		//���� : ����1��100����������֮��
		int num1 = 1;
		int result = 0;
		while (num1 <= 100)
		{
			result += num1;
			num1 ++;
		}
		System.out.println(result);

	}

}
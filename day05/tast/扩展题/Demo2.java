//������
public class Demo2
{
	public static void main(String[] args)
	{
		//��ӡ�� 5 �еĵ��������Ρ�
		
		for (int i = 1; i <= 10 ; i ++ )
		{
			for (int j = i; j < 10; j ++ )
			{
				System.out.print(" ");
			}
			for (int n = 1;n <= i ; n++ )
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
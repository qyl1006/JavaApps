//ȫ��ѭ��
public class NestedDemo
{
	public static void main(String[] args)
	{
		//����: �ĸ���ÿ���˶���1����100
		for (int m = 0; m < 4 ; m++)
		{
			for (int n = 0; n < 100 ; n++)
			{
				System.out.println(n + 1);
			}
			System.out.println("=================");
		}
		//����ѭ����ѭ��������m�Σ���ѭ����ѭ��������n�Σ���ô�ڲ�ѭ����ѭ��������Ҫ m * n�Ρ�
		//���Ƕ��ѭ��һ��ѭ���� 4*100 ��

		//Ƕ��ʵ��
		for (int n = 1; n <= 5; n ++ )
		{
			for (int m =1; m <= n ; m ++ )
		    {
				System.out.print("*");
			}
			System.out.println();
		}
	}
		
		
}
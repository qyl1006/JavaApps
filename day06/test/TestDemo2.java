//������
public class TestDemo2
{
	public static void main(String[] args)
	{
		//  1)
		double d = -23.8;//�����¶�
		String s = "����";
		if (d < 0.0 && s == "����")
		{
			System.out.println("����");
		}else if (d < 0.0 && s == "����")
		{
			System.out.println("����");
		}else if (d > 0.0 && s == "����")
		{
			System.out.println("��ů");
		}else if (d > 0.0 && s == "����")
		{
			System.out.println("��ů");
		}



		//  2)
		int a = 3;
		int b = 4;
		int c = 5;
	
		
		//����
		System.out.println(Test.judgment(a, b, c));

		int[] arr = new int[3];
		System.out.println(arr[0]); //  0?
	}
}


//����һ����
class Test
{
	public static int judgment(int a, int b, int c)
		{
			if (a == b && a == c)
			{
				return 2;
			}else if (a == b)
			{
				return 1;
			}else if (a == c)
			{
				return 1;
			}else if (b == c)
			{
				return 1;
			}else
			{
				return 0;
			}
		}

	int[] arr;
		
}
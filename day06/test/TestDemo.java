/*
	ע�� ��½ϵͳ ʹ�ö�ά���ݴ洢����.ing  �ڿ�	
*/
//�û�ϵͳ
class TestSystem
{
	private static int[][] arr = new int[10][2];
	
	public static int[] sign = new int[10];//��ע���־��

	//ע���û�
	public static void register(int user, int password)
	{
		for (int index = 0;index < arr.length ;index ++ )
		{
			if (arr[index][0] == user)
			{
				System.out.println("����ע��,���½");
				return;
			}else if (arr[index][0] == 0)
			{
				
				arr[index][0] = user;
				arr[index][1] = password;
				sign[index] = index;
				System.out.println("��ϲ��ע��ɹ�,���½");
				return;
			}else
			{
				System.out.println("ע������������, �´���");
				return;
			}
		}
	}

	//��½ϵͳ
	public static void logIn(int user, int password)
	{
		for (int index = 0; index < arr.length ;index ++ )
		{
			if (user == arr[index][0] && password == arr[index][1])
			{
				System.out.println("��ϲ! ��½�ɹ�");
				return;
			}else
			{
				System.out.println("�˺Ż����벻��ȷ");
				return;
			}
		}
	}

	//(����Ա)��ӡ��ʾ"���ݿ�" �˺�����
	public static void print()
	{
		for (int index = 0;index < arr.length ;index ++ )
		{
			System.out.println("�˺�" + (index + 1) + ":" + arr[index][0]);
			System.out.println("�˺�" + (index + 1) + "����:" + arr[index][1]);
		}
	}
}

//�û�ע���־�ж�
class Sign
{
	public static int judgment(int j)
	{
		int[] arr = TestSystem.sign;
		for (int index = 0;index < arr.length ;index ++ )
		{
			if (arr[index] == j)
			{
				return 1;
			}else
			{
				return 0;
			}
		}
	}
}



//������
public class TestDemo
{
	public static void main(String[] args)
	{
		//ע��
		TestSystem.register(12306, 112233);
		TestSystem.register(12301, 112233);
		TestSystem.register(12302, 112233);
		TestSystem.register(12303, 112233);
		TestSystem.register(12304, 112233);
		TestSystem.register(12305, 112233);
		
		//��½
		TestSystem.logIn(12306, 1122333);

		//����Ա���� �鿴�˺�����
		TestSystem.print();
	}
}
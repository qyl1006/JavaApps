/**
	����: �������ͼ�εľ���ͼ��
			��: *****       $
				*****		$$
				*****		$$$	
*/

//ͼ���ӿڹ淶
interface Patternable
{
	void print();
}

//�Ǻ�ͼ��ʵ����
class Asterisk implements Patternable
{

	public void print()
	{
		System.out.println("�Ǻ�*�ľ���ͼ��Ϊ:");
	}
}

//@ͼ��ʵ����
class Aite implements Patternable
{
	public void print()
	{
		System.out.println("@�ľ���ͼ��Ϊ:");
	}
}

//��Ԫ$ͼ��ʵ����
class Dollars implements Patternable
{
	public void print()
	{
		System.out.println("��Ԫ$�ľ���ͼ��Ϊ:");
	}
}

//������ͼ��������
class Rectangles
{
	public static void enter(Patternable p, String s)
	{
		p.print();
		for (int i = 0;i < 3 ; i ++ )
		{
			for (int j = 0;j < 10 ;j ++ )
			{
				System.out.print(s);
			}
			System.out.print("\n");
		}
	}
}

//������ͼ��������
class Triangle
{
	public static void enter(Patternable p, String s)
	{
		p.print();
		for (int i = 1;i < 6 ; i ++ )
		{
			for (int n = 1;n <= i ; n ++ )
			{
				System.out.print(s);
			}
			System.out.print("\n");
		}
	}
}

//������
public class RectangleDemo
{
	public static void main(String[] args)
	{
		//������Ԫ$���Ŷ���
		Patternable p = new Dollars();
		Rectangles.enter(p, "$");

		Triangle.enter(p, "$");

		
		//������Ԫ$���Ŷ���
		Patternable p2 = new Asterisk();
		Rectangles.enter(p2, "*");

		Triangle.enter(p, "*");


		//������Ԫ$���Ŷ���
		Patternable p3 = new Aite();
		Rectangles.enter(p3, "@");

		Triangle.enter(p, "@");

		
	}
}
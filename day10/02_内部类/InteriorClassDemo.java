//������֤֤��ʵ���ڲ��������
//�ⲿ��
class Test
{
	String	name = "�ⲿ���ԱTest.name";

	//�ڲ���
	static class Test2
	{
		static String name = "�ڲ����Ա";
		public void print()
		{
			
		}
	}

	public void print()
	{
		
	}
}

//������
public class InteriorClassDemo
{
	public static void main(String[] args)
	{
		System.out.println(123);

		//������̬�ڲ������
		Test.Test2 t = new Test.Test2();

		System.out.println(Test.Test2.name);
	}
}
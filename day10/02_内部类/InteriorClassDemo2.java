//������֤֤��ʵ���ڲ��������
//�ⲿ��
class Test
{
	String	name = "�ⲿ���ԱTest.name";

	//�ڲ���
	class Test2
	{
		String name = "�ڲ����Ա";
		public void print()
		{
			String name = "�ڲ��෽���ڱ���";
			
			System.out.println("�ڲ������ֱ�ӷ����ⲿ���Ա " + name);
			System.out.println(Test.this.name);
		}
	}

	public void print()
	{
		System.out.println("�ⲿ�෽�� " + new Test2().name);
	}
}

//������
public class InteriorClassDemo2
{
	public static void main(String[] args)
	{
		//����Test2����
		Test t = new Test(); //Test����
		t.print();
		System.out.println(t.name); //nameͨ��Test��������
		//���Ƶ� ʵ���ڲ���Ķ��� ͨ���ⲿ�����������
		Test.Test2 t2 = t.new Test2();
		System.out.println(t2);
		t2.print();
	}
}
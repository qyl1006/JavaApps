/*
	����:   �ֱ����Ǹ���ͬ�ķ���,������
			1)�޲����޷���
			2)�޲����з���
			3)�в����޷���
			4)�в����з���
		�ܽ�: �����з��صķ���,Ӧ�ö���һ������ֵ���Ӧ�����ͱ���ȥ���ܷ��صĽ��.

*/
//������
public class MethodDemo2
{
	public static void main(String[] args)
	{
		
		//���Ը�������
		Test m = new Test();  //����Test����	
		//�޲����޷���
		m.a();

		//�޲����з���
		m.b();
		int i = m.b();
		System.out.println(i);
		
		//�в����޷���
		m.c("�в����޷���");

		//�в����з���
		m.d("�в����з���");
		String s = m.d("�в����з���");
		System.out.println(s);

	}
}

//�Զ��巽��
class Test
{
	//�޲����޷���
	public void a()
	{
		System.out.println("�޲����޷���");
	}

	//�޲����з���
	public int b()
	{
		System.out.println("�޲����з���");
		return -1;
	}

	//�в����޷���
	public void c(String s)
	{
		System.out.println(s);
	}

	//�в����з���
	public String d(String s)
	{
		return s;
	}
}
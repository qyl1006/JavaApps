/*
	�ܽ�:  ���巽����������
				 1):�Ƿ���Ҫ���巵��ֵ����.
			     2):�Ƿ���Ҫ��ʽ����.

*/

//�Զ��巽��
class Test
{
	//1 ����һ������multiply,��������������int���Ͳ����ĳ˻�
	public int multiply(int i , int j)
	{
		return i * j;
	}

	//2 ����һ������isFive����һ��int���Ͳ��� ����5�ı�������true ���򷵻�false
	public boolean isFive(int i)
	{
		if (i % 5 == 0)
		{
			return true;
		}else
		{
			return false;
		}
	}

	//����һ������checkWorkOrReset,���ݴ���Ĳ���(int����), ����[1  5]��ӡ������ [6 7]��Ϣ�� �����Ƿ�����
	public void checkWorkOrReset(int i)
	{
		if (1 <= i && i <= 5)
		{
			System.out.println("������");
		}else if (i == 6 || i == 7)
		{
			System.out.println("��ĩ��Ϣ��");
		}else
		{
			System.out.println("�����������û����һ��,����������,лл!");
		}
	}

	//����һ������printValueѭ����ӡ , ����(int����) �ʹ�ӡ����(String)�ɲ�������
	public void printValue(int i , String s)
	{
		for (int j = 0;j < i ;j ++ )
		{
			System.out.println(s);
		}
	}

}

//������
public class TestsDemo
{
	public static void main(String[] args)
	{
		//����Test�Ķ���
		Test t = new Test();
		//����
		// 1) �������������ĳ˻�
		System.out.println(t.multiply(5, 4));  //20

		// 2) ����5�ı�������true ���򷵻�false
		System.out.println(t.isFive(11));

		//  3) �жϹ����� ��ĩ
		t.checkWorkOrReset(6);

		//  4) ����printValueѭ����ӡ , ����(int����) �ʹ�ӡ����(String)�ɲ�������
		t.printValue(5, "���! ����!");

		
	}
}
/*
	����:   ����һ��Servant ������ name �� age ����״̬,���� ��ˡ�������ϴ�����Щ����
			ServantDemo �ഴ�� Servant ��Ķ�������״̬��������Щ����

*/

//����һ��Servant��,������ ��� ���� ϴ�� �Ĺ���
class Servant
{
	String name; //���� ��ʼֵΪnull
	int    age; //����  ��ʼֵΪ0

	//����"���"���ܵķ���
	void shoping()
	{
		System.out.println("�������..........");
	}

	//����"����"���ܵķ���
	void cook()
	{
		System.out.println("��������......");
	}

	//����"ϴ��"���ܵķ���
	void wash()
	{
		System.out.println("ϴ���.....");
	}

}


//������
public class ServantDemo
{
	public static void main(String[] args)
	{
		//����Servant�����xiaoli
		Servant xiaoli = new Servant();
		//System.out.println(xiaoli);  //��ϣ��:Servant@15db9742
		xiaoli.name = "С��";
		xiaoli.age = 20;

		//����С��������� ���-->����--->ϴ��Ĺ���
		xiaoli.shoping();
		xiaoli.cook();
		xiaoli.wash();
	}
}


/*
	�ܽ�: 1)����һ��������ͬ����(�ֶ�) ��Ϊ(����)����, Ȼ��ͨ����������Ķ������������з���ʵ��һЩ����,���Ҳ�ͬ����
			(ʹ����)�������ظ�����,����Ҫ�ظ�д����.
		  
		  2)��������Ҫע��: ��������ĸ��д,�շ��ʾ��; ����ʹ��public������ô���ļ���������������ͬ,���򱨴�


*/
//�����������
class Humanity
{
	String name; // ����
	int age;	 // ����

	static int totalPeople = 10; //������

	//�Զ��幹����
	Humanity(String n, int a)
	{
		name = n;
		age = a;
		totalPeople ++;
	}

	//����һ���˵ķ���
	void died()
	{
		System.out.println("ȥ��ing---------");
		totalPeople --;
	}

	//���������ķ���
	static void perish()
	{
		System.out.println("��������....");
		totalPeople = 0;
	}

}

//��ʾstatic���η�
public class StaticDemo
{
	public static void main(String[] args)
	{
		System.out.println(Humanity.totalPeople);

		Humanity i = new Humanity("С��", 18);

		System.out.println(Humanity.totalPeople);
		System.out.println(i.totalPeople); //���ݸ�(Humanity��)�ഴ���������κζ���,�����Է���static��Ա,,���䱾����Ȼʹ����������,�Ͷ���û���κι�ϵ(ͨ�������뿴����)


		//����died()
		i.died();
		System.out.println(Humanity.totalPeople);

		//
		Humanity.perish();
		System.out.println(Humanity.totalPeople);
	}
}
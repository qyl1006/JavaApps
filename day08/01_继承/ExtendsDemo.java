/*
	ʲô�Ǽ̳й�ϵ:
	����ĳ������Զ���Ķ��������չ���������µ����ඨ�壬������Լ̳и���ԭ����ĳЩ���壬Ҳ��������ԭ��������û�еĶ��壬���߸�д�����е�ĳЩ���ԡ�

	�﷨��ʽ: �ڶ��������ʱ���������Լ���Ҫ��չ����һ������.
			public  class  ��������    extends    ��������


*/

//����һ������people
class people
{
	private String name;
	protected int age;
}

//��ʦ��
class Teacher extends people
{
	void teaching()
	{
	}
}

//ѧ����
class Student extends people
{
	void task()
	{
	}
}



//������
public class ExtendsDemo
{
	public static void main(String[] args)
	{

		Student s = new Student();
		System.out.println(s.age);
	}
}
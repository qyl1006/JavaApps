//this �ؼ���
//����: ����һ��User��,�ṩname,age�ֶ�,�Լ���Ӧgetter/setter����.
class User
{
	//�ֶ�ʹ��private���� �������, Ϊ�����ݰ�ȫ��
	private String name;
	private int age;

	//������
	User()
	{
		System.out.println(this);
	}

	//����getter/setter����
	//��ȡ�ֶ�ֵ
	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}

	//�����ֶ�ֵ
	public void setName(String name)
	{
		this.name = name;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	//��ӡ��ǰ�����name��age��ֵ
	public void print()
	{
		System.out.println(this.name + " , " + this.age);
	}

	//��ӡhello
	public void hello()
	{
		System.out.println("���! " + this.name);
		this.print();
	}


}

//������
public class ThisDemo
{
	public static void main(String[] args)
	{
		User u = new User();
		System.out.println(u);
		//����name��age
		u.setName("С��");
		u.setAge(17);

		//��ȡ�ֶ�ֵ
		//String m = u.getName();
		System.out.println(u.getName());

		//int i = u.getAge();
		System.out.println(u.getAge());

		u.print();

		User u2 = new User();
		u2.setName("��");
		u2.setAge(18);
		u2.print();

		u2.hello();

	}
}
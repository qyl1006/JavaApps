//����װ�ĸ���
class Student
{
	String name;
	private int age;

	int set(int i)
	{
		if (i < 0)
		{
			System.out.println("���䲻��Ϊ����");
		}
		age = i;
		return age;
	}
	
}


//��ʾ��
public class StudentDemo
{
	public static void main(String[] args)
	{
		Student a = new Student();
		a.name = "С��";
		a.set(-17);
		//System.out.println(a.name + " , " + a.age);
		System.out.println(a.set(17));
	}
}
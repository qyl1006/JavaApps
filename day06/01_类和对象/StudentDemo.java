//��������ѧ���������?
class Student
{
	String name;
	int age;
	boolean ifPayment;

	void payment()
	{
		ifPayment = true;
		int a = 110;
		System.out.println(a);
	}
}


//������
public class StudentDemo
{
	public static void main(String[] args)
	{
		//����4��Student�����
		Student s1 = new Student();
		s1.name = "С��";
		s1.age = 13;

		Student s2 = new Student();
		s2.name = "����";
		s2.age = 12;
		s2.ifPayment = true;

		Student s3 = new Student();
		s3.name = "����";
		s3.age = 13;
		s3.ifPayment = true;

		Student s4 = new Student();
		s4.name = "������";
		s4.age = 13;

		//����һ������洢Student�����
		Student[] arr = new Student[]{s1, s2, s3, s4};
		
		//�ж�ÿ��ѧ���ɷ����, û�нɷѵĵ��÷���payment()�ɷ�
		for (Student ele : arr)
		{
			if (!ele.ifPayment)
			{
				ele.payment();
				
			}
			System.out.println(ele.ifPayment);
			//int b = ele.payment(); //ÿ����������һ��ջ֡ ����mainջ֡��Ҫ��������paymentջ֡return����a��ֵ ------�ڴ�ģ��
			
			ele.payment();
		}
		
		//����JAVA�ڴ�ģ�������Ƿ�����ʲô...
		System.out.println("==================");
		//���˵�������Ԫ�ؾ��Ƕ�ӦԪ�����õ��ڴ�ռ�ĵ�ֵַ
		System.out.println(s1);
		System.out.println(arr[0]);  

		//���˵������Ĳ��������Ĳ��� ���ǲ�����ֵַ����Ӧ���ڴ�ռ�
		s1.name = "test";  
		System.out.println(arr[0].name);
		arr[0].name = "test02";
		System.out.println(s1.name);

	}
}
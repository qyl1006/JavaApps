/*
	����: �����ĸ�ѧ�������ŵ������У����������е�ѧ�������δ��ѧ�ѵ�ѧ��������ɷѵķ���
	
	����: 1 ����һ��Student��,������ѧ�������� ������ֶ�, ������ɷѵķ���
          2  ����4��ѧ������ ����һ���������ڴ��
		  3  ��������--->forѭ��ÿ��ѧ������---->if�ж��Ƿ�ɷ�--->���÷����ɷ�
			
*/
//����ѧ����
class Student
{
	String name; //����
	int    age;   //����
	boolean ifPay; //�ɷ�״̬  Ĭ�ϳ�ʼ��false

	//�ɷѷ���--
	void payment()
	{
		ifPay = true;// -----> ����ifPay״̬(boolean)
	}
}


//������
public class StudentDemo
{
	public static void main(String[] args)
	{
		//�����ĸ�ѧ������ ifPay״̬ʹ��Ĭ�ϳ�ʼ����false
		Student s1 = new Student();
		s1.name = "С��";
		s1.age = 12;

		Student s2 = new Student();
		s2.name = "����";
		s2.age = 14;

		Student s3 = new Student();
		s3.name = "����";
		s3.age = 11;

		Student s4 = new Student();
		s4.name = "����";
		s4.age = 12;

		//����һ������ �����ѧ������
		Student[] arr = new Student[]{s1, s2, s3, s4};

		//�������鲢�ж��Ƿ�ɷ�---->��false---->���÷����ɷ�
		
		for (int i = 0;i < arr.length ; i ++)
		{
			System.out.println("����: " + arr[i].name + " ����: " + arr[i].age + " �ɷ�״̬:"+ arr[i].ifPay);
			if (!arr[i].ifPay)
			{
				arr[i].payment();
			}
			System.out.println("����: " + arr[i].name + " ����: " + arr[i].age + " �ɷ�״̬:"+ arr[i].ifPay);
		}
		
	}
}

//z�ܽ�: ����������մ��Student����ʱ,��Ҫע��Ԫ������ΪStudent
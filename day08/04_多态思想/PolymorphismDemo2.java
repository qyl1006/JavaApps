//	��̬ʱ������������				
//������ ����
class Animal
{
	public static void print()
	{
		System.out.println("Animal��̬ʱ�����������֤����֤");
	}
}

//���� ����
class Dog extends Animal
{
	public static void print()
	{
		System.out.println("Dog ��̬ʱ�����������֤����֤");
	}

}

//��ʾ������
public class PolymorphismDemo2
{
	public static void main(String[] args)
	{	
		//��һ����� print�������ڸ���Animal��, ������Dog������
		Animal a = new Dog();
//		a.print();  //���: ����ͨ��,ִ�д�ӡ "Animal��̬ʱ�����������֤����֤" Ӧ���ȵ�Dog����print����,�Ҳ���,�ٵ�������.����û�б���.
		
		//�ڶ������ print��������Dog���,�����ڸ�����
//		a.print(); //��� ������� ����ʱ��,��ȥ��������(Animal)�����Ƿ���print����:
					//						 ��    ��:����ͨ��.
					//						 �Ҳ���:���뱨��.

		//��������� print���������ڸ���Animal������Dog��
//		a.print();//��������ͨ�� ��ӡ "Dog ��̬ʱ�����������֤����֤"  ������ʱ��,������������(Dog)�еķ���

		//���������  print��������ڸ���Animal������Dog��,��print����ʹ��static��̬����
		a.print();//�������н��Ϊ: "Animal��̬ʱ�����������֤����֤"  Ϊʲô? ��Ϊ��̬��������ֻ��Ҫ��Ϳ���,
					//   ���ʹ�ö��������þ�̬����,��ʵʹ�õ��Ƕ���ı������������þ�̬����.  �Ͷ���û�й�ϵ.

   
	}
}
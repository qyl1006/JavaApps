///  �ֶβ����ڶ�̬����					

class Animal
{
	public String name = "������";

	public void print()
	{
		System.out.println("��ӡ������");
	}

}

class Dog extends Animal
{
	public String name = "����"; 

	public void print()
	{
		System.out.println("��ӡ����");
	}
}


//��ʾ������
public class FieldDemo
{
	public static void main(String[] args)
	{
		Animal a = new Dog();
//		Dog d = new Dog();
		a.print();

		System.out.println(a.name); //�����ʾ"������" Ϊʲô? ͨ����������ֶ�,�ڱ���ʱ�ھ��Ѿ������˵�����һ���ڴ�ռ������.
										//--------->�ֶβ����ڸ��ǵĸ���,�ڶ�̬ʱ,�����ж�̬����(������ʱ��������������).

										//ֻ�з������и��ǵĸ���.

	}
}
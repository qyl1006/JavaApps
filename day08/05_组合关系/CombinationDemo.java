//��Ϲ�ϵ
// Ϊ����ʾ��Ϲ�ϵ���� ʹ�ö�����͹���,,��ʵ����Ӧ��ʹ�ü�����ϵ���Ӻ���,,,,,��A����B���һ���������,�ü̳�ʵ��  ����ʹ�����ʵ��

//������
class Animal
{
	public void sleep()
	{
		System.out.println("����һ��...");
		System.out.println("�Ҹ���....");
		System.out.println("˯������........");
	}
}

//����
class Dog
{
	private Animal a = new Animal();
	public void print()
	{
		a.sleep();
	}

}

//������
public class CombinationDemo
{
	public static void main(String[] args)
	{
		Dog d = new Dog();
		d.print();  //ok
	}
}
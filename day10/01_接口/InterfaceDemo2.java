//�ӿڵ�ʹ��

//���ж���淶
interface Crawlable
{
	void print();
}

//ˮ������滮
interface Swimmingable
{
	void print();
}

//����ӿ��� 
class Dog implements Crawlable, Swimmingable
{
	public void print()
	{
		System.out.println("����");
	}
}

//������
public class InterfaceDemo2
{
	public static void main(String[] args)
	{
		System.out.println(11);

		Crawlable c = new Dog();
		c.print();
	}
}
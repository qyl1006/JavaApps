//����̬˼�뼰���ĺô��ص�
//���������� ����
class Animal
{
	private String naem;
	private int     age;

	public void eat()
	{
		System.out.println("----ιʳ����-----");
	}
}

//�������� ����
class Dog extends Animal
{
	public void eat()
	{
		System.out.println("-----ι����---");
	}

	//����
	public void guard()
	{
		System.out.println("---����----");
	}
	
}

//����è��
class Cat extends Animal
{
	public void eat()
	{
		System.out.println("------ιè��-------");
	}

	//ץ����
	public void mouse()
	{
		System.out.println("-------ץ����-------");
	}
}

//����ι��Ա
class People
{
	//ι������
	public void feed(Animal a)   // ��̬������ʱ�ڻ���ֳ��������������(��������ķ���). ���� a.eat()�е�a

	{
		System.out.println("-----ι����------");
		a.eat();
		////��������� instanceof �����ж�  instanceof  �����: �жϸö����Ƿ���ĳһ�����ʵ��.
		//�﷨��ʽ��boolean b = ����A   instanceof  ��B;  // �ж� A�����Ƿ��� B���ʵ��,�����,����true.
		if (a instanceof Dog)     
		{
			Dog d = (Dog)a;     //������������ǿ��ת��(�ͻ�����������ת���﷨��ʽһ��)
			d.guard();
		}else if (a instanceof Cat)
		{
			Cat c = (Cat)a;
			c.mouse();
		}
	}
}




//��ʾ������
public class PolymorphismDemo
{
	public static void main(String[] args)
	{
		Animal a = new Dog();  //�����������µ����ӵ�ʱ��,��̬�Ͳ�����
		Animal b = new Cat();   ///��ν��̬: ������ж�����̬,������Դ��ڲ�ͬ����ʽ. Animal �� Dog �� Cat��̬


		Cat c = new Cat();
		People p = new People();

		p.feed(c);

		Dog d = new Dog();
		p.feed(d);
	}
}
//����ĳ�ʼ������

//������ ����
class Animal
{
	private String name;
	private int age;

	//������
	Animal(String name, int age)
	{
		this.name = name;
		this.age = age;
		System.out.println("01 Animal������ " + "�ȵ��ø��๹����");
	}

	//��ȡ
	public String getName()
	{
		return name;
	}

}

//���� ����
class Dog extends Animal   // �̳и���Animal
{
	private String colour; //��ɫ
	
	//������
	Dog(String name, int age, String colour)
	{
		super(name, age);  //�����в����ĸ��๹����  ���ø��๹����仰,������Ϊ���๹�����ĵ�һ�仰  ��thisһ��
		System.out.println("02 Dog������ " + "֤��������������ȵ��ø��๹���� ");
		this.colour = colour;
	}

	public void print()
	{
		//System.out.println(colour);
		System.out.println(colour + "��" + getName());
	}
}

//������ʾ��
public class SubclassDemo
{
	public static void main(String[] args)
	{
		//��������Dog����
		Dog d = new Dog("ɵ��", 10 ,"��ɫ");
		d.print();

	}
}
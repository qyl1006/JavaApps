//��ν���ؾ��ǡ��ڱΡ�����˼��
// ������
class Animal
{
	public String name = "����";
	public int age;
}

// ����
class Dog extends Animal
{
	public String name = "ɵ��";
	public int age;

	//��ӡ
	public void print()
	{
		System.out.println(name); // ɵ��
		System.out.println(super.name); // ���� ����̳еķ���Ȩ���£����ظ����ֶΣ��������ж�����ֶκͳ����е��ֶ�����ͬ(��������)����ʱ�������ظ����ֶΣ���ʱֻ��ͨ��super���ʱ����ص��ֶ�
	}

	public String toString()    //���Ǹ���Object��toString()����
	{
		return this.name + ", " + this.age + ".";

	}
}


//������
public class HideDemo
{
	public static void main(String[] args)
	{
		//����Dog��Ķ���
		Dog d = new Dog();
		d.print();

		System.out.println(d);
		System.out.println(d.toString()); // ��ӡ����d��ʵ�ʹ�ӡd.toString()һ���� ,,��Ϊprintln()Ҳ�ǵ��� toString()��
 
	}
}
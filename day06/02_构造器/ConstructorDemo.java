//������
class Constructors
{
	String name;

	//�Զ��幹����
	Constructors(String m)
	{
		System.out.println("12345");
		System.out.println(m);

		name = m; //��m��ֵ��ֵ��name�ֶ� // 1 ���Ը��ֶν��г�ʼֵ /2 ���������ֶ�ֵ
	}
}

//�����Զ��幹����
public class ConstructorDemo
{
	public static void main(String[] args)
	{
		//new Constructors();  //����Constructors����, �޲����Ĺ����� ���Ա���: û�в���.. 
		new Constructors("xiaoming");  // ����Constructors����, ����һ��int��Ĳ����� 
	}
}
//final���η�  final����ĺ����ǡ����յ�,���ɸı�ġ������������ηǳ����࣬�ǳ��󷽷��ͱ�����
//ע�⣺���췽������ʹ��final���Σ���Ϊ���췽�����ܱ��̳У��϶������յġ�


//final class SupClass   //���� FinalDemo.java:8: ����: �޷�������SupClass���м̳�
class SupClass
{
	//final public void print(){}   //����:FinalDemo.java:11: ����: SubClass�е�print()�޷�����SupClass�е�print()
	
	//final�����������ͱ���
	public String name = "����"; 
}

class SubClass extends SupClass
{
	public void print(){}

	public static void name()
	{
		System.out.println("123");
	}
}

//��ʾ��
public class FinalDemo
{
	public static void main(String[] args)
	{

		//final����
		final int NUM_DOG = 10;

//		NUM_DOG = 11;  //���뱨��  FinalDemo.java:25: ����: �޷�Ϊ���ձ���NUM_DOG����ֵ



		//����SupClass����,,�������� fanil ���ε� ���� final���ε��������ͱ������ɱ� �����õĵ�ַ ���� �ڴ�ռ������?
		final SupClass s = new SupClass();
		System.out.println(s.name);

		s.name = "�ı������ڴ�ռ������";
		System.out.println(s.name); //������������
		
		//��newһ������ ��ζ�Ŵ���һ���µ����õ��ڴ��ֵַ
	//	s = new SupClass(); //���뱨��: FinalDemo.java:39: ����: �޷�Ϊ���ձ���s����ֵ

		SubClass.name();
	}
}
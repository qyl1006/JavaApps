public class CharDemo
{
	public static void main(String[] args)
	{
		//char����
		char c = 97;
		System.out.println(c);
		
		char c3 = '\u0061';
		char c2 = 0x0061;
		char c4 = 'a';
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println("================");

		//float double ����
		//float f = 3.14; //����CharDemo.java:17: ����: ������ʧ����  С������Ĭ��double ���� �Ӹ�ת�� �������ݻ����
		float f = 3.14F;  //float���ͳ��������F
		System.out.println(f);

		double d = 3.14;  //С��Ĭ�� double���� ���������D
		System.out.println(d);
	}
}
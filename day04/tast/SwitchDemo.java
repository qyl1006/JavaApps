/**
	switch���ṹ�ĸ�ʽ���£�
		switch(���ͱ��ʽ){
			case Aֵ:
					���ʽ�����������1ʱ��ִ�д���䣻
			break��
			case Bֵ:
					���ʽ�����������2ʱ��ִ�д���䣻
			break��
				...
									 case Cֵ:
					���ʽ�����������Nʱ��ִ�д���䣻
			break��

			default:
					����ֵ��������ʱ��ִ�д���䣻
			break��//һ�㲻д
		}

	����: �����������һ��������֮��,��������ϰ�;��������Ӱ�,
	PS ͨ��������֤�� Switchֻ֧��int����(String �� ö��)
*/

//������
public class SwitchDemo
{
	public static void main(String[] args)
	{	
		//�ַ���
		String s = "������";
		switch(s)  //������õ�: switch (s1.hashCode())  ���ش��ַ����Ĺ�ϣ�� �ײ㻹��int����
		{
			case "����һ" : 
			case "���ڶ�" : 
			case "������" : 
			case "������" : 
			case "������" : System.out.println("�����ϰ�");break;
			case "������" : 
			case "������" : System.out.println("����Ӱ�");break;
		}

		//ö��
		switch(Today.G) //������õ�:[Today.G.ordinal()]) 
		{
			case A:break;
			case B:break;
			case C:break;
			case D:break;
			case E:break;
			case F:break;
			case G:System.out.println("test");break;
		}
	}
}

//����
enum Today
{
	A,B,C,D,E,F,G;
}

//�ܽ�: ����:switch����ֻ��֧��int����
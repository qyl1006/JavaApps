//��ֵ����� = += -+ *= /= %=
public class AssignmentOperatorDemo
{
	public static void main(String[] args) 
	{
		///���ǵĹ��ܾ��� ��������ֵ
		String name = "Dive"; // = ��ֵ
		System.out.println(name);

	
		int a =10;
		a += 5; //�ȼ��� a = a + 5;  
		System.out.println(a); //15


		short s = 30;  //����short����
		//s = s + 5; //�ᱨ��,,��Ϊshort���� �� int����(����5)��ͬ����,��Ҫint����תshort����(����s),,��ת��--s = (short)(s + 5); 
		s += 5; //�����ֵ��ʽ�и��ص�: �Դ���������ת��..
		System.out.println(s);

		//������ֵ���� += ��������
	
	}
}
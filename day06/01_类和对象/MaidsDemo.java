// Ӷ������ /���� / Ӷ�˶��� / ����Ӷ�˵�״̬����Ϊ
/*
	�������
	��Ķ���:
---------------------------------------------------------------
[���η�]  class   ����
{
       0~N����Ա����(�ֶ�/Field),��Ҫ������(JavaBean�������һ�ֳ�Ա).
       0~N������
}
------------------------------
�������ע��:
    1):�����ʹ����public���η�,���뱣֤��ǰ�ļ����ƺ͵�ǰ������ͬ.
    2):����ʹ�����Ʊ�ʾ,���ʾĳһ������,����ĸ��д,����Ƕ���������ʹ���շ��ʾ��.
          ��: EmployeeAdvanceSetting.
    3):���������Ĺ�����,��λ�������ʱ��,ר��Ϊ���������ṩһ����,���಻��Ҫmain����.
        ����ר���ٶ���һ��������/��ʾ�������г���.

*/
class Maids
{
	//״̬
	String name; //����
	int age;  //����

	//��Ϊ/����
	void shoping()
	{
		System.out.println("���");
	}
	void cook()
	{
		System.out.println("����");
	}
	void wash()
	{
		System.out.println("ϴ��");
	}

} 

class Coder
{
	void daima()
	{
		System.out.println("�ô���");
	}
}


//Maids��Ĳ���
public class MaidsDemo
{
	public static void main(String[] args)
	{
		//������һ��Maids��Ķ���
		Maids m = new Maids();

		/*
			1):������������������﷨:
				 ����  ����  =  new  ����();
			2):���ֶ�����ֵ:
				 �������.�ֶ��� = �����͵�ֵ;
			3):��ȡ�ֶε�ֵ:
				 ���ֶ�����  ���� = �������.�ֶ�ֵ;
			4):ͨ��������÷���.
				 �������.����(ʵ��);

		*/

		//���ֶ�����ֵ
		m.name = "xiaoling";  // ��Ҫע�ⶨ�������ֶε���������,�������Ӧ����������
		m.age = 18;

		//��ȡ�ֶε�ֵ
		String i = m.name; // ��ȡ�ֶ�ֵʱ  ��ע����յı���Ӧ�ú��ֶ�ֵ����������һ��
		System.out.println(i);
		System.out.println(m.name);

		int j = m.age;
		System.out.println(j);
		System.out.println(m.age);

		//ͨ��������÷���
		m.shoping();
		m.cook();
		m.wash();

		Coder c = new Coder();
		c.daima();

	}
}
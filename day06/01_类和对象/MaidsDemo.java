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

	//��Ϊ/���� //(����)
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
		//����ĳ��� ����
		//������һ��Maids��Ķ���m1
		Maids m1 = new Maids();

		//���ֶ�����ֵ
		m1.name = "xiaoling";  // ��Ҫע�ⶨ�������ֶε���������,�������Ӧ����������
		m1.age = 18;

		//������һ��Maids��Ķ���m2
		Maids m2 = new Maids();
		m2.name = "Lsan";  
		m2.age = 18;
		
		//������һ��Maids��Ķ���m3
		Maids m3= new Maids();
		m3.name = "Lsan"; 
		m3.age = 18;

		//��ȡ�ֶε�ֵ
		String i = m1.name; // ��ȡ�ֶ�ֵʱ  ��ע����յı���Ӧ�ú��ֶ�ֵ����������һ��
		System.out.println(i);
		System.out.println(m1.name);

		int j = m1.age;
		System.out.println(j);
		System.out.println(m1.age);

		System.out.println("===================");
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);

		/*
			����Ƚϲ���:
				 ==��:	���ڻ�������������˵,�Ƚϵ��� ֵ.
						������������������˵,�Ƚϵ������ڴ��е� ��ֵַ.
						ÿ��ʹ��new�ؼ���,����ʾ�ڶ�ֵ�¿���һ���ڴ�ռ�,��ͬ���ڴ�ռ�,��ֵַ��ͬ.
		*/
		System.out.println(m1 == m3); // false

		System.out.println(new Maids().age = 18); // new Maids().age = 18  ���Ǹ���������  ֻ��ʹ��һ��
		System.out.println("===================");

		//ͨ��������÷���
		m1.shoping();
		m1.cook();
		m1.wash();
		
		Coder c = new Coder();
		c.daima();

	}
}
//��ʾ�ӿڵĹ���ɷ�  

//����һ���ӿ�  �ӿ��﷨: [public](���η�) interface �ӿ���{}
interface Jumpable
{
	/*
	jumpable()
	{
	}
	˵��: �ӿ��в����й����� �ᱨ�� Ҳ����˵����new ���ܴ������� ���ܶ�����ͨ���� ��������һ������ķ���
	*/
	//public static void test(){} //����
	void test(); //����ͨ��--- �ӿ��ж���ķ������ǹ����ĳ��󷽷� Ĭ��ʹ��public abstract

	//Integer a;// �ᱨ�� Ϊʲô? �ӿ��Ǹ��������� ��Ҳ��, ��ͬ�� �������г�Ա����(ָĬ��ֵ)��ʹ�ýӿ���?
	Integer A = 10;//ͨ��������: Ĭ��ʹ��public static final������ ��Ա���� ֱ�Ӷ��������е�
					//         ���� �ײ㻹�����Զ�װ�� Ȼ���ڸ�ֵ
	class Abc //�ӿ��п������ڲ��� Ĭ�Ϲ�����̬�� public static����
	{
	}

	
}


//��ʾ��
public class InterfaceDemo
{
	public static void main(String[] args)
	{
		System.out.println(21);
		//new Jumpable(); //����: Jumpable�ǳ����; �޷�ʵ���� ��Ϊ�ӿ�Ҳû�й�����,����newҲ����

	}
}
////���������
public class ArithmeticOerators
{
	public static void main(String[] args)
	{
		char c1 = 'Z';//char����תint����
		int i1 = c1;
		System.out.println(i1); //65

		//-----------------
		//���������
		//������
		System.out.println(10 + 5);
		System.out.println(10 - 5);
		System.out.println(10 * 5);
		System.out.println(10 / 5);

		//�����ַ�
		System.out.println('A' + 'Z');  //155

		//�����ַ���
		System.out.println("A" + "Z");


		//ע�ⲿ��
		System.out.println(10 / 3);//3 ������ʹ�ó��Ų���ʱ���õ��Ľ����Ϊ������С�����ֺ��ԣ�
		System.out.println(9877 / 1000 * 1000); //9000
		//System.out.println(10 / 0);// �쳣: by zero
		System.out.println("----------");
		System.out.println(10.0 / 0);// Infinity  �������
		System.out.println(0.0 / 0.0);//NaN Not a Number
		System.out.println(10 == 10); //true
		System.out.println(10 % 3);// 1 ȡģ  ȡ����
		
	}
}
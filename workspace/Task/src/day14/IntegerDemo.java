package day14;
/*
 * ����:---> ��ʾ��װ���ʹ�� �� ��װ��-������������-String���໥ת��
 * */
public class IntegerDemo {
	public static void main(String[] args) {
		//��ȡ��װ��ĳ���
		System.out.println("���ֵ:" + Integer.MAX_VALUE);
		System.out.println("���ֵ:" + Integer.MIN_VALUE);
		
		//�������ͺ� ��װ���͵�ת��
		//װ��
		Integer i = Integer.valueOf(110);
		//����
		int a = i.intValue();
		
		//String �ͻ������� / ��װ����֮���ת������
		//��Stringת��Ϊ��װ������
		Integer i2 = new Integer("520");
		Integer i3 = Integer.valueOf("520");
		//�Ѱ�װ����� ת��String
		String s = i2.toString();
		
		//�ѻ�����������ת��ΪString
		String s2 = 23 + "";
		
		//��Stringת��Ϊ������������
		int b = Integer.parseInt(s2);
		
		
	}
}
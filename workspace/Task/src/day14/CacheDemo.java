package day14;
/*
 *  ��ʾ-->��װ��Ļ���----ͨ���������ӶԱ�(Integaeװ��)
 *  
 *  �ܽ�: ��װ���еĻ������(��Ԫģʽ),���ʾ��ǻ������:
			Byte��Short��Integer��Long������[-128��127]��������ݣ�
			Character������[0��127]���������
 * */

public class CacheDemo {
	public static void main(String[] args) {
		//��ʽ1 װ��
		Integer a1 = new Integer(120);
		Integer a2 = new Integer(120);
		System.out.println(a1 == a2);//false == �Ƚϵ����ڴ��ֵַ ÿ��new ���Բ�����
		
		//��ʽ2 װ��
		Integer a3 = Integer.valueOf(120);
		Integer a4 = Integer.valueOf(120);
		System.out.println(a3 == a4); //true--> valueOf()�����ȵ�������[-128 127]ȥ��,������ڻ�������Χ��,��ô��newһ��ռ�
									
		System.out.println("================================================");
		
		//��ʽ1 װ��
		Integer a11 = new Integer(130);
		Integer a21 = new Integer(130);
		System.out.println(a11 == a21);//false 
		
		//��ʽ2 װ��
		Integer a31 = Integer.valueOf(130);
		Integer a41 = Integer.valueOf(130);
		System.out.println(a31 == a41); //false
	}
}

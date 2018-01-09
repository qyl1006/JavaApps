package day17.char_sequence;
/*
 * ��ʾ: StringBuilder��ĳ��÷���
 * �ܽ�: StringBuilder�������ǲ��ɱ仯��,�����ɾ��������new����,�����Ķ��Ǵ�����-->�������ָ���char����ռ�
 * 		StringBuilderû��ʹ��synchronized����,û��ͬ������,�����ڶ��߳�ͬʱ����(��׷��)ʱ,���ݻ���ܲ���ȫ	
 */

public class StringBuilderDemo {
	public static void main(String[] args) {
		//��������
		StringBuilder sb = new StringBuilder();// ����������AbstractStringBuilder�Ĺ�����,����Ҳ�洢�ڸ����ֶ�value������
		System.out.println(sb.capacity()); //16 Ĭ��
		
		//׷�� ���� -->���������ݶ���ͨ������ķ��������-->��ת�����ַ���-->�м���ж��Ƿ�����-->str.getChars()���<---����ǵ�������ĸ��Ʒ���
		sb.append(123);
		System.out.println(sb);
		
		//charAt(int index) ����ָ��������char
		System.out.println(sb.charAt(2)); //3
		
		//ɾ��
		sb.deleteCharAt(2);
		System.out.println(sb);
		
		//
		System.out.println(sb.length());
	}
}
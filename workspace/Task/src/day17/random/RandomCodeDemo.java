package day17.random;

import java.util.Random;
/*
 * ����: ��ʾ������֤��
 * 
 * �ܽ�: ʹ��StringBuilder��������֤���Լ�ڴ����ܺ�-->�������Զ����ַ���(5)
 */

public class RandomCodeDemo {
	public static void main(String[] args) {
		String str = "QAZXSWEDCVFRTGBNHYUJMKIOLP";
		str += str.toUpperCase();
		str += "1234567890";
		str += "1234567890";
//		System.out.println(new Random().nextInt(12));
		StringBuilder sb = new StringBuilder(5); //
		for (int i = 0; i < 5; i++) {
			sb.append(str.charAt(new Random().nextInt(str.length())));
		}
		System.out.println(sb);
	}
}
package com._520it._05_random;

import java.util.Random;

public class RandomCodeDemo {
	public static void main(String[] args) {
		//����: ����5λ�����
		//1) ׼��������ĸ(��Сд)������ ���� ��ȡ
		String str = "qazxswedcvfrtgbnhyujmkiolp";
		str += str.toUpperCase();
		str += "0123456789";

		//ʹ��StringBuilder 5λ 
		StringBuilder random = new StringBuilder(5);
		
		for (int i = 0; i < 5; i++) {
			random.append(str.charAt(new Random().nextInt(str.length())));
		}
		System.out.println(random);
		
		System.out.println("=======================================");
		
		/*ģ�������֤��֤��  test  �������������� ���û�֮��  ��ô��������:
		 1) ��֤������ʱ��Ӧ��ÿ��һ���趨ֵ��ˢ��   ��֤���ǲ�����Ҫ���ռ������� ?��ʱ��?
		 2) ÿ���û�Ӧ���ǵ����и���֤�� ��֤ʱҲӦ���Ƕ�Ӧ�� ?
		 3) �û�����֤��֮����ô����һ����ϵ����˵��Ӧ��ϵ��?
		 4) ��֤�����������ʱ��,������֤�ɹ��󶼻᲻��,Ӧ�ò���Ҫ�����ڴ����洢 
		 5) ���� �� ��� ��ôʵ��?
		 6) �ڿ�ing
		*/
		 
		String enter = random.toString();
		//String enter = "1j3Ja";
		
		boolean b = enter.equalsIgnoreCase(random.toString());
		System.out.println(b);
	}

}
package day17.random;

import java.util.concurrent.ThreadLocalRandom;

/*
 * ��ϰThreadLocalRandom��ķ���
 * �ܽ�: ����Random�������,, ���������Ե���Random�ķ���
 * 		ThreadLocalRandomͨ��  ThreadLocalRandom.current()����������
 */
public class ThreadLocalRandomDemo {
	public static void main(String[] args) {
		ThreadLocalRandom random = ThreadLocalRandom.current(); // ��������
		System.out.println(random.nextInt(34, 179)); //����[34, 179)֮��������
	}
}

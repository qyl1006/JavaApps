package com._520it.day01._03thread_create;

//ͨ����������ʵ��Runnable�ӿڵ���,����ʵ��run����,�κο��Է�������ʵ��(�������),
// �ڴ���Threadʱ��Ϊһ�����������ݲ�����.

//����Runnableʵ����
class PlayMusics implements java.lang.Runnable{
	public void run() {
		for (int i = 0; i < 50; i ++){
			System.out.println("������" + i);
		}
	}
	
}

public class ImplementsRunnable {
	public static void main(String[] args) {
		for (int i = 0; i < 50; i++) {
			System.out.println("����Ϸ" + i);
			if (i == 10) {
				Runnable r = new PlayMusics();
				Thread t = new Thread(r);
				t.start();
			}
		}
	}

}

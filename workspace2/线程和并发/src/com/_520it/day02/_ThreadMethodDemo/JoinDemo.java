package com._520it.day02._ThreadMethodDemo;
//��ʾ�����߳�
//�ܽ�: �̵߳�join������ʾһ���̵߳ȴ���һ���߳���ɺ��ִ�С�join����������֮���̶߳���������״̬��

public class JoinDemo {
	public static void main(String[] args) throws InterruptedException {
		Thread j = new Join();
		for (int i = 0; i < 200; i++) {
			System.out.println("main���߳�������:" + i);
			if(i == 0){
				j.start();
			}
			if(i == 50){
				j.join();
			}
		}
	}
}

class Join extends Thread{
	public void run(){
		for (int i = 0; i < 200; i++) {
			System.out.println("��Ҫ������,�Ҵ�ͷ" + i);
		}
	}
}
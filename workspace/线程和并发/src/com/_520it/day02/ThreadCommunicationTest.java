package com._520it.day02;

//�߳�ͨ��  
//�ܽ�: wait��notify����,ֻ�ܱ�ͬ������������������,���򱨴�IllegalMonitorStateException
//		ע��lock���ķ���λ��,

public class ThreadCommunicationTest {
	public static void main(String[] args) {
		
		//����  �����߳�
		//����Runnable����
		MiddleDemo m = new MiddleDemo();
		new Thread(new ProducerDemo(m)).start();
		new Thread(new ConsumerDemo(m)).start();
		
	}
}

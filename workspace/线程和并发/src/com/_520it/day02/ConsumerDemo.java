package com._520it.day02;


//Runnableʵ����--->������--�����߳�ȥ����
public class ConsumerDemo implements Runnable{
	private MiddleDemo m;
	
	ConsumerDemo(MiddleDemo m){
		this.m = m;
	}
	
	//�������߳�
	public void run() {
		for (int i = 0; i < 4; i++) {
			m.consumption();
			System.out.println("������--��û��˯ѭ������" + (i + 1));
		}
	}

}

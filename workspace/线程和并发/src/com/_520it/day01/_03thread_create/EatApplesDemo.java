package com._520it.day01._03thread_create;


//����:��һ��ƻ��(50),ƻ����Ψһ�ı��(��1 2 3 ),���������˿�ʼ��ƻ������,Ҫ���֮ǰչʾƻ���ı��,Ȼ��Ե�,���ͳ��ÿ���˳Ե�ƻ������

public class EatApplesDemo {
	public static void main(String[] args) {
	
		//��������EatGame����ʼ����
		for (int i = 5; i > 0 ; i --) {
			if (i == 1){
				System.out.println("������ʼ:");
				new EatGame("СA").start();
				new EatGame("СB").start();
				new EatGame("СC").start();
			}
		}
	}

}

//ʹ�ü̳�Thread����ʵ��
class EatGame extends java.lang.Thread{
	private static int apple = 50;
	
	EatGame(String s){
		super(s);
	}
	
	public void run(){
		int count = 0;
		while(apple > 0){
				System.out.println(super.getName() + "�ѱ��Ϊ:" + apple-- + "��ƻ���Ե�.");
				count ++;
		}
		System.out.println(super.getName() + "һ������" + count + "��ƻ��..");	
	}
}

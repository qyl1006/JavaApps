package day19.thread_create;
/*
 * ��ʾ: ʹ�ü̳з�ʽ�����������߳�
 * �ܽ�: ����һ���ಢ�̳�->class A extends Thread-->ע�⸲�Ǹ���Thread�ķ���run()
 * 	
 * 		ǧ��Ҫ����run����,�������run�����ñ��Ƕ�����÷���,��Ȼ����ֻ��һ���߳�,��û�п����µ��߳�.

 */
public class ExtendsThreadDemo {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("����ʱ:");
		for (int i = 5; i > 0 ; i--) {
			Thread.sleep(1000);
			System.out.println(i);
			if(i == 1){
				A a = new A("����");
				a.start();
			}
		}
	}
}

//����һ���ಢʵ��Runnable�ӿ�
class A extends Thread{
	A(String name){
		super(name);
	}
	public void run(){
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(getName() + i + "��-ʹ�ü̳з�ʽ�����������߳�");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
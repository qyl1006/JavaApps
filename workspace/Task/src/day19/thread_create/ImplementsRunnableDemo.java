package day19.thread_create;
/*
 * ��ʾ ʹ��ʵ�ַ������������߳�
 *  �ܽ�: ��Ҫ����run����,�������run�����ñ��Ƕ�����÷���,��Ȼ����ֻ��һ���߳�,��û�п����µ��߳�.
 */
public class ImplementsRunnableDemo {
	public static void main(String[] args) throws InterruptedException {
		for (int i = 3; i > 0; i--) {
			Thread.sleep(1000);
			System.out.println(i);
			if(i == 1){
				new Thread(new As(), "����").start();
				
			}
		}
	}
}

//�����ʵ����
class As implements Runnable{
	public void run(){
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName() + (i + 1) + "���ڹ���..");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
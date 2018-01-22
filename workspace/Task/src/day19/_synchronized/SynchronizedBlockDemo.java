package day19._synchronized;

/*
 * ʹ��ͬ�������ķ�ʽ�����ƻ�������̰߳�ȫ����
 * 
 * �ܽ�: 	ͬ����:
 * 			���ڷ�static����,ͬ��������this.  
      		����static����,����ʹ�õ�ǰ������������ֽ������(Apple2.class).
 */
public class SynchronizedBlockDemo {
	public static void main(String[] args) throws InterruptedException {
		for (int i = 3; i > 0; i--) {
			Thread.sleep(1000);
			System.out.println("��ƻ������ʱ: " + i);
			if (i == 1) {
				Runnable r = new Abs1();
				new Thread(r, "С��").start();
				new Thread(r, "С��").start();
				new Thread(r, "С��").start();
			}
		}
	}
}

//����һ��ʵ�ֵ��� 
class Abs1 implements Runnable {
	private int apple = 500;

	public void run() {
		for (int i = 0; i < 500; i++) {
			eat();
		}
	}

	synchronized public void eat() {
		if (apple > 0) {
			try {
				System.out.println(Thread.currentThread().getName()
						+ "չʾ��Ѹ�ٵس���" + apple + "��ƻ��");
				Thread.sleep(100);
				apple--;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
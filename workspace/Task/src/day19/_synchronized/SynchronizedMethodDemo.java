package day19._synchronized;

import java.util.concurrent.locks.ReentrantLock;

/*
 * ʹ��Lock�������Զ���ȡ��  �ͷ�������� ��ƻ������������ �̰߳�ȫ����
 * 
 * �ܽ�: һ��Ҫע��������ͷŵ�����-->�������һ���˽����������߳�һֱ�ȴ������
 * 			ע��lock����Ĵ�����ʽ --> private final ReentrantLock lock = new ReentrantLock();
 * 			���API,,�������ֳɵľ��䴴����ʽ
 */

public class SynchronizedMethodDemo {
	public static void main(String[] args) throws InterruptedException {
		for (int i = 3; i > 0; i--) {
			Thread.sleep(1000);
			System.out.println("��ƻ������ʱ: " + i);
			if (i == 1) {
				Runnable r = new Abs12();
				new Thread(r, "С��").start();
				new Thread(r, "С��").start();
				new Thread(r, "С��").start();
			}
		}
	}
}

//����һ��ʵ�ֵ��� 
class Abs12 implements Runnable {
	private int apple = 150;
	private final ReentrantLock lock = new ReentrantLock();

	public void run() {
		for (int i = 0; i < 200; i++) {
			eat();
		}
	}

	public void eat() {
		lock.lock();
		try {
			if (apple > 0) {
				System.out.println(Thread.currentThread().getName()
						+ "չʾ��Ѹ�ٵس���" + apple + "��ƻ��");
				Thread.sleep(100);
				apple--;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
}
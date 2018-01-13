package day19._synchronized;

import java.util.concurrent.locks.ReentrantLock;

/*
 * 使用Lock锁机制自动获取锁  释放锁来解决 吃苹果比赛案例的 线程安全问题
 * 
 * 总结: 一定要注意加锁与释放的区域-->容易造成一个人进入了其它线程一直等待的情况
 * 			注意lock对象的创建方式 --> private final ReentrantLock lock = new ReentrantLock();
 * 			多查API,,上面有现成的经典创建方式
 */

public class SynchronizedMethodDemo {
	public static void main(String[] args) throws InterruptedException {
		for (int i = 3; i > 0; i--) {
			Thread.sleep(1000);
			System.out.println("吃苹果倒计时: " + i);
			if (i == 1) {
				Runnable r = new Abs12();
				new Thread(r, "小于").start();
				new Thread(r, "小米").start();
				new Thread(r, "小明").start();
			}
		}
	}
}

//定义一个实现的类 
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
						+ "展示并迅速地吃了" + apple + "号苹果");
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

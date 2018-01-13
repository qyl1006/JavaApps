package day19.thread_create;
/*
 * 演示 使用实现方法创建启动线程
 *  总结: 不要调用run方法,如果调用run方法好比是对象调用方法,依然还是只有一个线程,并没有开启新的线程.
 */
public class ImplementsRunnableDemo {
	public static void main(String[] args) throws InterruptedException {
		for (int i = 3; i > 0; i--) {
			Thread.sleep(1000);
			System.out.println(i);
			if(i == 1){
				new Thread(new As(), "测试").start();
				
			}
		}
	}
}

//定义个实现类
class As implements Runnable{
	public void run(){
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName() + (i + 1) + "正在工作..");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
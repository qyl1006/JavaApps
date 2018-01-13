package day19._synchronized;

/*
 * 使用同步锁解决吃苹果的线程安全问题
 * 
 * 总结: 	同步锁:
 * 			对于非static方法,同步锁就是this.  
      		对于static方法,我们使用当前方法所在类的字节码对象(Apple2.class).

 */
public class LockDemo {
	public static void main(String[] args) throws InterruptedException {
		for (int i = 3; i > 0; i--) {
			Thread.sleep(1000);
			System.out.println("吃苹果倒计时: " + i);
			if(i == 1){
				Runnable r = new Abs();
				new Thread(r, "小于").start();
				new Thread(r, "小米").start();
				new Thread(r, "小明").start();
			}
		}
	}
}

//定义一个实现的类 
class Abs implements Runnable{
	private int apple = 500;
	
	public void run(){
		for (int i = 0; i < 500; i++) {
			synchronized (this) {
			if(apple > 0){
				System.out.println(Thread.currentThread().getName() + "展示并迅速地吃了" + apple + "号苹果");
				apple --;
			}
		  }
		}
	}
}



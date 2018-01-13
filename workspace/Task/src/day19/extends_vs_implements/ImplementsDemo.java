package day19.extends_vs_implements;

/*
 * 用实现方式 演示吃苹果比赛的案例
 */
public class ImplementsDemo {
	public static void main(String[] args) throws InterruptedException {
		for (int i = 3; i > 0; i--) {
			Thread.sleep(1000);
			System.out.println("吃苹果倒计时: " + i);
			if(i == 1){
				Runnable r = new Abs();
				new Thread(r, "小明").start();
				new Thread(r, "小于").start();
				new Thread(r, "小米").start();
			}
		}
	}
}

//定义一个实现的类 
class Abs implements Runnable{
	private int apple = 50;
	
	public void run(){
		for (int i = 0; i < 50; i++) {
			if(apple > 0){
				System.out.println(Thread.currentThread().getName() + "展示并迅速地吃了" + apple + "号苹果");
				apple --;
			}
		}
		
	}
}
package day19.extends_vs_implements;

/*
 * 演示吃苹果案例--继承方式
 * 
 * 
 */
public class ExtendsDemo {
	public static void main(String[] args) throws InterruptedException {
		for (int i = 5; i > 0; i--) {
			Thread.sleep(1000);
			System.out.println("吃苹果比赛倒计时: " + i);
			if (i == 1) {
				System.out.println("比赛开始:");
				new eat("小明").start();
				new eat("小芳").start();
				new eat("小于").start();
			}
		}
	}
}

class eat extends Thread {
	static int apple = 50;

	eat(String name) {
		super(name);
	}

	public void run() {
		for (int i = 0; i < 50; i++) {
			if (apple > 0) {
				//					Thread.sleep(1000);
				System.out.println(getName() + "展示他抢到的苹果" + apple + "号"
						+ ",接着吃了它");
				apple--;
			}
		}
	}
}
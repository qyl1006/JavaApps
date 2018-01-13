package day19.thread_create;
/*
 * 演示: 使用继承方式创建并启动线程
 * 总结: 创建一个类并继承->class A extends Thread-->注意覆盖父类Thread的方法run()
 * 	
 * 		千万不要调用run方法,如果调用run方法好比是对象调用方法,依然还是只有一个线程,并没有开启新的线程.

 */
public class ExtendsThreadDemo {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("倒计时:");
		for (int i = 5; i > 0 ; i--) {
			Thread.sleep(1000);
			System.out.println(i);
			if(i == 1){
				A a = new A("测试");
				a.start();
			}
		}
	}
}

//创建一个类并实现Runnable接口
class A extends Thread{
	A(String name){
		super(name);
	}
	public void run(){
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(getName() + i + "号-使用继承方式创建并启动线程");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

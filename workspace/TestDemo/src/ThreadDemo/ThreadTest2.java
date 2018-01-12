package ThreadDemo;

public class ThreadTest2 implements Runnable{
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(ThreadTest1.i);
			ThreadTest1.i = 222;
			System.out.println(ThreadTest1.i);
		}
	}
	
}
package ThreadDemo;

public class ThreadTest1 implements Runnable {
	public static Integer i = 121;
	public Integer[] ii = new Integer[]{1, 2, 3};
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("�����߳�����״̬...");
		}
	}

}

package ThreadDemo;

public class ThreadDemo {
	public static void main(String[] args) {
		System.out.println("���߳�main");
		for (int i = 0; i < 11; i++) {
			if(i == 10){
				Thread t1 = new Thread(new ThreadTest1());
			 	t1.start();
				Thread t2 = new Thread(new ThreadTest2());
				t2.start();
			}
		}
	}
}

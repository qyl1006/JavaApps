package day19.extends_vs_implements;

/*
 * ��ʵ�ַ�ʽ ��ʾ��ƻ�������İ���
 */
public class ImplementsDemo {
	public static void main(String[] args) throws InterruptedException {
		for (int i = 3; i > 0; i--) {
			Thread.sleep(1000);
			System.out.println("��ƻ������ʱ: " + i);
			if(i == 1){
				Runnable r = new Abs();
				new Thread(r, "С��").start();
				new Thread(r, "С��").start();
				new Thread(r, "С��").start();
			}
		}
	}
}

//����һ��ʵ�ֵ��� 
class Abs implements Runnable{
	private int apple = 50;
	
	public void run(){
		for (int i = 0; i < 50; i++) {
			if(apple > 0){
				System.out.println(Thread.currentThread().getName() + "չʾ��Ѹ�ٵس���" + apple + "��ƻ��");
				apple --;
			}
		}
		
	}
}
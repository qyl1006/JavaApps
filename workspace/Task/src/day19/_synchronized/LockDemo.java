package day19._synchronized;

/*
 * ʹ��ͬ���������ƻ�����̰߳�ȫ����
 * 
 * �ܽ�: 	ͬ����:
 * 			���ڷ�static����,ͬ��������this.  
      		����static����,����ʹ�õ�ǰ������������ֽ������(Apple2.class).

 */
public class LockDemo {
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
	private int apple = 500;
	
	public void run(){
		for (int i = 0; i < 500; i++) {
			synchronized (this) {
			if(apple > 0){
				System.out.println(Thread.currentThread().getName() + "չʾ��Ѹ�ٵس���" + apple + "��ƻ��");
				apple --;
			}
		  }
		}
	}
}


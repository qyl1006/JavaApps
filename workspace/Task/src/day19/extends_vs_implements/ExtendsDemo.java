package day19.extends_vs_implements;

/*
 * ��ʾ��ƻ������--�̳з�ʽ
 * 
 * 
 */
public class ExtendsDemo {
	public static void main(String[] args) throws InterruptedException {
		for (int i = 5; i > 0; i--) {
			Thread.sleep(1000);
			System.out.println("��ƻ����������ʱ: " + i);
			if (i == 1) {
				System.out.println("������ʼ:");
				new eat("С��").start();
				new eat("С��").start();
				new eat("С��").start();
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
				System.out.println(getName() + "չʾ��������ƻ��" + apple + "��"
						+ ",���ų�����");
				apple--;
			}
		}
	}
}
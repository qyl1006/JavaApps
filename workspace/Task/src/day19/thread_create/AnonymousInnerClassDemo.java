package day19.thread_create;
/*
 * ��ʾʹ�������ڲ��ഴ�������߳�
 * 
 *�ܽ�: ע�������ڲ���Ķ����ʽ--new ����() �� �ӿ���(){}
 *
 *	
 */
public class AnonymousInnerClassDemo {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if(i == 8){
				new Thread(new Thread(){
					public void run(){
						System.out.println("ʹ�������ڲ��ഴ�������߳�- �̳� ����");
					}
				}).start();
				
				new Thread(new Runnable(){
					public void run(){
						System.out.println("�ӿ�-ʹ�������ڲ��ഴ���������߳�");
					}
				}).start();
			}
			
			
		}
	}
}
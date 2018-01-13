package day19.thread_create;
/*
 * 演示使用匿名内部类创建启动线程
 * 
 *总结: 注意匿名内部类的定义格式--new 类名() 或 接口名(){}
 *
 *	
 */
public class AnonymousInnerClassDemo {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if(i == 8){
				new Thread(new Thread(){
					public void run(){
						System.out.println("使用匿名内部类创建启动线程- 继承 测试");
					}
				}).start();
				
				new Thread(new Runnable(){
					public void run(){
						System.out.println("接口-使用匿名内部类创建并启动线程");
					}
				}).start();
			}
			
			
		}
	}
}

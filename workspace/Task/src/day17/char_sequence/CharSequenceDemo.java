package day17.char_sequence;
/*
 * 演示; String StringBuilder StringBuffer的性能-->拼接30000次字符串,对比它们各自的消耗时间
 * 总结: String做字符串拼接的时候,性能极低(耗时),原因是Sting是不可变的,每次内容改变都会在内存中创建新的对象.
		 String耗时:1738ms
		 StringBuffer耗时:9ms
		 StringBuilder耗时: 5ms
		 
		 区别: String不可变的  StringBuffer与StringBuilder可变的
	 	StringBuffer:  StringBuffer中的方法都使用了synchronized修饰符,表示同步的,在多线程并发的时候可以保证线程安全,保证线程安全的时候,性能(速度)较低.
  						这也是它慢的原因-->每次拼接操作时只有一个线程在同步方法中操作.
  		StringBuilder:StringBuilder中的方法都没有使用了synchronized修饰符,不安全,但是性能较高.

		 

 */
public class CharSequenceDemo {

	public static void main(String[] args) {
		testString();     //1748
		testStringBuffer();  //9
		testStringBuilder();	//5
	}
	
	private static void testString() {
		long time1 = System.currentTimeMillis();
		String str = "";
		for (int i = 0; i < 30000; i++) {
			str += i;
		}
		long time2 = System.currentTimeMillis();
		System.out.println(time2 - time1);
	}
	private static void testStringBuffer() {
		long time1 = System.currentTimeMillis();
		StringBuffer sb2 = new StringBuffer();
		
		for (int i = 0; i < 30000; i++) {
			sb2.append(i);
		}
		long time2 = System.currentTimeMillis();
		System.out.println(time2 - time1);
	}
	private static void testStringBuilder() {
		long time1 = System.currentTimeMillis();
		StringBuilder sb3 = new StringBuilder();
		for (int i = 0; i < 30000; i++) {
			sb3.append(i);
		}
		long time2 = System.currentTimeMillis();
		System.out.println(time2 - time1);
	}


}

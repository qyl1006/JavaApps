package day17.char_sequence;
/*
 * 演示String类的常用方法-->尝试解读理解源码
 * 
 */
public class StringDemo2 {
	public static void main(String[] args) {
		testString1();
		testString2();
//		testString3();
//		testString4();
		
	}

	private static void testString1() {
		//1):String的创建和转换:
//		byte[] getBytes():把字符串转换为byte数组-->底层调用encode()通过char表把字符转换成byte数-->byte数组
		String str = "ABCD";
		byte[] arr = str.getBytes();
		for (int i = 0; i < str.length(); i++) {
			System.out.println(arr[i]);
		}
//		char[] toCharArray():把字符串转换为char数组--->String本身就是char数组--->调用System.arraycopy方法复制一份返回来
		System.out.println("ABCD".toCharArray()[2]);  // C
		
//		String(byte[] bytes):把byte数组转换为字符串  --->  同1)-->相互转换
		byte[] b = new byte[]{35, 36, 37, 38};
		String ss = new String(b);
		System.out.println(ss);  
		
//		String(char[] value):把char数组转换为字符串--->直接复制一份赋给String的char数组

		char[] c = new char[]{'A', 'B', 'C', '0'};
		System.out.println(c);
	}

	private static void testString2() {
//		2):获取字符串信息
//		int length() 返回此字符串的长度
		System.out.println("123".length());
		
//		char charAt(int index) 返回指定索引处的 char 值-->数组的操作
		System.out.println("123456sdgdsx".charAt(6));
		
//		int indexOf(String str)返回指定子字符串在此字符串中第一次出现处的索引。
		
		
//		int lastIndexOf(String str)返回指定子字符串在此字符串中最右边出现处的索引 
	
	}

	private static void testString3() {
		
	}

	private static void testString4() {
	}

}

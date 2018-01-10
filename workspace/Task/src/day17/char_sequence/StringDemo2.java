package day17.char_sequence;
/*
 * 演示String类的常用方法-->尝试解读理解源码
 * 
 */
public class StringDemo2 {
	public static void main(String[] args) {
//		testString1();
//		testString2();
//		testString3();
		testString4();
		
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
		
//		int indexOf(String str)返回指定子字符串在此字符串中第一次出现处的索引。-->源代码思路(暂不说明偏移和从哪个位置查的情况): 1)for循环-->
										//2) 用while循环找出first第一个(str)char数组元素的索引,之后内嵌一个for循环,用每个字符是否相等作为boolean条件,
										//若全部相等,则返回出现first的索引----语言表达不清晰
		System.out.println("FSFSGFBDSKDFLWS".indexOf("SG")); //3
		
//		int lastIndexOf(String str)返回指定子字符串在此字符串中最右边出现处的索引 --->底层用两个while来实现--第一个循环倒着找最后一个元素........
		System.out.println("FSFSGFBDSKDFLWS".lastIndexOf("SG")); //3
	
	}

	private static void testString3() {
//		3):字符串比较判断
//		boolean equals(Object anObject) 将此字符串与指定的对象比较。--->1)先判断是否相等"==",相等返回true引用地址值.因为String不可变的
																	//2)若是String实例,就转换成char数组,一个个和this数组比,一有不同返回false
		System.out.println("ASDFG".equals("ASDFG"));
		
//		boolean equalsIgnoreCase(String anotherString) 将此 String 与另一个 String 比较，不考虑大小写--->底层调用regionMatches方法--中间全部转为大写比较
		System.out.println("ASDFG".equalsIgnoreCase("ASdfg"));
		
		
//		boolean contentEquals(CharSequence cs) 将此字符串与指定的 CharSequence 比较---->同1)差不多 方法
		System.out.println("ASDFG".contentEquals("ASDFG"));

	}

	private static void testString4() {
//		4):字符串大小写转换
//		String toUpperCase()  把当前字符串转换为大写(谁调用该方法,谁就是当前字符)
		System.out.println("asdfg".toUpperCase());
		
//		String toLowerCase()  把当前字符串转换为小写
		System.out.println("ASDFG".toLowerCase());

	}

}

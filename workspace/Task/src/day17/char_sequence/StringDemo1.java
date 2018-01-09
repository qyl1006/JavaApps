package day17.char_sequence;
/*
 * 演示分析: String面试题目
 * 
 * 面试题1:
   说说String str ="ABC"和String str = new String("ABC")的区别.
   	String  str = "ABC";该代码创建了一个对象或者没有创建String对象.
                    	若常量池存在ABC,则直接引用,若常量池不存在ABC,则先创建对象,再引用.
   	String  str = new String("ABC"); 该代码创建了一个或者两个String对象.
                      				new肯定会创建String对象,(同上).

-----------------------
	总结:  "==" 比较的是 ----1) 基本数据类型-->值
							2)引用数据类型--->引用的地址值<------对象
			equals方法...默认的Object的和"=="一样---->若覆盖了则比较的是内容
 */
public class StringDemo1 {
	private static String getXx() {
		return "AB";
	}
	
	public static void main(String[] args) {
		String str1 = "ABCD";
		String str2 = "A" + "B" + "C" + "D";
		String str3 = "AB" + "CD";
		String str4 = new String("ABCD");
		String temp = "AB";
		String str5 = temp + "CD";
		String str6 = getXx() + "CD";
		
		System.out.println("================================");
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str3 == str2); //以上都为true-->原因:编译器的自动优化
		
		System.out.println("=====================================");
		System.out.println(str1 == str4); //false
		System.out.println(str1 == str5); //false
		System.out.println(str1 == str6); //false  //以上都是false---> 因为temp 与 getXx() 不是字符,所以需要转换成字符,添加到char数组,
		
	}


}

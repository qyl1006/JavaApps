/*
	字符类型(char):字符,字母和符号.
				char类型：表示16位的无符号整数或者Unicode字符，Java对字符采用Unicode字符编码。
				Unicode收集了世界上所有语言文字中的符号，是一种跨平台的编码方式，Java的字符占两个字节，可以表示一个汉字。

	需求: 演示char三种表示形式
*/

//演示类
public class CharDemo
{
	public static void main(String[] args)
	{
//		char c = 'aaa'; //报错 多个字母 
	
		//直接使用单个字符来制定字符常量
		char c2 = 'a';  // 单引号
		System.out.println(c2);

		//直接作为整数类型使用
		char c3 = 97;
		System.out.println(c3);

		//使用十六进制表示
		char c4 = '\u0061';
		System.out.println(c4);
	}

}

//直接注意: char 数据类型是个非负的整数
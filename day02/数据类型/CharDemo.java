///char数据类型
public class CharDemo
{
	public static void main(String[] args)
	{
		//char常量的表示形式
		char c1 = 'A'; //直接表示符号
		System.out.println(c1);

		char c2 = 65; //使用对应的10进制顺序 
		System.out.println(c2);

		char c3 = '\u0041';
		System.out.println(c3); //使用对应的16进制顺序

		//表示汉字
		char c4 = '哥';
		System.out.println(c4);
	}
	
}
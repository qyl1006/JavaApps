////算术运算符
public class ArithmeticOerators
{
	public static void main(String[] args)
	{
		char c1 = 'Z';//char类型转int类型
		int i1 = c1;
		System.out.println(i1); //65

		//-----------------
		//算术运算符
		//操作数
		System.out.println(10 + 5);
		System.out.println(10 - 5);
		System.out.println(10 * 5);
		System.out.println(10 / 5);

		//操作字符
		System.out.println('A' + 'Z');  //155

		//操作字符串
		System.out.println("A" + "Z");


		//注意部分
		System.out.println(10 / 3);//3 整数在使用除号操作时，得到的结果仍为整数（小数部分忽略）
		System.out.println(9877 / 1000 * 1000); //9000
		//System.out.println(10 / 0);// 异常: by zero
		System.out.println("----------");
		System.out.println(10.0 / 0);// Infinity  正无穷大
		System.out.println(0.0 / 0.0);//NaN Not a Number
		System.out.println(10 == 10); //true
		System.out.println(10 % 3);// 1 取模  取余数
		
	}
}
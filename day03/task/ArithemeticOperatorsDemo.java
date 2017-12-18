//算术运算符
/*
	1) 加号：在操作数值、字符、字符串时其结果是不同的，当两个字符相加得到的是ASCII码表值，
    2)当两个字符串相加时表示将两个字符串连接在一起，从而组成新的字符串。
	3)除号：整数在使用除号操作时，得到的结果仍为整数（小数部分忽略），当整数除以0的时候，会引发算术异常。
             正无穷大(Infinity):当一个正浮点类型数除以0时,或者正整数除以0.0时;
              负无穷大(-Infinity):当一个负浮点类型数除以0时,或者负整数除以0.0时;
              NaN(Not a Number):当0.0除以0.0时;
    4)取模(求余数)：模数的符号忽略不计，结果的正负取决于被模数.
		.
  
	 5)尝试用double转成int做运算测试

	需求: 逐个证明佐证上述 5 点
*/

//测试类
public class ArithemeticOperatorsDemo
{
	public static void main(String[] args)
	{

		// 第一个
		char c = 'a';  //97
		char c2 = 'A';	//65
		System.out.println(c + c2);  //162

		//第二个
		String s = "52";
		String s2 = "0";
		String s3 = s + s2;
		System.out.println(s3); // "520"

		//第三个
		System.out.println(20 / 3); // 6 (小数部分忽视)
		//System.out.println(20 / 0);//  by zero  异常
		System.out.println(20.0 / 0.0);   //Infinity 正无穷大
		System.out.println(-20.0 / 0.0);  //-Infinity 负无穷大

		//第四个
		System.out.println(10 % 3); //1
		System.out.println(-10 % 3); // -1

		//第五个
		//加法运算
		//定义变量接收转换的值
		int i = new Double(10.1).intValue(); // 10
		int m = new Double(12.5).intValue(); // 12
		System.out.println(i + m);  //22 可行
		
		//其它
		System.out.println((10 / 0.0) == (20 / 0.0));  //true

		System.out.println(0.0 / 0.0);  //NaN
		System.out.println((0.0 / 0.0) == (0.0 / 0.0)); //false
		
		
	}
}

//注意：无穷大和NaN都属于double浮点类型,但是所有正无穷大都是相等的,所有负无穷大也是相等的,NaN永远不相等,也不等于自己
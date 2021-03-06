/*
	变量语法格式: 数据类型 变量名 = 对应类型的值;

	需求: 引出变量
	步骤:  通过解决一个不断变化的需求,分析引出一个变量来快捷解决类型的问题, 达到减少代码重复量.

			1) 需求: 求一个三角形边长分别位 4, 6, 11的周长
			2) 需求2: 把边长11的改成12,  在求周长
			3)需求3: 把边长11的改成15,  在求周长
			4) ----
			5) 引出变较方便快捷的解决不断变化的需求.
	 PS: 包含变量的定义与使用

*/

//测试类
public class StepInVarDemo
{
	public static void main(String[] args)
	{
		//引出变量
		//需求: 求一个三角形边长分别位 4, 6, 11的周长
		System.out.println("三角形周长: " + (4 + 6 + 11));
		// 需求更改 : 把边长11的改成12,  在求周长
		System.out.println("三角形的周长: " + (4 + 6 + 12));
		//需求更改: 把边长12的改成15,  在求周长
		System.out.println("三角形的周长: " + (4 + 6 + 15));

		//存在问题: 如果需求一直变化, 那么每次都需要更改大量重复的代码
		//解决方法:  把三角形的三边的长用三个变量a b c来表示 周长:a + b + c
		int a = 4; //语法: 数据类型 变量名 =(赋值) 值(初始值)
		int b = 6;
		int c = 15;
		System.out.println("三角形周长: " + (a + b + c));
		// 通过使用变量可以解决一些变化的 动态的需求 如以上例子

	}
}





//注意:     1) 局部变量先赋值初始化才能使用  可重复使用
//			2) 同一 作用域中变量名不能重复定义 否则报错 更改报错提示先对应的变量名 使之不能和其它变量名相同
//			3) 声明变量 必须要有数据类型 赋的值也是相对应的数据类型
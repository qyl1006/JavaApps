// 归零练习练习 加强记忆一波
//测试 证明 知识点

public class TestDemo
{
	public static void main(String[] args)
	{
		//演示常量
		System.out.println(3); // 打印 常量 int类型的 3
		System.out.println(3.0);//打印 double 类型的 常量 3.0
		System.out.println("我" + 521 + "love" + "你"); // 打印表达式 String

		System.out.println("===========================");
		//引出变量
		//需求: 求一个三角形边长分别位 4, 6, 11的周长
		System.out.println("三角形周长: " + (4 + 6 + 11));
		// 需求更改 : 把边长11的改成12,  在求周长
		System.out.println("三角形的周长: " + (4 + 6 + 12));

		//存在问题: 如果需求一直变化, 那么每次都需要更改大量重复的代码
		//解决方法:  把三角形的三边的长用三个变量a b c来表示 周长:a + b + c
		int a = 4; //语法: 数据类型 变量名 =(赋值) 值(初始值)
		int b = 6;
		int c = 12;
		System.out.println("三角形周长: " + (a + b + c));
		// 通过使用变量可以解决一些变化的 动态的需求 如以上例子


	}
}



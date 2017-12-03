public class MethodDemo
{
	//定义方法
	static void common()
	{
		System.out.println("200行共同代码");
	}


	public static void main(String[] args)
	{
		System.out.println("代码片段A");
		MethodDemo.common();  // 调用方法

		System.out.println("代码片段B");
		Common.common();   // 调用方法

		System.out.println("代码片段C");
		

		System.out.println("代码片段D");
		
	}
}
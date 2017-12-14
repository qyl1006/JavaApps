//代码块
//代码块类
class CodeBlock
{
	{
		System.out.println("初始化代码块");
	}

	//构造器
	CodeBlock()
	{
		System.out.println("----构造器=-----");
	}

	//static静态 代码块
	static
	{
		System.out.println("初始化静态代码块");
	}
}

//演示类
public class CodeBlockDemo
{
	public static void main(String[] args)
	{
		//局部代码块
		{
			int a = 1;
			System.out.println(a);
		}
		System.out.println("======================");

		//创建CodeBlock类
		new CodeBlock();  //每次创建对象的时候都会执行初始化代码块:
					      //  每次创建对象都会调用构造器,在调用构造器之前,会先执行本类中的初始化代码块.
		new CodeBlock();
		new CodeBlock();

		System.out.println("======================");
		
	}
}
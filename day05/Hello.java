public class Hello
{
	public static void main(String[] args)
	{
		//用命令行编译运行来演示args数组实参的传递
		System.out.println(args.length);
		for (int index = 0; index < args.length; index ++ )
		{
			System.out.println(args[index]);
		}
		
	}
}
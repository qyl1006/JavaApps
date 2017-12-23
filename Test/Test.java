


//
public class Test
{
	public static void main(String[] args)
	{
		char c = 'A';
		String s = "A";
		System.out.println(s);

		Test.print(1);  
		Test.print(3.14);
		Test.print("a");
		Test.print('a');
	}

	static void print(Object a)
	{
		System.out.println(a);
	}
}

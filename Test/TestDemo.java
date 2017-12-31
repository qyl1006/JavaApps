class Test
{
	Test(){i ++;}
	static int i;

	
}

//≤‚ ‘¿‡
public class TestDemo
{
	public static void main(String[] args){
		System.out.println(Test.i);
		System.out.println(new Test().i);
		System.out.println(Test.i);
		System.out.println(Test.i);

	}
} 

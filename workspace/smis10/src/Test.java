import lombok.ToString;

public class Test {
	public static void main(String[] args) {
		B test = new B();
		test(test);
	}
	
	public static void test(A a){
		System.out.println(a); //  B(b=BaaB)
	}
}

@ToString
class A{
	private String a = "AAAA";
}

 @ToString
class B extends A{
	private String b = "BaaB";
}
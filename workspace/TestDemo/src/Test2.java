
public class Test2 {
	public static void main(String[] args) {
		A a = new C();
		B b = (B) a;
		b.test();
		
		B b2 = new C();
		A a2 = (A) b2;
		a2.sysou();
	}
}

class A{
	String s = "AAA";
	void sysou() {
		
	}
	
}
//�ӿ�
interface B{
	void test();
}
class C extends A implements B{

	public void test() {
		System.out.println(this.s);
	}
	void sysou() {
		System.out.println(this.s + "aa");
	}
}


class D extends A{
	
}

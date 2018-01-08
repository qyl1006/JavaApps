package day15;
/*需求: 演示实例内部类  -->代码佐证/证明它的特点
 * 总结: ： 实例 内部类没有使用static修饰   说明内部类属于外部类的对象,不属于外部类本身.
 * 
 * 特点: 特点:
			1:创建实例内部类前,必须存在外部类对象,通过外部类对象创建内部类对象(当存在内部类对象时,一定存在外部类对象).	
			    	Outter.Inner in = new Outter().new Inner();
			2:实例内部类的实例自动持有外部类的实例的引用,内部类可以直接访问外部类成员.
			3:外部类中不能直接访问内部类的成员,必须通过内部类的实例去访问.
			4:实例内部类中不能定义静态成员,只能定义实例成员.
			5:如果实例内部类和外部类存在同名的字段或方法abc,那么在内部类中:
					this.abc:表示访问内部类成员.
					外部类.this.abc:表示访问外部类成员.

 */
public class InstanceInnerClassDemo {
	public static void main(String[] args) {
		//1 创建实例内部类前,必须存在外部类对象,通过外部类对象创建内部类对象(当存在内部类对象时,一定存在外部类对象).
		TestDemo.Test t = new TestDemo().new Test();
		
		//2 实例内部类的实例自动持有外部类的实例的引用,内部类可以直接访问外部类成员.
		t.sysout();
		
		//3 外部类中不能直接访问内部类的成员,必须通过内部类的实例去访问.
		new TestDemo().demo();
		
		//5
		t.sysout();
	}
}

class TestDemo{
	String str = "外部类的字段";
	String name = "外部类的字段";
	
	public void demo(){
		System.out.println(this.new Test().name);
	}
	
	class Test{
		
		String name = "内部类的字段";
		public void sysout() {
			System.out.println("内部类的方法");
			System.out.println(str);
			System.out.println("=====================");
			
			System.out.println(this.name);
			System.out.println(TestDemo.this.name);
		}
	}
}

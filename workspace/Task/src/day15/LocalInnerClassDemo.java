package day15;
/*需求: 演示 --> 局部内部类
 * 总结:     局部内部类 和局部变量是同一个级别的
 * 		1:不能使用public,private,protected,static修饰符.
		2):局部内部类只能在当前方法中使用.
		3):局部内部类和实例内部类一样,不能包含静态成员.
		4):局部内部类和实例内部类,可以访问外部类的所有成员.
		5):局部内部类访问的局部变量必须使用final修饰(在Java8中是自动隐式加上final,但是依然是常量,不能改变值).

 * 
 * 
 */
public class LocalInnerClassDemo {
	public static void main(String[] args) {
		//测试 
		new Test2Demo().sysot();
	}
}

//局部内部类
class Test2Demo{
	public void sysot() {
		final String name = "111";
		class Test2{
			public void print2() {
				System.out.println(name);
			}
		}
		new Test2().print2();
	}
}


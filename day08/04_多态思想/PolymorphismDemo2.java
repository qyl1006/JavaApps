//	多态时方法调用问题				
//动物类 父类
class Animal
{
	public static void print()
	{
		System.out.println("Animal多态时方法调用情况证明验证");
	}
}

//狗类 子类
class Dog extends Animal
{
	public static void print()
	{
		System.out.println("Dog 多态时方法调用情况证明验证");
	}

}

//演示测试类
public class PolymorphismDemo2
{
	public static void main(String[] args)
	{	
		//第一种情况 print方法存在父类Animal中, 不存在Dog子类中
		Animal a = new Dog();
//		a.print();  //结果: 编译通过,执行打印 "Animal多态时方法调用情况证明验证" 应该先到Dog类找print方法,找不到,再到父类找.父类没有报错.
		
		//第二种情况 print方法存在Dog类的,不存在父类中
//		a.print(); //结果 编译错误 编译时期,会去编译类型(Animal)中找是否有print方法:
					//						 找    到:编译通过.
					//						 找不到:编译报错.

		//第三种情况 print方法都存在父类Animal与子类Dog中
//		a.print();//编译运行通过 打印 "Dog 多态时方法调用情况证明验证"  在运行时期,调用运行类型(Dog)中的方法

		//第四种情况  print方法多存在父类Animal与子类Dog中,但print方法使用static静态方法
		a.print();//编译运行结果为: "Animal多态时方法调用情况证明验证"  为什么? 因为静态方法调用只需要类就可以,
					//   如果使用对象来调用静态方法,其实使用的是对象的编译类型来调用静态方法.  和对象没有关系.

   
	}
}
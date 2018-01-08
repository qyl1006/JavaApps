package day15;
/*
 * 需求: 用接口的方式实现关于USB规范的案例
 * 
 * 总结: 面向接口编程-->多态的好处--->把实现类对象赋给接口类型变量,屏蔽了不同实现类之间的实现差异,从而可以做到通用编程.
		2) 　匿名内部类适合于仅使用一次使用的类,属于局部内部类的特殊情况   
 */

public class USBDemo {
	public static void main(String[] args) {
		//测试
		//使用鼠标功能
		MUSB usb1 = new Mouse();
		//Board.jack(usb1);
		
		//创建设备对象 并插入主板插槽口
		MUSB usb2 = new Keyboard();
		MUSB usb3 = new Printer();
		Board.jack(usb1);
		Board.jack(usb2);
	//	Board.jack(usb3);
	//	Board.jack(usb3);
	//	Board.jack(usb3);
	//	Board.jack(usb3);
	//	Board.jack(usb3);
		
		Board.call();
		
		System.out.println("===================================");
		//使用匿名内部类来作为传入参数
		Board.jack2(new MUSB(){
			public void function() {
				System.out.println("匿名内部类.......");
			}
		});
		
	}

}

//定义一个MUSB接口规范
interface MUSB {
	void function();
}

//鼠标类
class Mouse implements MUSB{
	public void function(){
		System.out.println("鼠标在移动......");
	}
}

//键盘类
class Keyboard implements MUSB{
	public void function(){
		System.out.println("键盘啪啪啪信息输入ing.........");
	}
}

//打印机类
class Printer implements MUSB{
	public void function(){
		System.out.println("打印机吱吱地在打印ing........");
	}
}

//主板类-
class Board{
	static MUSB[] usbs = new MUSB[6];
	static int count;
	
	//插入主板插槽功能
	public static void jack(MUSB usb){
		if (count > 5) {
			System.out.println("插满了...");
			return;
		}
		usbs[count] = usb;
		count ++;
	}
	
	//调用设备功能
	public static void call(){
		for(MUSB u : usbs){
			if (u != null) {
				u.function();
			}
		}
	}
	
	public static void jack2(MUSB usb){
		usb.function();
	}
	
	
}

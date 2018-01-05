package day14;
import javax.swing.text.StyledEditorKit.ForegroundAction;

/*
 *  需求:  演示模块方法的用法
 * */

public class TemplateMethodDemo {
	public static void main(String[] args) {
		//测试
		new StringDemo().count();//316 毫秒
		
		new AddNumber().count(); // 3  毫秒
	}
}

//父类
abstract class Statistics{
	//统计运行时间
	public void count(){
		long time1 = System.currentTimeMillis();
		this.test();
		long time2 = System.currentTimeMillis();
		System.out.println(time2 - time1);
	}
	
	abstract public void test();
}

class StringDemo extends Statistics{
	
	public void test() {
		 String s = "12";
		 for (int i = 0; i < 10000; i ++){
			 s += i;
		 }
	}
}

class AddNumber extends Statistics{
	public void test() {
		int j = 0;
		for (int i = 0; i < 100000; i++) {
			j += i;
		}
	}
}
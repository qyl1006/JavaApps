package day17.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *  演示 SimpleDateFormat类
 * 总结: SimpleDateFormat类是DateFormat的类, 同时 DateFormat是Date的子类
 * --->那么SimpleDateFormat都可以调用它们两个的方法,不同的或者增加的常用的方法就是 
 * 		-->支持自定义格式模式
 * 
 * 	需要注意的地方是---> 解析操作时--->使用什么风格格式化的, 必须使用相同风格解析回去  或者报错
 */
public class SimpleDateFormatDemo {
	public static void main(String[] args) throws ParseException {
		//自定义日期的模式
		String time = "yyyy-MM-dd HH:mm:ss E";
		//创建SimpleDateFormat对象
		SimpleDateFormat s = new SimpleDateFormat(); // PS 其实可以在创建对象的时候直接把time传入的
		s.applyPattern(time);    // 申请添加自定义模式
		System.out.println(s.format(new Date()));  // 日期格式化
		String time1 = s.format(new Date());
		
		SimpleDateFormat s2 = new SimpleDateFormat();
		System.out.println("默认风格: " + s2.format(new Date()));
		
		
		System.out.println("相同风格解析: " + s.parse(time1));
		System.out.println("不相同风格解析: " + s2.parse(time1)); //报错: Unparseable date
	}
}

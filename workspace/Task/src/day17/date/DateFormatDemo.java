package day17.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/*
 * 	格式化日期
 * 总结: DateFormat类常用也就是日期的格式化 与 解析 这两个功能
 * 
 */
public class DateFormatDemo {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		System.out.println("未格式化前的: " + d);
		
		//创建DateFormat对象
		DateFormat dd = DateFormat.getDateInstance(); //默认风格
		String str = dd.format(d);
		System.out.println("日期格式化后(默认风格)" + str);
		
		//其它风格
		DateFormat dd2 = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.MEDIUM);
		System.out.println(dd.format(d));
		
		//解析
		dd = DateFormat.getDateInstance();
		String time = dd.format(d);
		System.out.println("解析前:" + time);
		System.out.println("解析后: " + dd.parse(time));
		
	}
}

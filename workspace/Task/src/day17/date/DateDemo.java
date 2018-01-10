package day17.date;

import java.util.Date;

/*
 * 需求:  练习日期类Date的方法
 * 
 */
public class DateDemo {
	public static void main(String[] args) {
		
		System.out.println(new Date());
		System.out.println(new Date().toLocaleString());
		System.out.println(new Date(System.currentTimeMillis()));
		System.out.println(new Date().getTime()); //毫秒
	}
}

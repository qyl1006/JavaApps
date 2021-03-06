package com._520it._04_char_sequence;

public class CharSequenceDemo {
	public static void main(String[] args) {
		//����String����
		String s = "";
		long time1 = System.currentTimeMillis();
		for (int i = 0; i < 30000; i++) {
			s += i;
		}
		long time2 = System.currentTimeMillis();
		System.out.println(time2 - time1);  //  1630 ms
		
		//����StringBuffer
		StringBuffer sb = new StringBuffer("");
		long time3 = System.currentTimeMillis();
		for (int i = 0; i < 30000; i++) {
			sb.append(i);
		}
		long time4 = System.currentTimeMillis();
		System.out.println(time4 - time3);		// 9 ms
		
		//����StringBuilder
		StringBuilder sb2 = new StringBuilder("");
		long time5 = System.currentTimeMillis();
		for (int i = 0; i < 30000; i++) {
			sb2.append(i);
		}
		long time6 = System.currentTimeMillis();
		System.out.println(time6 - time5);  // 5ms
	}	
}

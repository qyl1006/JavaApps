package com._520it._06_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com._520it._04_char_sequence.StringUtils;

public class DateUtil {
	public static final String DEFAULT_DATE_PARSE = "yyyy-MM-dd HH:mm";
	
	public static void main(String[] args) throws ParseException {
		//����
		//���岻ͬ����Date
		String s1 = "yyyy-MM-dd HH:mm:ss E";
		String s2 = "yyyy-MM-dd";
		String s3 = "HH:mm:ss a";
		
		String test1 = date2String(new Date());
		System.out.println("s1����: " + test1);
		
		String test2 = date2String(new Date(), "");
		System.out.println("s2����: " + test2);
		
		String test3 = date2String(new Date(), " s1 ");
		System.out.println("s3����: " + test3);
		
		
		System.out.println("-------------------------------------");
		Date time1 = string2Date(test1, null);
		System.out.println(time1);
		
	}
	
	
	//ע��ѧϰ���������������˼��---->����---->if�������е�pattern��6  Ĭ�ϵ�ֵһ�����������̬final����.
	//����һ��Date��������----->String�������͵ķ���
	public static String date2String(Date date) {
		return date2String(date, null);
	}
	
	public static String date2String(Date date, String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat();
		if (StringUtils.isBlank(pattern)){
			pattern = DEFAULT_DATE_PARSE;
		}
		sdf.applyPattern(pattern);
		return sdf.format(date);
	}
	
	//������String����-------->Date���͵ķ���
	public static Date string2Date(String parse) throws ParseException{
		return string2Date(parse, null);
	}
	
	public static Date string2Date(String parse, String pattern) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat();
		if (StringUtils.isBlank(pattern)) {
			pattern = DEFAULT_DATE_PARSE;
		}
		sdf.applyPattern(pattern);
		return sdf.parse(parse);
	}
	
}
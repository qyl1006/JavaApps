package com._520it.day02_demo;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
 * ��ϰ���ݴ�������е����ݱ��� �� ����  �Լ������������
 */
public class CodingDecodingDemo {
	public static void main(String[] args) throws Exception {
		//����
		String str = "��Ծ��";
		byte[] b = str.getBytes("UTF-8");
		System.out.println(Arrays.toString(b)); //���ݶ��Ƕ����ƴ����,�����洢�ڼ���������� 1��0������
		
		//����
		String s = new String(b, "UTF-8");
		System.out.println(s);
		
		//��������---->���ǵ�����������ʱ��û��ʹ��ͬһ�ֹ淶Э���ʱ�����  <------���ݱ������ʱʹ��Charset��һ��
		String ss = new String(b, "ISO-8859-1");
		System.out.println(ss);//  ?��?����????	<-------����
		
		//����취--->1�ѽ����������������(String)�����ȥ��byte[] 2�ڰ�byte[]��֮ǰ���������Charset����
		// 1
		byte[] bb = ss.getBytes("ISO-8859-1");
		
		String sss = new String(bb, "UTF-8");
		System.out.println(sss);
		
	}
}
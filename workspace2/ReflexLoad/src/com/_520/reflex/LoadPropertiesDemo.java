package com._520.reflex;

import java.io.InputStream;
import java.util.Properties;

/*
 * ��ϰ��Դ���� ------db.properties �ļ�
 */
public class LoadPropertiesDemo {
	public static void main(String[] args) throws Exception {
		//��ʽһ ʹ���������-->��Ĭ�Ͼ��Ǵ�classpath��·��ȥѰ���ļ��� / -->ʹ�����ֺ� ����
		Properties p = new Properties();
		//��Thread���л�ȡClassLoader��Ķ���-----�������
		ClassLoader load = Thread.currentThread().getContextClassLoader();
		InputStream in = load.getResourceAsStream("db.properties");
		System.out.println("test:" + p);
		p.load(in);
		System.out.println(p);
		System.out.println(p.getProperty("username"));
		
		System.out.println("--------------------------");
//		test();

	}

	private static void test() throws Exception {
		//��ʽ��ʹ�����·��---����뵱ǰ�����ļ����ֽ���·��
		Properties p2 = new Properties();
		InputStream in2 = LoadPropertiesDemo.class.getResourceAsStream("db.properties");
		//				System.out.println(p2);
		System.out.println(in2);
		System.out.println(p2.size());
		System.out.println(p2);
		p2.load(in2);
		System.out.println(p2);
	}
}

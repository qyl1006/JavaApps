package com._520.reflex;

import java.io.InputStream;
import java.util.Properties;

/*
 * 练习资源加载 ------db.properties 文件
 */
public class LoadPropertiesDemo {
	public static void main(String[] args) throws Exception {
		//方式一 使用类加载器-->它默认就是从classpath根路径去寻找文件的 / -->使用这种好 方便
		Properties p = new Properties();
		//从Thread类中获取ClassLoader类的对象-----类加载器
		ClassLoader load = Thread.currentThread().getContextClassLoader();
		InputStream in = load.getResourceAsStream("db.properties");
		System.out.println("test:" + p);
		p.load(in);
		System.out.println(p.getProperty("username"));
		
		System.out.println("--------------------------");
		test();

	}

	private static void test() throws Exception {
		//方式二使用相对路径---相对与当前加载文件的字节码路径
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

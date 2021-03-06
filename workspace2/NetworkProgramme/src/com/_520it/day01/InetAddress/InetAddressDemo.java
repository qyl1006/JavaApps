package com._520it.day01.InetAddress;

import java.net.InetAddress;
import java.net.URLDecoder;
import java.net.URLEncoder;

/*
 * 练习InetAddress类
 */
public class InetAddressDemo {
	public static void main(String[] args) throws Exception {
		InetAddress[] ip = InetAddress.getAllByName("localhost"); //本机
		System.out.println(ip[0]);          //打印---localhost/127.0.0.1
		
		//返回IP地址字符串形式
		System.out.println(ip[0].getHostAddress());        //127.0.0.1
		
		//返回此IP地址的主机名
		System.out.println(ip[0].getHostName());		//localhost
		
		//测试是否可以到达该地址--单位毫秒
//		System.out.println(ip[0].isReachable(100000));   //true
		
		//网络编程---编码解码---application/x-www-form-urlencoded MIME编码
		//获取平台的默认字符集
		System.out.println(System.getProperty("file.encoding"));  //GBK
		
		//使用UTF-8编码
		String name = "任天堂 will 17";
		String ret = URLEncoder.encode(name, "UTF-8");
		System.out.println(ret);  //%E4%BB%BB%E5%A4%A9%E5%A0%82+will+17
		
		//使用UTF-8解码
		String msg = URLDecoder.decode(ret, "UTF-8");
		System.out.println(msg);  //任天堂 will 17
	}
}

package com._520it.day01_InetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * ��ϰInetAddress��
 */
public class InetAddressDemo {
	public static void main(String[] args) throws Exception {
		InetAddress ip = InetAddress.getByName("qyl-PC");
		System.out.println(ip);
		System.out.println(ip.getHostAddress());
		System.out.println(ip.getHostName());
	}
}

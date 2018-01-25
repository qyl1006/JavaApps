package com._520it.day01.TCP;

import java.net.Socket;
import java.util.Scanner;

/*
 *简单演示客户端端
 */
public class SocketDemo {
	public static void main(String[] args) throws Exception {
		//创建客户端对象
		Socket soc = new Socket("localhost", 10086);
		
		//创建扫描器对象 来接收服务端发送的信息
		Scanner read = new Scanner(soc.getInputStream());
		while(read.hasNext()){
			System.out.println(read.nextLine());
		}
		
		soc.close();
		read.close();
	}
}

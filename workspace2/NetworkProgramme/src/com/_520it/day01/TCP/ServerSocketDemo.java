package com._520it.day01.TCP;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 简单演示服务端
 */
public class ServerSocketDemo {
	public static void main(String[] args) throws Exception {
		//创建服务端对象
		ServerSocket server = new ServerSocket(10086);
		
		String str = "测试..........";
		//侦听并接收客户端的连接   返回客户端的对象
		Socket soc = server.accept();
		System.out.println("服务器已准备好......");
		
		System.out.println(soc.getInetAddress());
		
		//创建打印流对象 向客户端输出信息
		PrintStream out = new PrintStream(soc.getOutputStream());
		out.println(str);
		
		System.out.println("服务端");
		server.close();
		out.close();
	}
}

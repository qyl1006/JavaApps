package com._520it.day01.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

//接收端
public class Receive {
	public static void main(String[] args) throws Exception {
		//创建接收端对象
		DatagramSocket receiver = new DatagramSocket(10086);
		
		//缓存区
		byte[] b = new byte[1024];
		DatagramPacket p = new DatagramPacket(b, 1024);
		
		receiver.receive(p);
		System.out.println(new String(p.getData(), 0, p.getLength()));
		
		receiver.close();
	}
}

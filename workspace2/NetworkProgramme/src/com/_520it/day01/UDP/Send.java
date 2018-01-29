package com._520it.day01.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

//发送端
public class Send {
	public static void main(String[] args) throws Exception {
		String str = "我欲成仙,快乐齐天----测试Ing";
		
		//创建发送端对象
		DatagramSocket send = new DatagramSocket(10011);
		
		DatagramPacket p = new DatagramPacket(str.getBytes(), str.getBytes().length, InetAddress.getLocalHost(), 10086);
		send.send(p);
		send.close();
	}
}

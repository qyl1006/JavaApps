package com._520it.day01.TCP;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * ����ʾ�����
 */
public class ServerSocketDemo {
	public static void main(String[] args) throws Exception {
		//��������˶���
		ServerSocket server = new ServerSocket(10086);
		
		String str = "����..........";
		//���������տͻ��˵�����   ���ؿͻ��˵Ķ���
		Socket soc = server.accept();
		System.out.println("��������׼����......");
		
		System.out.println(soc.getInetAddress());
		
		//������ӡ������ ��ͻ��������Ϣ
		PrintStream out = new PrintStream(soc.getOutputStream());
		out.println(str);
		
		System.out.println("�����");
		server.close();
		out.close();
	}
}
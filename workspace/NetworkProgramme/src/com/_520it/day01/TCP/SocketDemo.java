package com._520it.day01.TCP;

import java.net.Socket;
import java.util.Scanner;

/*
 *����ʾ�ͻ��˶�
 */
public class SocketDemo {
	public static void main(String[] args) throws Exception {
		//�����ͻ��˶���
		Socket soc = new Socket("localhost", 10086);
		
		//����ɨ�������� �����շ���˷��͵���Ϣ
		Scanner read = new Scanner(soc.getInputStream());
		while(read.hasNext()){
			System.out.println(read.nextLine());
		}
		
		soc.close();
		read.close();
	}
}
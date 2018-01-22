package com._520it.buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/*
 * ��ϰ�ַ�������������װ����IO����
 */
public class BufferedCharDemo {
	public static void main(String[] args) throws Exception {
		//�����ַ���������װ���Ķ���
		BufferedWriter out = new BufferedWriter(new FileWriter("File/stream.txt"));
		
		//����ַ�IO����
		out.write("��������");
		out.newLine();
		out.write("��������");
		
		//�ر���Դ
		out.close();
		
		//�����ַ����뻺���װ���Ķ���
		BufferedReader in = new BufferedReader(new FileReader("File/stream.txt"));
		
		//����IO����
		String len = null;
		while((len = in.readLine()) != null){
			System.out.println(len);
		}
		
		//�ر���Դ
		in.close();
		
		System.out.println(System.getProperties());
	}
}
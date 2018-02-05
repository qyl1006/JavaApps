package com._520it.buffered;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * ��ϰ BufferedOutputStream--������---1�ֽ����---2 �ֽ�����
 */
public class BufferedByteStreamDemo {
	public static void main(String[] args) throws Exception {
		//�����ֽ��������������
		BufferedOutputStream outBuffered = new BufferedOutputStream(new FileOutputStream("File/stream.txt"));
		
		//�ֽ����IO����
		outBuffered.write("Helo World!\ntest".getBytes());
		
		//�ر���Դ
		outBuffered.close();
		
		// �����ֽ����뻺��������
		BufferedInputStream inBuffered = new BufferedInputStream(new FileInputStream("File/stream.txt"));
		
		//�ֽ�����IO����
		byte[] b = new byte[1024];
		int len = -1;
		while((len = inBuffered.read(b)) != -1){
			System.out.println(new String(b, 0, len));
		}
	}
}
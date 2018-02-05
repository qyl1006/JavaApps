package com._520it.day01._file_input_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

/*
 * ����: �����ֽ���������������.txt�ļ��Ŀ�������
 */
public class FileCopyDemo {
	public static void main(String[] args) throws Exception {
		// 1) ����Դ ��Ŀ�����
		String inStr = "File/test.txt";
		String outStr = "File/copy.txt";
		
		// 2) ����IO������  (���� ��� �ܵ�)
		InputStream in = new FileInputStream(inStr); //����
		OutputStream out = new FileOutputStream(outStr); //���
		
		//3) �����IO����
		byte[] bye = new byte[5];
		int len = -1;
		
		//����-----> ���while���Կ���Դ���֪��read()���صĹ���
		while((len = in.read(bye)) != -1){
			out.write(bye, 0, len);  //����������
		}
		
		//�ر���Դ
		in.close();
		out.close();
	}
}
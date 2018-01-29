package com._520it.day02_demo;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

/*
 * ��ϰ �ļ��ַ�IO�������
 */
public class FileReaderDemo {
	public static void main(String[] args) throws Exception {
		//1 ����Դ����
		File dir = new File("File/test.txt");
		
		//2 ����IO������--->�ַ�����������
		Reader in = new FileReader(dir);
		
		//3 ����IO����-->�ַ�����Reand
		char[] cbuf = new char[1024];  //----->�ַ�-->char    �ֽ�-->byte   ���߲�һ��
		int len = -1;
		while((len = in.read(cbuf)) != -1){
			System.out.println(new String(cbuf,0 , len));
		}
		
		//4 �ر���Դ
		in.close();
	}
}

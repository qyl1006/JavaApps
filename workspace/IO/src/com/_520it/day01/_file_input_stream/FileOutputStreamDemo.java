package com._520it.day01._file_input_stream;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

//��ʾ �ֽ������ ��ʹ��
public class FileOutputStreamDemo {
	public static void main(String[] args) throws Exception {
		//�������
		//����Ŀ�����
		String file = "File/test.txt";
		
		//����IO������
		Writer out = new OutputStreamWriter(new FileOutputStream(file));
		
		//�����IO����
		out.write("��������\n��������\n�ֽ���ת�ַ���".toCharArray());
		//�ر���Դ
		out.close();
	}
}

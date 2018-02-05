package com._520it.day02_demo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

// �ֽ������--- IO��ϰ
public class FileWriterDemo {
	public static void main(String[] args) throws Exception {
		// 1) ����Ŀ�����
		File writer = new File("File/write.txt");
		
		// 2) �����ֽ����������
		Writer write = new FileWriter(writer);
		
		// 3)����IO����-- д���ݵ�ָ��Ŀ¼�ļ���
		write.write("ABCDEF--test�ļ�01");
		write.write("\n");
		write.write("ABCDEF--test�ļ�02");
		
		//4) �ر���Դ
		write.close();
	}
}
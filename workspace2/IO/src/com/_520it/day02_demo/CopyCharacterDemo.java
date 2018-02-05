package com._520it.day02_demo;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.Reader;
import java.io.Writer;

/*�ַ�IO����--�ļ�����
 * �ļ��Ŀ���--->�ַ����������IO������ϰ,��ָ��Ŀ¼�е�ָ�����͵��ļ�������ָ��Ŀ¼���Ѻ�׺���ĳ� ".java"
 * 
 * ����: ��������������--1)ɸѡ��ָ�����͵��ļ�   2)�ַ����������-----3)�ַ����������
 */

public class CopyCharacterDemo {
	public static void main(String[] args) throws Exception {
		//ɸѡ������ָ�����͵��ļ�
		File dir = new File("C:/Users/Qyuelin/Desktop/java_test/infile"); //�������ļ���Ŀ¼
		File write = new File("C:/Users/Qyuelin/Desktop/java_test/copyWriter");   //�����ļ���Ŀ¼
		
		//ɸѡ������ָ�����͵��ļ�
		File[] fs = dir.listFiles(new FilenameFilter(){
			public boolean accept(File dir, String name) {
				return new File(dir, name).isFile() && name.endsWith(".txt");
			}
		});
		
		//�������Ѿ�ɸѡ���ļ�
		for(File file : fs){
			//�����ַ�����/���IO��  
			Reader reader = new FileReader(file);  //�ַ�����������
			Writer writer = new FileWriter(new File(write, file.getName()));  //�ַ����������
			
			//���������--�ַ�
			char[] cbuf = new char[1024];
			int len = -1; //�Ѿ���ȡ���ֽ���, �ײ�涨-1��ʾ����ĩβ
			while((len = reader.read(cbuf)) != -1){
				writer.write(cbuf, 0, len);
			}
			
			//�ر���Դ
			reader.close();
			writer.close();
			
			//�����ļ�������
			String old = file.getName();
			String newName = old.substring(0, old.lastIndexOf(".")) + ".java";
			File copy = new File(write, file.getName());
			copy.renameTo(new File(write, newName));
			
			//ɾ��������ȥ��Դ�ļ�---�ظ����������һ��Դ�ļ�
			copy.delete();
		}
		
	}
}
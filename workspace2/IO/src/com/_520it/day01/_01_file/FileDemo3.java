package com._520it.day01._01_file;

import java.io.File;
import java.io.IOException;

/*
 * ��ϰFile�ķ���-->File���з���-�ļ�����:

 */
public class FileDemo3 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:/Users/Qyuelin/Desktop/java_test/123.java");
		System.out.println(f.isFile());
		
		test1(f);
	}

	private static void test1(File f) throws IOException {
//		boolean isFile() :�Ƿ����ļ�
		System.out.println(f.isFile());
//		
//		static File createTempFile(String prefix, String suffix) :������ʱ�ļ�
		File.createTempFile("12345temo", ".tqq1ext", new File("C:/Users/Qyuelin/Desktop/java_test"));
		
//		boolean delete() :ɾ���ļ�
	//	f.delete();
//		void deleteOnExit() :��JVMֹͣʱɾ���ļ�
		
//		boolean exists():�ж��ļ��Ƿ����
//		boolean createNewFile() :�����µ��ļ�
		System.out.println(f.exists());
		if(!f.exists()){
			f.createNewFile();
		}
		System.out.println(f.exists());
//		boolean renameTo(File dest) :�����޸�����
//		f.renameTo(new File("C:/Users/Qyuelin/Desktop/java_test/12345.java")); //����������, �����·����fһ��, ��f���ļ�,��������
		
		
		System.out.println(File.listRoots().toString());

	}
}
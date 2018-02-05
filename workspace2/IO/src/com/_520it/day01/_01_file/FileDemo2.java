package com._520it.day01._01_file;

import java.io.File;

/*
 *��ϰFile�ķ��� -->��ȡFile·���ͼ��״̬:

 */
public class FileDemo2 {
	public static void main(String[] args) {
		//����File���� 
		File f = new File("C:/Users/Qyuelin/Desktop/cmd��������.txt");  
//		System.out.println(f);
//		test1(f);
		test2(f);
	}

	private static void test2(File f) {
//		���File״̬�ķ���:
//			boolean canExecute() :�ж��Ƿ��ǿ�ִ���ļ�
		System.out.println(f.canExecute());                    //true
//			boolean canRead() :�жϸ��ļ��Ƿ�ɶ�
		System.out.println(f.canRead());
//			boolean canWrite():�жϸ��ļ��Ƿ��д
		System.out.println(f.canWrite());
//			boolean isHidden():�жϸ��ļ��Ƿ��������ļ�
		System.out.println(f.isHidden());
//			long lastModified():�жϸ��ļ�������޸�ʱ��
		System.out.println(new java.util.Date(f.lastModified()).toLocaleString());
//			long length():��ȡ���ļ��ĳ��ȴ�С(��λ�ֽ�
		System.out.println(f.length());
	}

	private static void test1(File f) {
//		����File·��������:
//			File getAbsoluteFile() :��ȡ����·��
		System.out.println(f.getAbsoluteFile());
//			String getAbsolutePath():��ȡ����·��
		System.out.println(f.getAbsolutePath());
//			String getPath() :��ȡ�ļ�·��
		System.out.println(f.getPath()); 
//			String getName() :��ȡ�ļ�����
		System.out.println(f.getName());  					//cmd��������.txt
//			File getParentFile():��ȡ�ϼ�Ŀ¼�ļ�
		System.out.println(f.getParentFile());       //C:\Users\Qyuelin\Desktop
//			String getParent() :��ȡ�ϼ�Ŀ¼·��
		System.out.println(f.getParent());               //C:\Users\Qyuelin\Desktop

	}
}
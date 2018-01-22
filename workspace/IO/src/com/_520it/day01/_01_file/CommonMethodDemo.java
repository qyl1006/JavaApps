package com._520it.day01._01_file;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/*
 * ��ϰ��¼File���÷���
 */
public class CommonMethodDemo {
	public static void main(String[] args) throws Exception {
		File dir = new File("C:/Users/Qyuelin/Desktop/java_test");
		
		// 1) String getAbsolutePath() ��ȡ����·��
		String str = dir.getAbsolutePath();
		System.out.println(str); //C:/Users/Qyuelin/Desktop/java_test 
		
		//2)String getName() ��ȡ�ļ�����
		System.out.println(dir.getName());  //java_test
		
		//3) String getParent()  ��ȡ�ϼ�Ŀ¼·��
		System.out.println(dir.getParent()); //C:/Users/Qyuelin/Desktop
		
		// 4) boolean isFile() �Ƿ����ļ�
		System.out.println(dir.isFile()); // false  -- ��ǰ·���Ǹ�Ŀ¼
		
		// 5) boolean createNewFile() �����µ��ļ�
		System.out.println(dir.createNewFile());  //false ��ǰ�ļ��Ѵ���
		
		// 6) boolean exists() �ж��ļ��Ƿ����
		System.out.println(dir.exists()); //true
		
		//7) boolean renameTo(File dest)  ������ �����޸����� �ô��ܶ�
		System.out.println(new File("C:/123/123.txt").renameTo(new File("C:/123/1234.txt"))); //true
		
		//8) boolean isDirectory() �ж��Ƿ�Ŀ¼
		System.out.println(new File("C:/123/1234.txt").isDirectory()); //false �ļ�txt����Ŀ¼
		
		//9) boolean mkdirs() ������ǰĿ¼���ϼ�Ŀ¼  
		System.out.println(new File("C:/123/1234/12345/123456").mkdirs());//true ->C:\123\1234\12345\123456
		
		// 10)File[] listFiles() �г������ļ����� -->listFiles(FilenameFilter)-->���Ҳ���� �ļ���������
		System.out.println(Arrays.toString(new File("C:/123/").listFiles())); //[C:\123\1234, C:\123\1234.txt] 
		
		
		
	}
}
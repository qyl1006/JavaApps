package com._520it.day01._01_file;

import java.io.File;
/*
 * ����ɾ���ļ�����
 */

public class FileDemo6 {
	public static void main(String[] args) {
		File dir = new File("C:/Users/Qyuelin/Desktop/java_test");
		System.out.println(dir.getName());
		File[] fs = dir.listFiles();
		
		//Ҫɾ���Ĳ���
		String delete = "С������-JavaѧԺ-��С����ʦ-";
		for(File name : fs){
			System.out.println(name.getName());
			if(name.getName().contains(delete)){
				String str = name.getName().replace(delete, "");
				boolean b = name.renameTo(new File(dir, str));
				System.out.println(b);
				System.out.println("����");
			}
			System.out.println("����1");
		}
	}
}
package com._520it.day01._01_file;

import java.io.File;
import java.io.FilenameFilter;

//��ʾ�ļ�������
public class FileDemo7 {
	public static void main(String[] args) {
		File dir = new File("D:/FeiqWenJian/wolfcode(FCAA14FE4115)/С�����-��/day01/��Ƶ");
		File[] fs = dir.listFiles(new FilenameFilter(){
			public boolean accept(File dir, String name) {
				return name.endsWith(".avi")  && new File(dir, name).isFile();
			}
		});
		
		for(File name : fs){
			System.out.println(name.getName());
		}
		System.out.println(fs.length);
	}
}

package com._520it.day01._01_file;

import java.io.File;
import java.io.FilenameFilter;

//演示文件过滤器
public class FileDemo7 {
	public static void main(String[] args) {
		File dir = new File("D:/FeiqWenJian/wolfcode(FCAA14FE4115)/小码课堂-改/day01/视频");
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

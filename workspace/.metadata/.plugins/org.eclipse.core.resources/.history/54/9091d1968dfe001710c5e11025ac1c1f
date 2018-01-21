package com._520it.day01._01_file;

import java.io.File;

// 使用递归算法列出指定目录中所有文件,包括子文件夹的所有文件
public class FileDemo4 {
	public File[] fs;
	
	public static void main(String[] args) {
		File dir = new File("D:/FeiqWenJian/wolfcode(FCAA14FE4115)/小码课堂-改");  //这是指定目录
		test(dir);
	}
	// 出口是-->当前的文件不是一个目录的时候
	public static void test(File dir){
		File[]  f = dir.listFiles();		//返回当前目录下中的目录/文件   File[]数组接收
		for(File ele : f){
			if(ele.isDirectory()){			//判断当前的ele文件是否是一个目录-->是返回true
				test(ele);					//调用自己的方法
				continue;                   //结束当前循环,进入下一次循环  和else作用一样
			}
		}
	}
}



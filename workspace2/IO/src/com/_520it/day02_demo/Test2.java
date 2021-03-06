package com._520it.day02_demo;

import java.io.File;
import java.io.FilenameFilter;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Test2 {
	public static void main(String[] args) throws Exception {
		SimpleDateFormat f = new SimpleDateFormat();
		
		String str = f.format(new Date());
		System.out.println(str);
		
		System.out.println(f.parse(str));
		
		File dir = new File("File");
		
		File[] fs = dir.listFiles(new FilenameFilter(){
			public boolean accept(File dir, String name){
				return new File(dir, name).isFile() && name.endsWith(".txt");
			}
		});
		
		for(File ele : fs){
			System.out.println(ele);
		}
		
		//-----------------------
		System.out.println(new Demo(12));
		
		//-------------
		System.out.println("qqqqqqqqc.x".endsWith("c.x"));
		
		//---------------------
		
	}
}

class Demo{
	private Integer age;
	
	Demo(int i){
		age = i;
	}
	
	public String toString(){
		return age.toString(); 
	}
}
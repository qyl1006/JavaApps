package com._520it.day02_demo;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.Reader;
import java.io.Writer;

/*字符IO操作--文件拷贝
 * 文件的拷贝--->字符输入输出流IO操作练习,把指定目录中的指定类型的文件拷贝到指定目录并把后缀名改成 ".java"
 * 
 * 分析: 拷贝操作分三步--1)筛选出指定类型的文件   2)字符的输入操作-----3)字符的输出操作
 */

public class CopyCharacterDemo {
	public static void main(String[] args) throws Exception {
		//筛选出所有指定类型的文件
		File dir = new File("C:/Users/Qyuelin/Desktop/java_test/infile"); //被拷贝文件的目录
		File write = new File("C:/Users/Qyuelin/Desktop/java_test/copyWriter");   //拷贝文件的目录
		
		//筛选出所有指定类型的文件
		File[] fs = dir.listFiles(new FilenameFilter(){
			public boolean accept(File dir, String name) {
				return new File(dir, name).isFile() && name.endsWith(".txt");
			}
		});
		
		//遍历出已经筛选的文件
		for(File file : fs){
			//创建字符输入/输出IO流  
			Reader reader = new FileReader(file);  //字符输入流对象
			Writer writer = new FileWriter(new File(write, file.getName()));  //字符输出流对象
			
			//边输入输出--字符
			char[] cbuf = new char[1024];
			int len = -1; //已经读取的字节数, 底层规定-1表示读到末尾
			while((len = reader.read(cbuf)) != -1){
				writer.write(cbuf, 0, len);
			}
			
			//关闭资源
			reader.close();
			writer.close();
			
			//拷贝文件重命名
			String old = file.getName();
			String newName = old.substring(0, old.lastIndexOf(".")) + ".java";
			File copy = new File(write, file.getName());
			copy.renameTo(new File(write, newName));
			
			//删除拷贝过去的源文件---重复拷贝会产生一份源文件
			copy.delete();
		}
		
	}
}

package com._520it.day02_demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.io.OutputStream;

//字节流IO操作----文件的拷贝
public class CopyByteDemo {
	public static void main(String[] args) throws Exception {
		File in = new File("C:/Users/Qyuelin/Desktop/java_test/infile");      //输入目录路径
		File out = new File ("C:/Users/Qyuelin/Desktop/java_test/outfile");	  //输出目录路径
		
		//筛选出所需要的文件
		File[] fs = in.listFiles(new FilenameFilter(){						//使用匿名类来筛选获取.txt后缀文件
			public boolean accept(File dir, String name) {
				return new File(dir, name).isFile() && name.endsWith(".txt");
			}
			
		});
		
		for(File file : fs){
			InputStream ins = new FileInputStream(file); //输入流对象
			OutputStream outs = new FileOutputStream(new File(out, file.getName())); //输出流对象
			
			//定义byte[] 缓存池作用
			byte[] b = new byte[1024];
			
			int len = -1;  //已经读取的字节数, 底层规定-1表示读到末尾
			while((len = ins.read(b)) != -1){
				outs.write(b, 0, len);   //边读入边写出
			}
			//关闭资源
			ins.close();
			outs.close();
			
			//更改拷贝文件的后缀名
			File f = new File(out, file.getName()); //拷贝后文件路径--->拷贝文件名与被拷贝文件名一致
			String s = file.getName();				//获取拷贝文件名
			String str = s.substring(0, s.lastIndexOf(".")) + ".java";  // 拼接重命名后的文件名
			File rename = new File(out, str);		
			f.renameTo(rename);				//调用renameTo(File f ) 方法重命名文件
			
			//重命名后若目录中还存在拷贝文件,就删除--->防止多次重复拷贝后拷贝文件重新生成,因重命名文件之前已修改,无法再次重命名,
			f.delete();
			
		}
	}
}

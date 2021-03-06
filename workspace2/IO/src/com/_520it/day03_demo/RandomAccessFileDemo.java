package com._520it.day03_demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/*
 * 演示: 演示随机访问文件(任意位置读 与 写)------>RandomAccessFile
 */
public class RandomAccessFileDemo {
	public static void main(String[] args) throws Exception {
		File f = new File("File/randomWR.txt");
		
//		write(f);
		read(f);
	}

	private static void read(File f) throws Exception {
		RandomAccessFile r = new RandomAccessFile(f, "rw");
		r.setLength(1024); //1KB 设置文件长度大少 不过里面是否有无 单位:字节----测试
		
		System.out.println("文件的指针位置:" + r.getFilePointer());
		System.out.println(r.read());
		System.out.println("文件的指针位置:" + r.getFilePointer());
		
		System.out.println(r.readUTF());
		System.out.println("文件的指针位置:" + r.getFilePointer());
		
		System.out.println(r.readInt());
		System.out.println("文件的指针位置:" + r.getFilePointer()); //19
		System.out.println("-----------------=-----");
		
		System.out.println(r.readUTF());
		System.out.println("文件的指针位置:" + r.getFilePointer());// 22 + 2 == 24
		
		r.seek(0);  //设置指针位置 单位字节
		System.out.println("文件的指针位置:" + r.getFilePointer());// 32
		r.skipBytes(24); //指针跳过n个字节
		
		System.out.println(r.readDouble());
		System.out.println("文件的指针位置:" + r.getFilePointer());// 32
		r.close();
	}

	private static void write(File f) throws Exception {
		RandomAccessFile r = new RandomAccessFile(f, "rw");
		r.write(78);
		r.writeUTF("天下无双");
		r.writeInt(11);
		r.writeUTF("我");
		r.writeDouble(12D);
		r.close();
	}
}

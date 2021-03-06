package com._520it.day03_demo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
 * 演示数据流的使用
 */
public class DataDemo {
	public static void main(String[] args) throws Exception {
		File f = new File("File/xxData.java");
		outTest(f);
		inTest(f);
	}

	private static void inTest(File f) throws Exception {
		DataInputStream in = new DataInputStream(new FileInputStream(f));
		
		System.out.println(in.readByte());
		System.out.println(in.readChar());
		System.out.println(in.readInt());
		System.out.println(in.readUTF());
		in.close();
		
	}

	private static void outTest(File f) throws Exception {
		DataOutputStream out = new DataOutputStream(new FileOutputStream(f));
		out.writeByte(12);
		out.writeChar('A');
		out.writeInt(12306);
		out.writeUTF("试试");
		out.close();
	}
}

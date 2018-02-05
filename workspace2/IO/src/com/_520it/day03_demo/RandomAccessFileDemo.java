package com._520it.day03_demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/*
 * ��ʾ: ��ʾ��������ļ�(����λ�ö� �� д)------>RandomAccessFile
 */
public class RandomAccessFileDemo {
	public static void main(String[] args) throws Exception {
		File f = new File("File/randomWR.txt");
		
//		write(f);
		read(f);
	}

	private static void read(File f) throws Exception {
		RandomAccessFile r = new RandomAccessFile(f, "rw");
		r.setLength(1024); //1KB �����ļ����ȴ��� ���������Ƿ����� ��λ:�ֽ�----����
		
		System.out.println("�ļ���ָ��λ��:" + r.getFilePointer());
		System.out.println(r.read());
		System.out.println("�ļ���ָ��λ��:" + r.getFilePointer());
		
		System.out.println(r.readUTF());
		System.out.println("�ļ���ָ��λ��:" + r.getFilePointer());
		
		System.out.println(r.readInt());
		System.out.println("�ļ���ָ��λ��:" + r.getFilePointer()); //19
		System.out.println("-----------------=-----");
		
		System.out.println(r.readUTF());
		System.out.println("�ļ���ָ��λ��:" + r.getFilePointer());// 22 + 2 == 24
		
		r.seek(0);  //����ָ��λ�� ��λ�ֽ�
		System.out.println("�ļ���ָ��λ��:" + r.getFilePointer());// 32
		r.skipBytes(24); //ָ������n���ֽ�
		
		System.out.println(r.readDouble());
		System.out.println("�ļ���ָ��λ��:" + r.getFilePointer());// 32
		r.close();
	}

	private static void write(File f) throws Exception {
		RandomAccessFile r = new RandomAccessFile(f, "rw");
		r.write(78);
		r.writeUTF("������˫");
		r.writeInt(11);
		r.writeUTF("��");
		r.writeDouble(12D);
		r.close();
	}
}
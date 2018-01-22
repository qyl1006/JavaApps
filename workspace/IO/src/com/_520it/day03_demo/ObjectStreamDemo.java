package com._520it.day03_demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo {
	public static void main(String[] args) throws Exception {
		File f = new File("File/ObjectSerialize/object.txt");
		
//		writeObject(f);
		readerObject(f);
	}

	//���л�����
	private static void writeObject(File f) throws Exception {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));
		//���л�����
		out.writeObject(new UserSerialize("Will", 17, 12345));
		
		//�ر���Դ
		out.close();
	}
	
	//�����л�����
	private static void readerObject(File f) throws Exception {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
		UserSerialize user = (UserSerialize) in.readObject();
		System.out.println(user);
		in.close();
	}
}
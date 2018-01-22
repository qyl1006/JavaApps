package com._520it.day01._file_input_stream;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;

//��ʾ��ϰ �ֽ��������� ʹ��
public class FileInputStreamDemo {
	public static void main(String[] args) throws Exception {
		//����Դ
		File f = new File("File/test.txt");
		
		//����IO������
		FileInputStream in = new FileInputStream(f);
		
		//����IO�Ĳ���
//		int i = in.read();
//		System.out.println(i);
		
		byte[] bye = new byte[5];
//		System.out.println(Arrays.toString(bye));
//		int len = in.read(bye);
//		System.out.println(len);
//		String str = new String(bye);
//		System.out.println(Arrays.toString(bye));
//		System.out.println(str);
		int len = -1;
		while((len = in.read(bye)) != -1){
//			System.out.println(bye[0]);
			String str = new String(bye,0 , len);
			System.out.println(str);
		}
		
		//�ر���Դ
		in.close();
		
		
	}
}
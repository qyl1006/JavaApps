package com._520it.day01._file_input_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//��ʾ ��ϰ ��ͳ�ر���Դ�ķ�ʽ
public class CloseResources1 {
	public static void main(String[] args) {
		test();
	}

	private static void test() {
		InputStream in = null;
		OutputStream out = null;

		try {// 1) ����Դ ��Ŀ�����
			String inStr = "File/test.txt";
			String outStr = "File/copy.txt";

			// 2) ����IO������  (���� ��� �ܵ�)
			in = new FileInputStream(inStr); //����
			out = new FileOutputStream(outStr); //���

			//3) �����IO����
			byte[] bye = new byte[5];
			int len = -1;

			//����-----> ���while���Կ���Դ���֪��read()���صĹ���
			while ((len = in.read(bye)) != -1) {
				out.write(bye, 0, len); //����������
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//�ر���Դ
			try {
				if (in != null) {
					in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (out != null) {
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
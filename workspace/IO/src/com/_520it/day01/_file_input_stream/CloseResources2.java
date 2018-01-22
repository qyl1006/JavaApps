package com._520it.day01._file_input_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

//��ϰ Java1.7��֮�����Դ�Զ��ر�����
public class CloseResources2 {
	public static void main(String[] args) {
		test();
	}

	private static void test() {
		// 1) ����Դ ��Ŀ�����
		String inStr = "File/test.txt";
		String outStr = "File/copy.txt";
		try (// 2) ����IO������  (���� ��� �ܵ�)
				InputStream in = new FileInputStream(inStr); //����
				OutputStream out = new FileOutputStream(outStr); //���)
		) {
			//3) �����IO����
			byte[] bye = new byte[5];
			int len = -1;

			//����-----> ���while���Կ���Դ���֪��read()���صĹ���
			while ((len = in.read(bye)) != -1) {
				out.write(bye, 0, len); //����������

			}
		} catch (Exception e) {

			e.printStackTrace();

		}
	}
}
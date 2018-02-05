package com._520it.day02_demo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * �����ļ��ֽڽڵ������װ�������ܺ�ʱ�Ա�--->1) һ���ֽ�һ���ֽڶ�ȡ���������Ա�   2)����һ��1024���������ȡ�����Ա�
 */
public class PerformanceTest {
	public static void main(String[] args) throws Exception {
		//���� 1-01
		//		test1_01(); //128872 ms
		//		test1_02(); //902 ms

		test2_01(); //209 ms
//		test2_02(); //82 ms
	}

	private static void test1_01() throws Exception {
		//����Դ / Ŀ���ļ�
		File source = new File("File/09.TCP��UDPЭ�����.avi");
		File target = new File("File/copyTest");

		//�����ֽ����������� �ֽ����������
		InputStream in = new FileInputStream(source); //����
		OutputStream out = new FileOutputStream(new File(target,
				source.getName())); //���
		long time = System.currentTimeMillis();

		//�ļ��������� --����������--һ���ֽ�һ���ֽڿ���
		//		byte[] b = new byte[1024];
		int len = -1;
		while ((len = in.read()) != -1) {
			out.write(len);
		}
		System.out.println(System.currentTimeMillis() - time);

		//�ر���Դ
		in.close();
		out.close();
	}

	private static void test1_02() throws Exception {
		//����Դ / Ŀ���ļ�
		File source = new File("File/09.TCP��UDPЭ�����.avi");
		File target = new File("File/copyTest");

		//�����ֽ����������� �ֽ����������--��װ��
		InputStream in = new BufferedInputStream(new FileInputStream(source)); //����
		OutputStream out = new BufferedOutputStream(new FileOutputStream(
				new File(target, source.getName()))); //���
		long time = System.currentTimeMillis();

		//�ļ��������� --����������--һ���ֽ�һ���ֽڿ���
		//				byte[] b = new byte[1024];
		int len = -1;
		while ((len = in.read()) != -1) {
			out.write(len);
		}
		System.out.println(System.currentTimeMillis() - time);

		//�ر���Դ
		in.close();
		out.close();
	}

	private static void test2_01() throws Exception {
		//����Դ / Ŀ���ļ�
		File source = new File("File/09.TCP��UDPЭ�����.avi");
		File target = new File("File/copyTest");

		//�����ֽ����������� �ֽ����������
		InputStream in = new FileInputStream(source); //����
		OutputStream out = new FileOutputStream(new File(target,source.getName())); //���
		long time = System.currentTimeMillis();

		//�ļ��������� --����������--һ���ֽ�һ���ֽڿ���
		byte[] b = new byte[1024];
		int len = -1;
		while ((len = in.read(b)) != -1) {
			out.write(b, 0, len);
		}
		System.out.println(System.currentTimeMillis() - time);

		//�ر���Դ
		in.close();
		out.close();
	}

	private static void test2_02() throws Exception {
		//����Դ / Ŀ���ļ�
		File source = new File("File/09.TCP��UDPЭ�����.avi");
		File target = new File("File/copyTest");

		//�����ֽ����������� �ֽ����������--��װ��
		InputStream in = new BufferedInputStream(new FileInputStream(source)); //����
		OutputStream out = new BufferedOutputStream(new FileOutputStream(new File(target, source.getName()))); //���
		long time = System.currentTimeMillis();

		//�ļ��������� --����������--һ���ֽ�һ���ֽڿ���
		byte[] b = new byte[1024];
		int len = -1;
		while ((len = in.read(b)) != -1) {
			out.write(b, 0, len);
		}
		System.out.println(System.currentTimeMillis() - time);

		//�ر���Դ
		in.close();
		out.close();
	}
}
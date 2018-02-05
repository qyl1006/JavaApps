package com._520it.day02_demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.io.OutputStream;

//�ֽ���IO����----�ļ��Ŀ���
public class CopyByteDemo {
	public static void main(String[] args) throws Exception {
		File in = new File("C:/Users/Qyuelin/Desktop/java_test/infile");      //����Ŀ¼·��
		File out = new File ("C:/Users/Qyuelin/Desktop/java_test/outfile");	  //���Ŀ¼·��
		
		//ɸѡ������Ҫ���ļ�
		File[] fs = in.listFiles(new FilenameFilter(){						//ʹ����������ɸѡ��ȡ.txt��׺�ļ�
			public boolean accept(File dir, String name) {
				return new File(dir, name).isFile() && name.endsWith(".txt");
			}
			
		});
		
		for(File file : fs){
			InputStream ins = new FileInputStream(file); //����������
			OutputStream outs = new FileOutputStream(new File(out, file.getName())); //���������
			
			//����byte[] ���������
			byte[] b = new byte[1024];
			
			int len = -1;  //�Ѿ���ȡ���ֽ���, �ײ�涨-1��ʾ����ĩβ
			while((len = ins.read(b)) != -1){
				outs.write(b, 0, len);   //�߶����д��
			}
			//�ر���Դ
			ins.close();
			outs.close();
			
			//���Ŀ����ļ��ĺ�׺��
			File f = new File(out, file.getName()); //�������ļ�·��--->�����ļ����뱻�����ļ���һ��
			String s = file.getName();				//��ȡ�����ļ���
			String str = s.substring(0, s.lastIndexOf(".")) + ".java";  // ƴ������������ļ���
			File rename = new File(out, str);		
			f.renameTo(rename);				//����renameTo(File f ) �����������ļ�
			
			//����������Ŀ¼�л����ڿ����ļ�,��ɾ��--->��ֹ����ظ������󿽱��ļ���������,���������ļ�֮ǰ���޸�,�޷��ٴ�������,
			f.delete();
			
		}
	}
}
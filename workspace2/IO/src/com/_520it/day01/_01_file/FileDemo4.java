package com._520it.day01._01_file;

import java.io.File;

// ʹ�õݹ��㷨�г�ָ��Ŀ¼�������ļ�,�������ļ��е������ļ�
public class FileDemo4 {
	public File[] fs;
	
	public static void main(String[] args) {
		File dir = new File("D:/FeiqWenJian/wolfcode(FCAA14FE4115)/С�����-��");  //����ָ��Ŀ¼
		test(dir);
	}
	// ������-->��ǰ���ļ�����һ��Ŀ¼��ʱ��
	public static void test(File dir){
		File[]  f = dir.listFiles();		//���ص�ǰĿ¼���е�Ŀ¼/�ļ�   File[]�������
		for(File ele : f){
			if(ele.isDirectory()){			//�жϵ�ǰ��ele�ļ��Ƿ���һ��Ŀ¼-->�Ƿ���true
				test(ele);					//�����Լ��ķ���
				continue;                   //������ǰѭ��,������һ��ѭ��  ��else����һ��
			}
		}
	}
}



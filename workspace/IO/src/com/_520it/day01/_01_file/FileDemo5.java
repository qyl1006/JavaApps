package com._520it.day01._01_file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
/*
 *����:  �г��ļ��ķֲ�ṹ
		  ����Ч��:Will-->01_JavaSE-->���Ϻ���Ƶ-->day18-->��Ƶ
 */
public class FileDemo5 {
	public static void main(String[] args) {
		File f = new File("D:/FeiqWenJian/wolfcode(FCAA14FE4115)/С�����-��/day27/��Ƶ/11.������-������(Calendar).avi");
		System.out.println(f);
		System.out.println(f.getParentFile());  //���ص�ǰFile�ĸ�Ŀ¼·����->D:\FeiqWenJian\wolfcode(FCAA14FE4115)\С�����-��\day27\��Ƶ
		System.out.println(f.getParentFile().getParentFile().getName()); //day27
		System.out.println("================");
		
		List<String> list = new ArrayList<>();
		test(list, f);
		
		Collections.reverse(list); //��ת�б�list��Ԫ��--->���ϵĹ�����Collections�ķ���
		System.out.println(list);  //��ӡЧ��  [FeiqWenJian, wolfcode(FCAA14FE4115), С�����-��, day27, ��Ƶ]
		
		//��ӡ�� Abc>Bcd>...��ʽ
		StringBuilder sb = new StringBuilder(list.size());
		for(String name : list){
			sb.append(name).append("-->");
		}
		sb.delete(sb.length() - 3, sb.length());
		System.out.println("���ĸ�ʽ:" + sb);
	}
	//ʹ�õݹ鷽ʽ�������е�Ŀ¼, �������Ƿֱ����ӵ�����list��--ArrayList����ṹ�洢
	private static void test(List<String> list, File f) {
		if(!"".equals(f.getParentFile().getName())){        //�ж� ����ǰfile��Ŀ¼��Ϊ��  �����ӵ�������
			list.add(f.getParentFile().getName());
		}
		if(f.getParentFile().getParentFile() != null){      //�ж� ����ǰfile��Ŀ¼�ĸ�Ŀ¼��Ϊnull  �͵����Լ��ķ�������
			test(list, f.getParentFile());
		}
	}
}
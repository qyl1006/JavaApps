package day17.char_sequence;

import java.util.Arrays;

/*
 * ��ϰ:
 * 1) String fileNames = "abc.java;hello.txt;hello.java;hello.class";
		String��ϰ-��ȡ��hello��ͷ���ļ����ĵĺ�׺��
	2) String��ϰ-�ѵ�������ĸ��д

	�ܽ�: ���ǵ���һЩ�ֳɵķ������ʹ��
 */
public class StringExDemo {
	public static void main(String[] args) {
		// 1)
		 String fileNames = "abc.java;hello.txt;hello.java;hello.class";
		 String[] str = fileNames.split(";");
		 System.out.println(Arrays.toString(str));
		 for(String name : str){
			 if (name.startsWith("hello")) {
				System.out.println(name.substring(name.lastIndexOf('.')));
			}
		 }
		 
		//	2)
		 String s = "afgqAGDAK";
		 String ss = s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
		 System.out.println(ss);
	}
}

//�﷨��ʽ:  import   ��Ҫ�������ȫ�޶���;
//import    ����.�Ӱ���.*;   ��ʾ������ð��µ����е��ڵ�ǰ�ļ���ʹ�õ�����.��������Ҫ���������ʱ��


import java.util.Arrays;
import java.lang.reflect.Method;


/*
	�������:
    ��ļ�����:           �����������.  PackageDemo.
    ���ȫ�޶�����:       ����.����;         com._520it.hello.PackageDemo
*/
public class ImportDemo
{
	public static void main(String[] args)
	{
		int[] arr = new int[]{0,5,6,3,7,9,2,6};

		//��ӡ����
		String a = Arrays.toString(arr);
		System.out.println(a);

		//����
		Arrays.sort(arr);
		a = Arrays.toString(arr);
		System.out.println(a);

		Method m;
	}
}
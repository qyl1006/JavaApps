package com._520it.List_Vector;

import java.util.Vector;

/* ��ʾ Vector��ķ���
 */
public class VectorDemo {
	public static void main(String[] args) {
		Vector v = new Vector(5);
		v.addElement(12);//------>������ֻ�ܴ洢����..����û�б�������Ϊ1.7�汾�Զ�װ��,Ҫ��Ч����֤�ĳ�1.5һ�¾ͻᱨ��
		
		// 2) ��֤---->�������д洢�Ķ���,���洢���Ƕ��������,�����Ƕ�����.
		Vector vv = new Vector();
		System.out.println(vv); //[]
		
		StringBuilder sb = new StringBuilder(5);
		sb.append("���Լ�����洢���Ƕ��������");
		vv.addElement(sb);
		System.out.println(vv); //[���Լ�����洢���Ƕ��������]
		sb.append("����ӡvv�����������,˵��������洢���Ƕ��������");
		System.out.println(vv); //OK
		
		Vector v3 = new Vector();
		StringBuilder sb1 = new StringBuilder();
		sb1.append(123);
		v3.add(sb1);
		System.out.println(v3);

	}
}
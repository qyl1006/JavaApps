package com._520it.List_Vector;

import java.util.Vector;

/*
 * ��ʾVector����
 */
public class VectorMethod {
	public static void main(String[] args) {
		vectorAdd();
		vectorRemove();
		vectorSet();
	}

	private static void vectorAdd() {
//		//����:
//			boolean add(Object e) ��ָ��Ԫ�����ӵ���������ĩβ,�ȼ���addElement������

		Vector v = new Vector();
		v.add('1');
		v.add(2);
		v.add(3);
		System.out.println(v);
//			void add(int index, Object element)  �ڴ�������ָ��λ�ò���ָ����Ԫ�ء�
		v.add(1, "�������");
		System.out.println(v);
//			boolean addAll(Collection c) :��c�����е�Ԫ�����ӵ���ǰ���϶�����
		Vector vv = new Vector();
		vv.add("����һ����������");
		vv.add("1");
		vv.add("1");
		vv.add("1");
		vv.add("1");
		v.add(vv);
		System.out.println(v);//[1, �������, 2, 3, [����һ����������]]
		System.out.println(v.size());
		v.removeAll(vv);
		System.out.println(v);
		System.out.println(v.size());
		Object v3 = v.set(4, "����");
		System.out.println(v);
		System.out.println(v3);
		
//		v.addAll(vv);
//		System.out.println(v);//[1, �������, 2, 3, ����һ����������]-->������ ���� �ײ���ǰ�vv��ת��char����,Ȼ���Ƶ�v����
//		System.out.println(v.size());
//		v.removeAll(vv);
//		System.out.println(v);
//		v.retainAll(vv);
//		System.out.println(v);
	}
	private static void vectorRemove() {
//		ɾ��:
//			Object remove(int index) :ɾ��ָ������λ�õ�Ԫ��,������ɾ��֮���Ԫ��.
		
		
//			boolean remove(Object o):ɾ��ָ����Ԫ��.
//			boolean removeAll(Collection c):�Ӵ˼������Ƴ�������ָ�� ����c�е�����Ԫ�ء� 
//			boolean retainAll(Collection c):�ڴ˼����н�����������ָ�� ����c�е�Ԫ��,���������ϵĽ����� 

	}
	public static void vectorSet(){
		System.out.println("========================================");

	}
}
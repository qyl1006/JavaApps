package com._520it.day23Task;

import java.util.ArrayDeque;
import java.util.Deque;

/*
 * ����: ���� Gun �࣬����е������ԣ����������� 5�����ṩ�����������ӡ�����ӵ������ӵ�û������ʾû���ӵ�����װ�ӵ��ķ�����װ���ӵ�Ҳ����ʾһ�£����ӵ����� Integer ����
 * 
 * ����: ������ǹ������ص�,Ӧ�ò���ջ�ṹArrayDeque���洢����(�ӵ�),
 */
public class GunDemo {
	public static void main(String[] args) {
		//����
		Gun g = new Gun();
		//װ������
		g.add(1);
		g.add(2);
		g.add(3);
		g.add(4);
		g.add(5);
		g.add(6);

		//�������
		g.shooting();
		g.shooting();
		g.shooting();
		g.shooting();
		g.shooting();
		g.shooting();
	}
}

class Gun {
	private Deque<Integer> deque; //����
	private int size; //�ӵ�������

	private final int DEFAULT = 5; //Ĭ��װ�ӵ���
	private final int MAX = 10; //���װ�ֵ���
	private int ShootNumber = DEFAULT; //�������

	Gun() {
		deque = new ArrayDeque<>(DEFAULT);
	}

	Gun(int i) {
		if (i > MAX) {
			throw new IllegalArgumentException("�������װ���޶�");
		}
		deque = new ArrayDeque<>(i);
		ShootNumber = i;
	}

	//װ�ӵ�
	public void add(Integer i) {
		if (size >= ShootNumber) {
			System.out.println("�ӵ��Ѿ�װ����");
			return;
		}
		deque.add(i);
		System.out.println(++size + "���ӵ���װ��");
	}

	//���
	public void shooting() {
		if (size == 0) {
			System.out.println("û���ӵ���");
			return;
		}
		System.out.println("�����" + deque.pollLast() + "���ӵ�");
		size--;
	}
}
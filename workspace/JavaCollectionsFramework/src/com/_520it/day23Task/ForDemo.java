
package com._520it.day23Task;

import java.util.ArrayList;
import java.util.List;
/*����: ʹ��forѭ������List����,����ӡ
 * �ܽ�: ArrayList������������,-->����ֻ�ܴ洢����,
 */

public class ForDemo {
	public static void main(String[] args) {
		//����һ��ArrayList����
		List<Integer> list = new ArrayList<>();
		//����Ԫ��
		list.add(1);//-------->�Զ�װ��
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		
		//ʹ��forѭ������--
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
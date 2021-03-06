package com._520it.Linked;

//双向链表的定义及操作
public class MyLinkedDemo {
	private Node first; //链表的第一个节点
	private Node last; //链表的最后一个节点
	int size; //节点的数量

	class Node {
		Node prev; //上一个节点的对象(引用关系)
		Node next; //下一个节点的对象(引用关系)
		Object ele; //当前节点存储的数据

		//构造器
		Node(Object ele) {
			this.ele = ele;
		}
	}

	//从后面添加节点
	public void addNext(Object ele) {
		Node newNode = new Node(ele);
		if (size == 0) {
			this.first = newNode;
			this.last = newNode;
		} else {
			//把新new的节点对象(地址值)赋给当前节点的next
			this.last.next = newNode;
			//把当前节点对象(地址值)赋给新new节点的prev
			newNode.prev = this.last;
			//把新new的节点作为最后一个节点
			this.last = newNode;
		}
		size++;
	}

	//从前面添加节点
	public void addPrev(Object ele) {
		Node newNode = new Node(ele);
		if (size == 0) {
			this.first = newNode;
			this.last = newNode;
		} else {
			//把新new的节点对象(地址值)赋给当前节点的prev
			this.first.prev = newNode;
			//把当前节点对象(地址值)赋给新new节点的next
			newNode.next = this.first;
			//把新new的节点作为第一个节点
			this.first = newNode;
		}
		size++;
	}

	//删除功能
	public void delete(Object ele) {
		Node current = this.query(ele);// 通用query()方法查询被删除ele的节点-->current
		if (current == null) {
			if (size == 0) {
				throw new IllegalArgumentException("节点不存在为null");
			} else {
				throw new IllegalArgumentException("删除的ele不存在");
			}
		}
		if (current == this.first && current == this.last) { //当有并且有一个节点的时候
			this.first.ele = null;
			this.first = null;
			this.last = null;
		} else if (current == this.first) { // 当current节点是第一个节点
			current.next.prev = null;
			this.first = current.next;
		} else if (current == this.last) { //当current节点是最后一个节点
			current.prev.next = null;
			this.last = current.prev;
		} else { //其它情况-->current节点在中间
			current.prev.next = current.next;
			current.next.prev = current.prev;
		}
		size--;
	}

	//查找节点
	public Node query(Object ele) {
		if (size == 0) { //zise为0,没有节点数
			return null;
		}
		Node current = this.first;
		int temp = size; //size赋给temp-->保证while循环操作时size值不改变
		while (0 < temp--) { //后置--的特性
			if (current.ele.equals(ele)) {
				return current;
			}
			current = current.next;
		}
		return null;
	}

	//返回节点长度
	public int size() {
		return size;
	}

	//打印所有节点
	public String toString() {
		if (size == 0) {
			return "[]";
		}
		StringBuilder sb = new StringBuilder(size * 2 + 1); //这里的 * 2, 应该是存储的ele是一个字节的,若2个字节则 * 3 +1
		sb.append("[");
		Node firstNode = this.first;
		int temp = size;
		while (temp > 0) { //字符串拼接
			if (1 == temp--) {
				sb.append(firstNode.ele + "]");
			} else {
				sb.append(firstNode.ele + ",");
			}
			firstNode = firstNode.next;
		}
		return sb.toString();
	}

}

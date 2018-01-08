package com._520it.Linked;

//双向链表的定义及操作
public class MyLinkedDemo {
	private Node first; //链表的第一个节点
	private Node last;	//链表的最后一个节点
	private int size;	//节点的数量
	
	class Node{
		Node prev;  //上一个节点的对象(引用关系)
		Node next;	//下一个节点的对象(引用关系)
		Object ele;	//当前节点存储的数据
		
		//构造器
		Node(Object ele){
			this.ele = ele;
		}
	}
	
	//从后面添加节点
	public void addNext(Object ele){
		Node newNode = new Node(ele);
		if (size == 0) {
			this.first = newNode;
			this.last = newNode;
		}else{
			//把新new的节点对象(地址值)赋给当前节点的next
			this.last.next = newNode;
			//把当前节点对象(地址值)赋给新new节点的prev
			newNode.prev = this.last;
			//把新new的节点作为最后一个节点
			this.last = newNode;
		}
		size ++;
	}
	
	//从前面添加节点
	public void addPrev(Object ele){
		Node newNode = new Node(ele);
		if (size == 0) {
			this.first = newNode;
			this.last = newNode;
		}else{
			//把新new的节点对象(地址值)赋给当前节点的prev
			this.first.prev = newNode;
			//把当前节点对象(地址值)赋给新new节点的next
			newNode.next = this.last;
			//把新new的节点作为第一个节点
			this.first = newNode;
		}
		size ++;
	}
	
	//打印所有节点
	public String toString(){
		if(size == 0){
			return "[]";
		}
		StringBuilder sb = new StringBuilder(size * 2 + 1); //这里的 * 2, 应该是存储的ele是一个字节的
		sb.append("[");
		Node firstNode = this.first;
		while(size > 0){
			if(size == 1){
				sb.append(firstNode.ele + "]");
			}else{
				sb.append(firstNode.ele + ",");
			}
			firstNode = firstNode.next;
			size --;
		}
		return sb.toString();
	}
	
}

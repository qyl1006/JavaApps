package com._520it._01_input;

import java.io.Console;

//ֻ�������ڿ���̨�У�������Eclispe������ʹ�á�
public class ConsoleDemo {
	public static void main(String[] args){
		Console console = System.console();
		
		//��ȡ�û������һ������
		String line = console.readLine();
		System.out.println(line);
	}
}

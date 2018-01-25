package com._520it.day01.InetAddress;

import java.net.InetAddress;
import java.net.URLDecoder;
import java.net.URLEncoder;

/*
 * ��ϰInetAddress��
 */
public class InetAddressDemo {
	public static void main(String[] args) throws Exception {
		InetAddress[] ip = InetAddress.getAllByName("localhost"); //����
		System.out.println(ip[0]);          //��ӡ---localhost/127.0.0.1
		
		//����IP��ַ�ַ�����ʽ
		System.out.println(ip[0].getHostAddress());        //127.0.0.1
		
		//���ش�IP��ַ��������
		System.out.println(ip[0].getHostName());		//localhost
		
		//�����Ƿ���Ե���õ�ַ--��λ����
//		System.out.println(ip[0].isReachable(100000));   //true
		
		//������---�������---application/x-www-form-urlencoded MIME����
		//��ȡƽ̨��Ĭ���ַ���
		System.out.println(System.getProperty("file.encoding"));  //GBK
		
		//ʹ��UTF-8����
		String name = "������ will 17";
		String ret = URLEncoder.encode(name, "UTF-8");
		System.out.println(ret);  //%E4%BB%BB%E5%A4%A9%E5%A0%82+will+17
		
		//ʹ��UTF-8����
		String msg = URLDecoder.decode(ret, "UTF-8");
		System.out.println(msg);  //������ will 17
	}
}
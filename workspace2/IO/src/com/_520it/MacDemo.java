package com._520it;

import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.UnsupportedEncodingException;
import java.util.Random;

public class MacDemo {
	public static void main(String[] args) throws Exception {
//		getMac("192.168.217.1");
		Random r = new Random();
		System.out.println(r.nextInt(3));
		
	}

	private static void getMac(String ip) throws Exception {
		String str = null;
		String mac = null;
		
		Process p = Runtime.getRuntime().exec("nbtstat-A" + ip);
		InputStreamReader ir = new InputStreamReader(p.getInputStream(), "GBK");
		LineNumberReader input = new LineNumberReader(ir);
		
		while(true){
			str = input.readLine();
			if(str != null){
				if(str.indexOf("MAC address") > 1){
					mac = str.substring(str.indexOf(("MAC address") + 9));
					break;
				}
			}
		}
		System.err.println(mac);
		
	}
}
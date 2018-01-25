package com._520it.day01.InetAddress;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/*
 * ��ϰ
 */
public class URLDemo {
	public static void main(String[] args) throws Exception {
		URL url = new URL("http", "localhost", 8080, "//tomcat.png");
		
		URLConnection con = url.openConnection();
		
		InputStream in = con.getInputStream();
//		Scanner sca = new Scanner(in);
//		
//		while(sca.hasNext()){
//			System.out.println(sca.nextLine());
//		}
		Files.copy(in, Paths.get("123.png"));
		in.close();
		
		
	}
}

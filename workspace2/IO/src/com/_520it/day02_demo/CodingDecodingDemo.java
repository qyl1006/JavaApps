package com._520it.day02_demo;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
 * 练习数据传输过程中的数据编码 与 解码  以及解决乱码问题
 */
public class CodingDecodingDemo {
	public static void main(String[] args) throws Exception {
		//编码
		String str = "秦跃林";
		byte[] b = str.getBytes("UTF-8");
		System.out.println(Arrays.toString(b)); //数据都是二进制传输的,包括存储在计算机的数据 1和0的世界
		
		//解码
		String s = new String(b, "UTF-8");
		System.out.println(s);
		
		//乱码问题---->就是当编码与解码的时候没有使用同一种规范协议的时候出现  <------数据编码解码时使用Charset不一致
		String ss = new String(b, "ISO-8859-1");
		System.out.println(ss);//  ?§?è·????	<-------乱码
		
		//解决办法--->1把解析出现乱码的数据(String)编码回去成byte[] 2在把byte[]用之前传输过来的Charset解析
		// 1
		byte[] bb = ss.getBytes("ISO-8859-1");
		
		String sss = new String(bb, "UTF-8");
		System.out.println(sss);
		
	}
}

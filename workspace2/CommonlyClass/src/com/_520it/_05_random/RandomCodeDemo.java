package com._520it._05_random;

import java.util.Random;

public class RandomCodeDemo {
	public static void main(String[] args) {
		//需求: 生成5位随机数
		//1) 准备所有字母(大小写)和数字 用于 截取
		String str = "qazxswedcvfrtgbnhyujmkiolp";
		str += str.toUpperCase();
		str += "0123456789";

		//使用StringBuilder 5位 
		StringBuilder random = new StringBuilder(5);
		
		for (int i = 0; i < 5; i++) {
			random.append(str.charAt(new Random().nextInt(str.length())));
		}
		System.out.println(random);
		
		System.out.println("=======================================");
		
		/*模拟多人验证验证码  test  如果有输入与输出 与用户之间  那么问题来了:
		 1) 验证码生成时间应该每过一个设定值就刷新   验证码是不是需要个空间来接收 ?临时的?
		 2) 每个用户应该是单独有个验证码 验证时也应该是对应的 ?
		 3) 用户与验证码之间怎么建立一种联系或者说对应关系来?
		 4) 验证码基本都是临时的,基本验证成功后都会不用,应该不需要永久内存来存储 
		 5) 输入 与 输出 怎么实现?
		 6) 挖坑ing
		*/
		 
		String enter = random.toString();
		//String enter = "1j3Ja";
		
		boolean b = enter.equalsIgnoreCase(random.toString());
		System.out.println(b);
	}

}

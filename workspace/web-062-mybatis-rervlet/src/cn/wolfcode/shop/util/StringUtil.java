package cn.wolfcode.shop.util;

//判断字符串有值的工具类
public abstract class StringUtil {
	public static boolean hasLeng(String str){
		return str != null && str.length() > 0;
	}

}

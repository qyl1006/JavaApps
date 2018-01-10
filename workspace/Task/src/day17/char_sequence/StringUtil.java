package day17.char_sequence;
/*
 * 	String练习-判断字符串是否非空
 * 总结: 感受代码简洁优雅-->往这个方向思路去学习实践
 */
public class StringUtil {
	//非空判断
	public static boolean hasLength(String str){
		return str != null && !"".equals(str.trim());
	}
	
	//为空判断
	public static boolean isBlank(String str){
		return !hasLength(str);
	}
	
}

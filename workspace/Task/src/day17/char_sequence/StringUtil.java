package day17.char_sequence;
/*
 * 	String��ϰ-�ж��ַ����Ƿ�ǿ�
 * �ܽ�: ���ܴ���������-->���������˼·ȥѧϰʵ��
 */
public class StringUtil {
	//�ǿ��ж�
	public static boolean hasLength(String str){
		return str != null && !"".equals(str.trim());
	}
	
	//Ϊ���ж�
	public static boolean isBlank(String str){
		return !hasLength(str);
	}
	
}

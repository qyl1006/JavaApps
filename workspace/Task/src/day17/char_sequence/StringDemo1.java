package day17.char_sequence;
/*
 * ��ʾ����: String������Ŀ
 * 
 * ������1:
   ˵˵String str ="ABC"��String str = new String("ABC")������.
   	String  str = "ABC";�ô��봴����һ���������û�д���String����.
                    	�������ش���ABC,��ֱ������,�������ز�����ABC,���ȴ�������,������.
   	String  str = new String("ABC"); �ô��봴����һ����������String����.
                      				new�϶��ᴴ��String����,(ͬ��).

-----------------------
	�ܽ�:  "==" �Ƚϵ��� ----1) ������������-->ֵ
							2)������������--->���õĵ�ֵַ<------����
			equals����...Ĭ�ϵ�Object�ĺ�"=="һ��---->����������Ƚϵ�������
 */
public class StringDemo1 {
	private static String getXx() {
		return "AB";
	}
	
	public static void main(String[] args) {
		String str1 = "ABCD";
		String str2 = "A" + "B" + "C" + "D";
		String str3 = "AB" + "CD";
		String str4 = new String("ABCD");
		String temp = "AB";
		String str5 = temp + "CD";
		String str6 = getXx() + "CD";
		
		System.out.println("================================");
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str3 == str2); //���϶�Ϊtrue-->ԭ��:���������Զ��Ż�
		
		System.out.println("=====================================");
		System.out.println(str1 == str4); //false
		System.out.println(str1 == str5); //false
		System.out.println(str1 == str6); //false  //���϶���false---> ��Ϊtemp �� getXx() �����ַ�,������Ҫת�����ַ�,���ӵ�char����,
		
	}


}
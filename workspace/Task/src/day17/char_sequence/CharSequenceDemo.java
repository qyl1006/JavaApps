package day17.char_sequence;
/*
 * ��ʾ; String StringBuilder StringBuffer������-->ƴ��30000���ַ���,�Ա����Ǹ��Ե�����ʱ��
 * �ܽ�: String���ַ���ƴ�ӵ�ʱ��,���ܼ���(��ʱ),ԭ����Sting�ǲ��ɱ��,ÿ�����ݸı䶼�����ڴ��д����µĶ���.
		 String��ʱ:1738ms
		 StringBuffer��ʱ:9ms
		 StringBuilder��ʱ: 5ms
		 
		 ����: String���ɱ��  StringBuffer��StringBuilder�ɱ��
	 	StringBuffer:  StringBuffer�еķ�����ʹ����synchronized���η�,��ʾͬ����,�ڶ��̲߳�����ʱ����Ա�֤�̰߳�ȫ,��֤�̰߳�ȫ��ʱ��,����(�ٶ�)�ϵ�.
  						��Ҳ��������ԭ��-->ÿ��ƴ�Ӳ���ʱֻ��һ���߳���ͬ�������в���.
  		StringBuilder:StringBuilder�еķ�����û��ʹ����synchronized���η�,����ȫ,�������ܽϸ�.

		 

 */
public class CharSequenceDemo {

	public static void main(String[] args) {
		testString();     //1748
		testStringBuffer();  //9
		testStringBuilder();	//5
	}
	
	private static void testString() {
		long time1 = System.currentTimeMillis();
		String str = "";
		for (int i = 0; i < 30000; i++) {
			str += i;
		}
		long time2 = System.currentTimeMillis();
		System.out.println(time2 - time1);
	}
	private static void testStringBuffer() {
		long time1 = System.currentTimeMillis();
		StringBuffer sb2 = new StringBuffer();
		
		for (int i = 0; i < 30000; i++) {
			sb2.append(i);
		}
		long time2 = System.currentTimeMillis();
		System.out.println(time2 - time1);
	}
	private static void testStringBuilder() {
		long time1 = System.currentTimeMillis();
		StringBuilder sb3 = new StringBuilder();
		for (int i = 0; i < 30000; i++) {
			sb3.append(i);
		}
		long time2 = System.currentTimeMillis();
		System.out.println(time2 - time1);
	}


}
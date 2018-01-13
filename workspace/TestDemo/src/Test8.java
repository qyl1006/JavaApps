
class Test12306{
	
}

public class Test8 {
	Integer i = 12;
	public static void main(String[] args) {
		System.out.println(new Test12306().equals(new Test12306())); ///
		System.out.println(new Test12306().hashCode() == new Test12306().hashCode()); ///		
		Integer i = 1;
		Integer ii = 1;
		
		System.out.println(i.equals(ii));
		
		StringBuilder sb = new StringBuilder(5);
		sb.append("a");
		StringBuilder sb1 = new StringBuilder(5);
		sb1.append("a");
		System.out.println(sb.equals(sb1));
		
		String str = "1";
		String str1 = "1";
		System.out.println("equals: " + str.equals(str1));
		System.out.println(str.hashCode() == str1.hashCode());
		
		System.out.println("=================");
		System.out.println(new Character('1').hashCode() == new Character('1').hashCode());
		
	}
}

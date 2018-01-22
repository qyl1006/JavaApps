import java.math.BigDecimal;
import java.util.concurrent.ThreadLocalRandom;


public class Test9Demo {
	public static void main(String[] args) {
		int i = ThreadLocalRandom.current().nextInt(10, 20);
		System.out.println("01: " + i);
		
		String s = String.valueOf(i);
		BigDecimal ii = new BigDecimal(s);
		System.out.println(ii);
		
		BigDecimal ii2 = new BigDecimal("11.50");
		
		System.out.println(ii.add(ii2));
		System.out.println(ii);
		System.out.println(ii);
		System.out.println(ii2);
		
		int number = ii2.compareTo(new BigDecimal("0.00"));
		
		System.out.println(number);
		System.out.println(number <= 0);
		
	}
}
package Bank;

import java.math.BigDecimal;
import java.util.concurrent.ThreadLocalRandom;

//����֧��/ȡǮ/
public class paymentDemo implements Runnable{
	private BankAccountDemo vlue;
	

	private BigDecimal money = new BigDecimal("15.5");
	
	paymentDemo(BankAccountDemo vlue){
		this.vlue = vlue;
	}
	
	
	public void run() {
		//����10��
		for (int i = 0; i < 10; i++) {
			try {
				vlue.alipay(money);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

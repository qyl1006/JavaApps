package Bank;

import java.math.BigDecimal;
import java.util.concurrent.ThreadLocalRandom;

//消费支付/取钱/
public class paymentDemo implements Runnable{
	private BankAccountDemo vlue;
	

	private BigDecimal money = new BigDecimal("15.5");
	
	paymentDemo(BankAccountDemo vlue){
		this.vlue = vlue;
	}
	
	
	public void run() {
		//消费10次
		for (int i = 0; i < 10; i++) {
			try {
				vlue.alipay(money);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

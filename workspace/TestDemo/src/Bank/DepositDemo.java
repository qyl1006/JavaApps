package Bank;

import java.math.BigDecimal;
import java.util.concurrent.ThreadLocalRandom;

//����
public class DepositDemo implements Runnable{
	private BankAccountDemo vlue;
	
	private BigDecimal money = new BigDecimal("500");
	
	DepositDemo(BankAccountDemo vlue){
		this.vlue = vlue;
	}
	
	public void run() {
		//һ������1��
		for (int i = 0; i < 1; i++) {
			vlue.saveMoney(money);
		}
	}

}
package Bank;

import java.math.BigDecimal;
import java.util.concurrent.ThreadLocalRandom;

//存入
public class DepositDemo implements Runnable{
	private BankAccountDemo vlue;
	
	private BigDecimal money = new BigDecimal("500");
	
	DepositDemo(BankAccountDemo vlue){
		this.vlue = vlue;
	}
	
	public void run() {
		//一共存入1次
		for (int i = 0; i < 1; i++) {
			vlue.saveMoney(money);
		}
	}

}

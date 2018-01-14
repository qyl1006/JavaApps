package Bank;

import java.math.BigDecimal;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//个人银行账号资源(金额)--共同的操作资源
public class BankAccountDemo {
	private BigDecimal balance = new BigDecimal("100.00");
	private BigDecimal middle = new BigDecimal("0.00");
	
	final Lock lock = new ReentrantLock();
	final Condition safe = lock.newCondition();
	
	
	//存钱/转账收入等
	public void saveMoney(BigDecimal money){
		lock.lock(); //获取锁
		int temp = balance.compareTo(middle); //账号余额与0比较 大于返回1 等于返回 0 小于返回 -1
		if(temp <= 0){
			safe.signalAll();  //唤醒所有
		}
		balance = balance.add(money);
		System.out.println("存入:" + money +  ", 余额为:" + balance);
		lock.unlock();  //释放锁
	}
	
	//取钱/支付宝/微信消费等
	public void alipay(BigDecimal money) throws InterruptedException{
		lock.lock();
		int temp = balance.compareTo(middle); //账号余额与0比较 大于返回1 等于返回 0 小于返回 -1
		while(temp <= 0){
			System.out.println("余额不足,扣款失败");
			safe.await();   //睡眠
		}
		
		balance = balance.subtract(money);
		int temp2 = balance.compareTo(middle);
		while(temp2 <= 0){
			System.out.println("余额不足, 扣款失败");
			balance.add(money);
			safe.await();       //睡眠
		}
		System.out.println("消费:" + money + ", 余额为:" + balance);
		lock.unlock();
		
	}
}

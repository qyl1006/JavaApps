package Bank;

import java.math.BigDecimal;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//���������˺���Դ(���)--��ͬ�Ĳ�����Դ
public class BankAccountDemo {
	private BigDecimal balance = new BigDecimal("100.00");
	private BigDecimal middle = new BigDecimal("0.00");
	
	final Lock lock = new ReentrantLock();
	final Condition safe = lock.newCondition();
	
	
	//��Ǯ/ת�������
	public void saveMoney(BigDecimal money){
		lock.lock(); //��ȡ��
		int temp = balance.compareTo(middle); //�˺������0�Ƚ� ���ڷ���1 ���ڷ��� 0 С�ڷ��� -1
		if(temp <= 0){
			safe.signalAll();  //��������
		}
		balance = balance.add(money);
		System.out.println("����:" + money +  ", ���Ϊ:" + balance);
		lock.unlock();  //�ͷ���
	}
	
	//ȡǮ/֧����/΢�����ѵ�
	public void alipay(BigDecimal money) throws InterruptedException{
		lock.lock();
		int temp = balance.compareTo(middle); //�˺������0�Ƚ� ���ڷ���1 ���ڷ��� 0 С�ڷ��� -1
		while(temp <= 0){
			System.out.println("����,�ۿ�ʧ��");
			safe.await();   //˯��
		}
		
		balance = balance.subtract(money);
		int temp2 = balance.compareTo(middle);
		while(temp2 <= 0){
			System.out.println("����, �ۿ�ʧ��");
			balance.add(money);
			safe.await();       //˯��
		}
		System.out.println("����:" + money + ", ���Ϊ:" + balance);
		lock.unlock();
		
	}
}
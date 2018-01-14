package Bank;
//测试
public class TestDemo {
	public static void main(String[] args) {
		//创建Runable对象
		BankAccountDemo r = new BankAccountDemo();
		
		
		//消费支付线程
		new Thread(new paymentDemo(r)).start();
		new Thread(new paymentDemo(r)).start();
		new Thread(new paymentDemo(r)).start();
		new Thread(new paymentDemo(r)).start();
		new Thread(new paymentDemo(r)).start();
		new Thread(new paymentDemo(r)).start();
		new Thread(new paymentDemo(r)).start();
		
		//存入线程
		new Thread(new DepositDemo(r)).start();
	}
}

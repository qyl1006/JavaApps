package Bank;
//����
public class TestDemo {
	public static void main(String[] args) {
		//����Runable����
		BankAccountDemo r = new BankAccountDemo();
		
		
		//����֧���߳�
		new Thread(new paymentDemo(r)).start();
		new Thread(new paymentDemo(r)).start();
		new Thread(new paymentDemo(r)).start();
		new Thread(new paymentDemo(r)).start();
		new Thread(new paymentDemo(r)).start();
		new Thread(new paymentDemo(r)).start();
		new Thread(new paymentDemo(r)).start();
		
		//�����߳�
		new Thread(new DepositDemo(r)).start();
	}
}
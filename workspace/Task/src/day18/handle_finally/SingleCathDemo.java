package day18.handle_finally;
/*��ʾʹ��try--catch����׽�����쳣
 * �ܽ�:  try-catch�﷨��ʽ:
 * 		try{
 * 			��д���ܻ���ֵ��쳣����
 * 			)catch(�쳣���� e){
 * 				�����쳣�Ĵ���
 *				//��¼�ռ�//��ӡ�쳣��Ϣ//�����׳��쳣
 * 			}
 * 		
 */
public class SingleCathDemo {
	public static void main(String[] args) {
		try{
			int i = 10 / 0;
			System.out.println(i);
		}catch(ArithmeticException e){
			System.out.println("��������Ϊ��");
		}
	}
}
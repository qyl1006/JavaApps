package day18.handle_finally;
/*
 * ��ʾ��׽����쳣
 * �ܽ�:  try-catch�﷨��ʽ:
 * 		try{
 * 			��д���ܻ���ֵ��쳣����
 * 			)catch(�쳣���� e){
 * 				�����쳣�Ĵ���
 *				//��¼�ռ�//��ӡ�쳣��Ϣ//�����׳��쳣
 * 			}
      ע��:   �����쳣֮��,������ж�,���Ա��봦���쳣.
      		����ִ����������,, �κζ��������������й���-->������Ǵ���ִ�в��� ԭ��
 */

public class MultiCathDemo {
	public static void main(String[] args) {
		try{
			System.out.println(10 / 0);
		}catch (ArithmeticException e){
			System.out.println("��������Ϊ��");
		}catch(NullPointerException e){
			System.out.println("�����д�����쳣�Ĵ��� ���ӡ��Ϣ���û����ӡ��ϸ��Ϣ������");	
		}
	}
}
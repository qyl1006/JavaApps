package day15;
/*����: ��ʾ --> �ֲ��ڲ���
 * �ܽ�:     �ֲ��ڲ��� �;ֲ�������ͬһ�������
 * 		1:����ʹ��public,private,protected,static���η�.
		2):�ֲ��ڲ���ֻ���ڵ�ǰ������ʹ��.
		3):�ֲ��ڲ����ʵ���ڲ���һ��,���ܰ�����̬��Ա.
		4):�ֲ��ڲ����ʵ���ڲ���,���Է����ⲿ������г�Ա.
		5):�ֲ��ڲ�����ʵľֲ���������ʹ��final����(��Java8�����Զ���ʽ����final,������Ȼ�ǳ���,���ܸı�ֵ).

 * 
 * 
 */
public class LocalInnerClassDemo {
	public static void main(String[] args) {
		//���� 
		new Test2Demo().sysot();
	}
}

//�ֲ��ڲ���
class Test2Demo{
	public void sysot() {
		final String name = "111";
		class Test2{
			public void print2() {
				System.out.println(name);
			}
		}
		new Test2().print2();
	}
}

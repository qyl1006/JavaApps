package day15;
/*����: ��ʾʵ���ڲ���  -->������֤/֤�������ص�
 * �ܽ�: �� ʵ�� �ڲ���û��ʹ��static����   ˵���ڲ��������ⲿ��Ķ���,�������ⲿ�౾��.
 * 
 * �ص�: �ص�:
			1:����ʵ���ڲ���ǰ,��������ⲿ�����,ͨ���ⲿ����󴴽��ڲ������(�������ڲ������ʱ,һ�������ⲿ�����).	
			    	Outter.Inner in = new Outter().new Inner();
			2:ʵ���ڲ����ʵ���Զ������ⲿ���ʵ��������,�ڲ������ֱ�ӷ����ⲿ���Ա.
			3:�ⲿ���в���ֱ�ӷ����ڲ���ĳ�Ա,����ͨ���ڲ����ʵ��ȥ����.
			4:ʵ���ڲ����в��ܶ��徲̬��Ա,ֻ�ܶ���ʵ����Ա.
			5:���ʵ���ڲ�����ⲿ�����ͬ�����ֶλ򷽷�abc,��ô���ڲ�����:
					this.abc:��ʾ�����ڲ����Ա.
					�ⲿ��.this.abc:��ʾ�����ⲿ���Ա.

 */
public class InstanceInnerClassDemo {
	public static void main(String[] args) {
		//1 ����ʵ���ڲ���ǰ,��������ⲿ�����,ͨ���ⲿ����󴴽��ڲ������(�������ڲ������ʱ,һ�������ⲿ�����).
		TestDemo.Test t = new TestDemo().new Test();
		
		//2 ʵ���ڲ����ʵ���Զ������ⲿ���ʵ��������,�ڲ������ֱ�ӷ����ⲿ���Ա.
		t.sysout();
		
		//3 �ⲿ���в���ֱ�ӷ����ڲ���ĳ�Ա,����ͨ���ڲ����ʵ��ȥ����.
		new TestDemo().demo();
		
		//5
		t.sysout();
	}
}

class TestDemo{
	String str = "�ⲿ����ֶ�";
	String name = "�ⲿ����ֶ�";
	
	public void demo(){
		System.out.println(this.new Test().name);
	}
	
	class Test{
		
		String name = "�ڲ�����ֶ�";
		public void sysout() {
			System.out.println("�ڲ���ķ���");
			System.out.println(str);
			System.out.println("=====================");
			
			System.out.println(this.name);
			System.out.println(TestDemo.this.name);
		}
	}
}
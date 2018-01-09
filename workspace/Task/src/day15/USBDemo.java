package day15;
/*
 * ����: �ýӿڵķ�ʽʵ�ֹ���USB�淶�İ���
 * 
 * �ܽ�: ����ӿڱ��-->��̬�ĺô�--->��ʵ������󸳸��ӿ����ͱ���,�����˲�ͬʵ����֮���ʵ�ֲ���,�Ӷ���������ͨ�ñ��.
		2) �������ڲ����ʺ��ڽ�ʹ��һ��ʹ�õ���,���ھֲ��ڲ�����������   
 */

public class USBDemo {
	public static void main(String[] args) {
		//����
		//ʹ����깦��
		MUSB usb1 = new Mouse();
		//Board.jack(usb1);
		
		//�����豸���� �����������ۿ�
		MUSB usb2 = new Keyboard();
		MUSB usb3 = new Printer();
		Board.jack(usb1);
		Board.jack(usb2);
	//	Board.jack(usb3);
	//	Board.jack(usb3);
	//	Board.jack(usb3);
	//	Board.jack(usb3);
	//	Board.jack(usb3);
		
		Board.call();
		
		System.out.println("===================================");
		//ʹ�������ڲ�������Ϊ�������
		Board.jack2(new MUSB(){
			public void function() {
				System.out.println("�����ڲ���.......");
			}
		});
		
	}

}

//����һ��MUSB�ӿڹ淶
interface MUSB {
	void function();
}

//�����
class Mouse implements MUSB{
	public void function(){
		System.out.println("������ƶ�......");
	}
}

//������
class Keyboard implements MUSB{
	public void function(){
		System.out.println("����žžž��Ϣ����ing.........");
	}
}

//��ӡ����
class Printer implements MUSB{
	public void function(){
		System.out.println("��ӡ��֨֨���ڴ�ӡing........");
	}
}

//������-
class Board{
	static MUSB[] usbs = new MUSB[6];
	static int count;
	
	//���������۹���
	public static void jack(MUSB usb){
		if (count > 5) {
			System.out.println("������...");
			return;
		}
		usbs[count] = usb;
		count ++;
	}
	
	//�����豸����
	public static void call(){
		for(MUSB u : usbs){
			if (u != null) {
				u.function();
			}
		}
	}
	
	public static void jack2(MUSB usb){
		usb.function();
	}
	
	
}
package day14;
/*
 * ����: ��Բ ������ ������ ����
 * */
public class GraphDemo {
	public static void main(String[] args) {
		
		//����
		//Բ
		System.out.println(new Circular(10D).acreage());
		
		//������
		System.out.println(new Rectangle(12D, 11D).acreage());
		
		//������
		System.out.println(new Triangle(3D, 4D, 5D).acreage());
		
	}
}

//ͼ�θ���
abstract class Graphical{
	abstract public Double acreage();
}

//Բ��
class Circular{
	private Double r;
	
	Circular(Double r){
		this.r = r;
	}
	
	//��������ķ���
	public Double acreage(){
		return Math.PI * this.r * this.r;
	}
}

//��������
class Rectangle{
	private Double length;
	private Double wide;
	
	Rectangle(Double length, Double wide){
		this.length = length;
		this.wide = wide;
	}
	
	//���
	public Double acreage(){
		return length * wide;
		
	}
}

//��������
class Triangle{
	private Double a;
	private Double b;
	private Double c;
	
	Triangle(Double a, Double b, Double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	//���
	public Double acreage(){
		Double p = (a + b + c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
	
	
}





//��Բ(circle)������(rectangle)��������(Triangle )�����   ֮���������󷽷�

//�������
abstract class Areas
{
	abstract public Double area();//ʹ��abstract���εķ����� ���󷽷� û�з�����,��������ȥʵ��/����
}

//Բ
class Circle extends Areas
{
	private Integer r;

	//������
	Circle(Integer r)
	{
		this.r = r;
	}

	//�������
	public Double area()
	{
		return 3.14 * r *r;
		//return Math.PI * r * r;
	}
}

//����
class Rectangles extends Areas
{
	private Integer length; //��
	private Integer high; //��

	//������
	Rectangles(Integer length, Integer high)
	{
		this.length = length;
		this.high = high;
	}

	//�������
	public Double area()
	{
		return length.doubleValue() * high.doubleValue(); //������õ�:Double.valueOf(length.doubleValue() * high.doubleValue());
	}
}

//������
class Triangle extends Areas
{
	private Integer a;
	private Integer b;
	private Integer c;

	//������
	Triangle(Integer a, Integer b, Integer c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	
	//���
	public Double area()
	{
		Double p = (a + b + c) / 2.0; // ? ��ô��λ??
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));  //����Math.sqrt() ����ƽ�����ķ���
	}
	
}

//��ʾ������
public class AcreageDemo
{
	public static void main(String[] args)
	{
		//����Բ����,���÷���,��ӡ���ֵ
		System.out.println(new Circle(10).area());


		//������
		System.out.println(new Rectangles(4, 5).area());
		
		//������
		System.out.println(new Triangle(4, 6, 9).area());  //�����ε����߹�ϵ a+b>c �� a-b<c

		System.out.println("=================");

	}
}
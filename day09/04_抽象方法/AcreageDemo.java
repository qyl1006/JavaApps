//��Բ(circle)������(rectangle)��������(Triangle )�����   ֮���������󷽷�

//Բ
class Circle
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
class Rectangles
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
class Triangle
{
	private Integer AA;
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


	}
}
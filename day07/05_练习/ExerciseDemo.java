//����: �ж�һ�����Բ�Ĺ�ϵ(��Բ��,Բ����,Բ��).
//����һ�� �� ��������
class Points
{
	private double x; // ���x������
	private double y;  //���y������

	//�Զ��幹����
	Points(double x, double y)
	{
		this.x = x;
		this.y = y;
	}

	//�����жϷ���, �������ԲΪ ���� 1 ����Բ���򷵻�0  ����Բ���򷵻� -1
	public int judge(double r)
	{
		double square = this.x * this.x + this.y * this.y;
		double i = Math.sqrt(square);
		if (i > r)
		{
			return 1;
		}else if (i < r)
		{
			return -1;
		}else
		{
			return 0;
		}
		
	}
}

//����һ��Բ������Ϊ(0 ,0),�뾶Ϊr��Բ����
class Round
{
	private double r;

	//�Զ��幹����
	Round(double r)
	{
		this.r = r;
	}

	public double getR()
	{
		return r;
	}
}


//������
public class ExerciseDemo
{
	public static void main(String[] args)
	{
		//double i = 9.0;
		//double j = Math.sqrt(i);
		//System.out.println(j);

		//����Բ����
		Round round = new Round(5);
		double r = round.getR(); // ��Ҫͨ��setter����ȡr��ֵ

		//���������
		Points p = new Points(3, 4);

		//���÷����ж�
		int i = p.judge(r);
		System.out.println("����ֵ: " + i);

	}
}
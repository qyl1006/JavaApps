//�����ĸ���
// ���� ����
class Bird
{
	//�ɵĹ��� ����
	public void fei()
	{	
		System.out.println("���ɵķ���");
	}
}

//�����  ����
class Penguin extends Bird
{
	public void fei()   //�����ĸ���
	{
		System.out.println("�Ҳ����,ֻ����Ӿ..");
	}

	public void print()
	{
		System.out.println("��ӡ");
		super.fei();      //�ؼ���super  ��ʾ��ǰ����ĸ������ ����������е��ø����б����ǵķ���fei()
	}
}

//������ʾ��
public class OverrideDemo
{
	public static void main(String[] args)
	{
		Penguin b = new Penguin();
		b.fei();
		b.print();
	}


}


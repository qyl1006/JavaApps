//�����
//�������
class CodeBlock
{
	{
		System.out.println("��ʼ�������");
	}

	//������
	CodeBlock()
	{
		System.out.println("----������=-----");
	}

	//static��̬ �����
	static
	{
		System.out.println("��ʼ����̬�����");
	}
}

//��ʾ��
public class CodeBlockDemo
{
	public static void main(String[] args)
	{
		//�ֲ������
		{
			int a = 1;
			System.out.println(a);
		}
		System.out.println("======================");

		//����CodeBlock��
		new CodeBlock();  //ÿ�δ��������ʱ�򶼻�ִ�г�ʼ�������:
					      //  ÿ�δ������󶼻���ù�����,�ڵ��ù�����֮ǰ,����ִ�б����еĳ�ʼ�������.
		new CodeBlock();
		new CodeBlock();

		System.out.println("======================");
		
	}
}
//�߼������
public class LogicalOperatorsDemo
{
	public static void main(String[] args)
	{	
		/*
			��(&):
			boolean ret = boolean���ʽA �� boolean���ʽB.
			������boolean���ʽ��Ϊtrue,�������true, �������ret��Ϊfalse
			& : λ��
			&& : ��·��

			& �� &&������
			& :���A���ʽΪfalse, Ҳ���ж�B���ʽ, �ٷ���false
			&&:���A���ʽΪfalse,�����ж�B���ʽ,ֱ�ӷ���false 

			Ч��: ��·��Ч�ʸ� 
		*/
		System.out.println(true & true); //true
		System.out.println(true & false);
		System.out.println(false & true);
		System.out.println(false & false);
		System.out.println("======================");

		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		System.out.println("================");

		//System.out.println(false & 1 /0 ==1); // 1 / 0 ����, ˵��&���ж�B���ʽ, ���Ա���
		System.out.println(false && 1 / 0 ==1); //���false, ˵�� && ��·�� ��A���ʽfalseʱ,������ȥ�жϱ��ʽB,ֱ�ӷ���false

	}
}
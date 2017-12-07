// ����Ļ�������
public class ArrayOperationDemo
{
	public static void main(String[] args) 
	{
		/*
			����Ļ�������:
     1:�����������:
       ��ȡԪ��:          Ԫ������ ���� =  ������[index];
       ����Ԫ��:          ������[index] = ֵ;
       ��������Ԫ��: ����ʹ��forѭ��,����֪��ѭ���Ĵ���.
       ���鳤��:  int len = ������.length;  length������,���Ƿ���.
       ������Χ:  ��0��ʼ,��һ����.   [0,������.length-1]
    2:�������鳣���쳣:
       NullPointerException:��ָ���쳣(������).
            �����黹δ��ʼ��,��ֱ�Ӳ�������.
        String[] bs = null;
        System.out.println(bs.length)
       ArrayIndexOutOfBoundsException:���������Խ���쳣.

		*/
		int[] nums = new int[]{1, 2, 3, 4, 5};

		int one = nums[0]; //��ȡ�����һ��Ԫ��
		int end = nums[nums.length - 1]; // ��ȡ�������һ��Ԫ��

		System.out.println("nums����ĳ���Ϊ:" + nums.length); // ���鳤��
		System.out.println("nums�����һ����Ϊ:" + one);
		System.out.println("nums�������һ����Ϊ:" + end);
		System.out.println("=======================" );

		nums[0] = 100;  //���������һ��Ԫ�ص�ֵ
		nums[nums.length - 1] = 500;// ���ĵڶ���
		System.out.println("nums�����һ����Ϊ:" + nums[0]);
		System.out.println("nums�������һ����Ϊ:" + nums[nums.length - 1]);
		System.out.println("=======================" );

		//System.out.println(nums[0]);
		//System.out.println(nums[1]);
		//System.out.println(nums[2]);
		//System.out.println(nums[3]);
		//System.out.println(nums[4]);
		for (int index = 0;index < nums.length;index ++ ) //������ӡ����Ԫ��
		{
			System.out.println(nums[index]);
		}
		
		System.out.println("=======================" );

		// ����: ��forѭ����������������Ԫ��(���ܰ���������Ԫ�ظ��ĳ�һ����,��֪���ܲ��ܸ������ò�ͬ��ֵ)
		for (int index = 0;index < nums.length; index ++ )
		{
			nums[index] = 250;
			System.out.println(nums[index]);
		}
		System.out.println("=======================" );
		
		// ֤����ͬ�������͵ĳ�ʼֵ
		//boolean��ʼֵ flase
		boolean[] bool = new boolean[3];
		for (int index = 0; index < bool.length; index ++ )
		{
			System.out.println(bool[index]);
		}
		System.out.println("=======================" );

		//String��ʼֵΪ null null��ʾû�������κ��ڴ�ռ�
		String[] str = new String[3];
		for (int index = 0; index < str.length; index ++ )
		{
			System.out.println(str[index]);
		}
		System.out.println("=======================" );


		//�������鳣���쳣
		String[] bs = null;   //��ʱ����û�������κ��ڴ�ռ�
		System.out.println(bs);  // ���Դ�ӡ,������,��Ϊ����ʱ�������null

		//�����쳣1:NullPointerException �����黹δ��ʼ��,��ֱ�Ӳ�����������
		//System.out.println(bs.length); //����ʱ,�ᱨ��,���ǳ����쳣1 :NullPointerException��ָ���쳣(������
		
		bs = new String[]{"1", "2", "3"};
		//�����쳣2
		// System.out.println(bs[3]); //ArrayIndexOutOfBoundsException:���������Խ���쳣 �����������ΧΪ[0,2]

	}
}

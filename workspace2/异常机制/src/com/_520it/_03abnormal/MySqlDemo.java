package com._520it._03abnormal;


//ģ�����ݿ� 
public class MySqlDemo {
	//�û������
	private String[] sql = new String[]{"will", "akdfajk", "adsa"};
	
	//��ѯ�û��Ƿ����,�Ƿ���true
	public boolean query(String s)
	{
		for (String i : sql)
		{
			if (i == s)
			{
				return true;
			}
		}
		return false;
	}
}

package com._520it._03abnormal;


//模拟数据库 
public class MySqlDemo {
	//用户名存放
	private String[] sql = new String[]{"will", "akdfajk", "adsa"};
	
	//查询用户是否存在,是返回true
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

package cn.wolfcode.smis.handler;

import java.sql.ResultSet;

/**
 * 处理结果集的规范
 * @param <T> 处理结果集后的类型
 */
public interface IResultSetHandler<T> {
	/**
	 * 处理结果集的方法
	 * @param rs 被处理的结果集对象
	 * @return 处理好的结果
	 * @throws Exception
	 */
	T handle(ResultSet rs) throws Exception;
}

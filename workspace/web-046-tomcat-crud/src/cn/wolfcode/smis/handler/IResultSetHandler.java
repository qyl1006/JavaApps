package cn.wolfcode.smis.handler;

import java.sql.ResultSet;

/**
 * 处理结果集的规范
 * @author Qyuelin
 *
 * @param <T> 处理好的结果类型
 */
public interface IResultSetHandler<T> {
	/**
	 * 处理结果集的方法
	 * @param rs 被处理的结果集
	 * @return 返回处理好的结果
	 * @throws Exception
	 */
	T handler(ResultSet rs) throws Exception;
}

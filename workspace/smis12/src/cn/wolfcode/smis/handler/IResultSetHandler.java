package cn.wolfcode.smis.handler;

import java.sql.ResultSet;

public interface IResultSetHandler<T> {
	T handler(ResultSet rs) throws Exception;
}

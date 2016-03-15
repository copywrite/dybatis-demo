package com.copywrite.dybatis.dao;

import org.springframework.orm.ibatis.SqlMapClientTemplate;

/**
 * Created by copywrite on 16/3/14.
 */

public class BaseDAO {

	protected SqlMapClientTemplate sqlMapClientTemplate;

	public void setSqlMapClientTemplate(
			SqlMapClientTemplate sqlMapClientTemplate) {
		this.sqlMapClientTemplate = sqlMapClientTemplate;
	}
}

package com.ssm.dao;

import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.ssm.exception.MyException;
import com.ssm.exception.ParameterException;

@Repository
public class ExceptionDao implements ExceptionDaoInterface{
	
	public void daoSqlEx() throws Exception{
		throw new SQLException("Dao中数据库异常！");
	}
	
	public void daoParaEx() throws Exception{
		throw new ParameterException("dao层参数异常！");
	}
	
	public void daoMyEx() throws Exception{
		throw new MyException("dao层自定义异常！");
	}
}

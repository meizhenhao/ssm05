package com.ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.ExceptionDaoInterface;
import com.ssm.exception.BusinessException;
import com.ssm.exception.MyException;
import com.ssm.exception.ParameterException;

@Service
public class ExceptionService implements ExceptionServiceInterface{

	@Autowired
	ExceptionDaoInterface exceptionDao;
	@Override
	public void daoSqlEx() throws Exception {
		// TODO Auto-generated method stub
		exceptionDao.daoSqlEx();
	}

	@Override
	public void daoParaEx() throws Exception {
		// TODO Auto-generated method stub
		exceptionDao.daoParaEx();
	}

	@Override
	public void daoMyEx() throws Exception {
		// TODO Auto-generated method stub
		exceptionDao.daoMyEx();
	}

	@Override
	public void serviceBusyEx() throws Exception {
		// TODO Auto-generated method stub
		throw new BusinessException("Service层业务逻辑抛出异常");
	}

	@Override
	public void serviceParaEx() throws Exception {
		// TODO Auto-generated method stub
		throw new ParameterException("service层参数异常");
	}

	@Override
	public void serviceMyEx() throws Exception {
		// TODO Auto-generated method stub
		throw new MyException("service层自定义异常");
	}
	
	
}

package com.ssm.service;

public interface ExceptionServiceInterface {
	public void daoSqlEx() throws Exception;
	public void daoParaEx() throws Exception;
	public void daoMyEx() throws Exception;
	
	
	public void serviceBusyEx() throws Exception;
	public void serviceParaEx() throws Exception;
	public void serviceMyEx() throws Exception;
}

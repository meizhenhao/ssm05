package com.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.exception.BusinessException;
import com.ssm.exception.MyException;
import com.ssm.exception.ParameterException;
import com.ssm.exception.divisionException;
import com.ssm.service.ExceptionServiceInterface;

@Controller
@RequestMapping("/Hander")
public class ExceptionControllerByHander extends baseController{
	@Autowired
	ExceptionServiceInterface exceptionService;
	
	//测试@ResponseStatus注解
	@RequestMapping("/testResponseStatus/{id}")
	public String testResponseStatus(@PathVariable int id){
		
		if(id == 0){
			throw new divisionException();
		}
		
		return "index";
	}
	
	@RequestMapping("/showIndex")
	public String showIndex(){
		return "index";
	}
	
	
	@RequestMapping("/daoSqlEx")
	public void daoSqlEx() throws Exception{
		exceptionService.daoSqlEx();
	}
	
	@RequestMapping("/daoParaEx")
	public void daoParaEx() throws Exception{
		exceptionService.daoParaEx();
	}
	
	@RequestMapping("/daoMyEx")
	public void daoMyEx() throws Exception{
		exceptionService.daoMyEx();
	}
	
	@RequestMapping("/serviceBusyEx")
	public void serviceBusyEx() throws Exception{
		exceptionService.serviceBusyEx();
	}
	
	@RequestMapping("/serviceParaEx")
	public void serviceParaEx() throws Exception{
		exceptionService.serviceParaEx();
	}
	
	@RequestMapping("/serviceMyEx")
	public void serviceMyEx() throws Exception{
		exceptionService.serviceMyEx();
	}
	
	@RequestMapping("/controllerBusyEx")
	public void controllerBusyEx() throws Exception{
		throw new BusinessException("controller层抛出业务逻辑异常");
	}
	
	@RequestMapping("/controllerParaEx")
	public void controllerParaEx() throws Exception{
		throw new ParameterException("controller层抛出参数异常");
	}
	
	@RequestMapping("/controllerMyEx")
	public void controllerMyEx() throws Exception{
		throw new MyException("controller层抛出自定义异常");
	}
	
	
}

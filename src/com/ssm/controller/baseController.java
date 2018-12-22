package com.ssm.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ssm.exception.BusinessException;
import com.ssm.exception.MyException;
import com.ssm.exception.ParameterException;

public class baseController {
	
	 /** 基于@ExceptionHandler捕获全局的异常，并处理 */  
    @ExceptionHandler  
    public String exp(HttpServletRequest request, Exception ex) {  
          
        request.setAttribute("ex", ex);  
          
        // 根据不同错误转向不同页面  
        if(ex instanceof BusinessException) {  
            return "businessError";  
        }else if(ex instanceof ParameterException) {  
            return "parameterError";  
        }else if(ex instanceof MyException) {  
            return "myError";  
        }else if(ex instanceof SQLException) {  
            return "sqlError";  
        }else {  
            return "404";  
        }  
    }  
}

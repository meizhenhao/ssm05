package com.ssm.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND , reason="除数不能为0！")
public class divisionException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}

package com.example.aluminidashboardP.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
//@ResponseStatus to mark a method or an exception class with a status code and reason that should be returned
@ResponseStatus(HttpStatus.NOT_FOUND)
//Global Exception Handler class
{
public class UserNotFoundException extends RuntimeException {
	public  UserNotFoundException(String message,Throwable cause)
	{
		super(message,cause);
	}
	public UserNotFoundException(String message)
	{
		super(message);
	}
	
}

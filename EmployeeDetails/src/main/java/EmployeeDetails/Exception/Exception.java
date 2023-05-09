package EmployeeDetails.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class Exception extends RuntimeException{
	public static final long  serialVersionUID=1L;
	public Exception(String massege) {
		super(massege);
	}
 
}

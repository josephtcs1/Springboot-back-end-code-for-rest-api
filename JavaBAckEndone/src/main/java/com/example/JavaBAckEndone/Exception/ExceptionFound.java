package com.example.JavaBAckEndone.Exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ExceptionFound extends RuntimeException {
	public static final long serialVersionUID = 1L;
	public ExceptionFound(String messege) {
		super(messege);
	}

}

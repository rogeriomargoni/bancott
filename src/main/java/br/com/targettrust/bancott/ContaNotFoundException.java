package br.com.targettrust.bancott;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ContaNotFoundException extends RuntimeException {
	
	public ContaNotFoundException(String mensagem) {
		super(mensagem);
	}
}

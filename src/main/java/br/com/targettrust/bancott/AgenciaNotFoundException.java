package br.com.targettrust.bancott;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class AgenciaNotFoundException extends RuntimeException {
	
	public AgenciaNotFoundException(String mensagem) {
		super(mensagem);
	}
}

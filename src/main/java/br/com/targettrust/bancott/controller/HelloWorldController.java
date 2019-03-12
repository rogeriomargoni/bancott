package br.com.targettrust.bancott.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.targettrust.bancott.dominio.helloworld.HelloWorld;

@RestController
public class HelloWorldController {

	@GetMapping(path="/outravez")
	public String meuHelloWorld() {
		return "Olá Mundo";
	}	
	
	@GetMapping(path="/outravez-obj")
	public HelloWorld meuHelloWorldObj() {
		HelloWorld hw = new HelloWorld();
		hw.setMensagem("Bom dia boa tarde boa noite");
		hw.setValor(500.0);
		return hw;
	}	
}

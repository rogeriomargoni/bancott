package br.com.targettrust.bancott.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import br.com.targettrust.bancott.dominio.helloworld.HelloWorld;

@RestController
public class HelloWorldController {

	@GetMapping(path="/outravez")
	public String meuHelloWorld() {
		return "Olá Mundo";
	}	
	
	@GetMapping(path="/outravez-obj/{var}")
	public HelloWorld meuHelloWorldObj(@PathVariable String var) {
		HelloWorld hw = new HelloWorld();
		hw.setMensagem(var);
		hw.setValor(500.0);
		return hw;
	}	
}

package br.com.targettrust.bancott;

import java.util.HashSet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket api() {
		HashSet<String> consumesEProducers = 
				new HashSet<>(java.util.Arrays.asList("application/json"));
		return new Docket(DocumentationType.SWAGGER_2)  
				.apiInfo(apiInfo())
				.consumes(consumesEProducers)
				.produces(consumesEProducers).pathMapping("/");		
	}
	
	public ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("Banco TT")
				.description("Api para consumo de serviços")
				.version("1.0")
				.contact(new Contact("Rogério",
						"http://targettrust.com.br",
						"margoni@gmail.com"))
				.license("Apache 2.0")
				.build();
	}
}

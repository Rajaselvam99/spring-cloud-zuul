package com.spring.rest.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableDiscoveryClient
@RestController
public class DiagnosisServiceApplication {

	@GetMapping("/getDiagnosis")
	public String getDoctorService() {
		
		return "Checking the changed code are updated into the new branch...";
	}

	public static void main(String[] args) {
		SpringApplication.run(DiagnosisServiceApplication.class, args);

	}
	
//	  @Bean public Docket diagnosisAPI() { return new
//	  Docket(DocumentationType.SWAGGER_2).select()
//	  .apis(RequestHandlerSelectors.basePackage("com.spring.rest.api")).paths(
//	  PathSelectors.any()).build();
//	  
//	  }
	  
	 

}

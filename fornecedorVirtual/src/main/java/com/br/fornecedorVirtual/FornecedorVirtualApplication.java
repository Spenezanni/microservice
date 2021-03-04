package com.br.fornecedorVirtual;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@EnableAutoConfiguration
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class FornecedorVirtualApplication {

	public static void main(String[] args) {
		System.setProperty("spring.cloud.bootstrap.enabled", "true");
		SpringApplication.run(FornecedorVirtualApplication.class, args);
	}

}

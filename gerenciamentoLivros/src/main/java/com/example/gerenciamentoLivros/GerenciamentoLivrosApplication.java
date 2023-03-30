package com.example.gerenciamentoLivros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages ="com.example.gerenciamentoLivros" + "com.example.gerenciamentoLivros.model")

public class GerenciamentoLivrosApplication {

	public static void main(String[] args) {
		SpringApplication.run(GerenciamentoLivrosApplication.class, args);
	}

}

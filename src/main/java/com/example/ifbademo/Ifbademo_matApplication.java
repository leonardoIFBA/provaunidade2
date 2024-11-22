package com.example.ifbademo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class Ifbademo_matApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ifbademo_matApplication.class, args);
	}

	//obtem uma saída para o console
	@Bean
	//public CommandLineRunner demo(ClienteService) {
	public CommandLineRunner demo( ) {
		return (args) -> {

			//codigo para testar
			
			
		};
	}
}

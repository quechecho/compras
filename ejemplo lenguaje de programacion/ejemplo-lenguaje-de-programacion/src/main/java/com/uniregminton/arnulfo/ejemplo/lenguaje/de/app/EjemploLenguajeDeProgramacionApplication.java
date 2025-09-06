package com.uniregminton.arnulfo.ejemplo.lenguaje.de.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.uniregminton.arnulfo.ejemplo.lenguaje.de")
public class EjemploLenguajeDeProgramacionApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjemploLenguajeDeProgramacionApplication.class, args);
	}

}

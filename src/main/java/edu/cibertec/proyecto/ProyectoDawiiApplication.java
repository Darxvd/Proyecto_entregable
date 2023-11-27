package edu.cibertec.proyecto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "edu.cibertec.proyecto")
public class ProyectoDawiiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoDawiiApplication.class, args);
	}
	
}

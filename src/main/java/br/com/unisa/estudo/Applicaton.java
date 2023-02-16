package br.com.unisa.estudo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Applicaton extends SpringBootServletInitializer {

	public static void main(String[] args) {

		SpringApplication.run(Applicaton.class, args);
	}
}

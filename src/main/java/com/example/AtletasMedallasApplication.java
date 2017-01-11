package com.example;

import com.example.service.AtletaService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AtletasMedallasApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AtletasMedallasApplication.class, args);

		context.getBean(AtletaService.class).crearAtletas();

	}
}

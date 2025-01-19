package com.ledshra.Challenge_Literatura_Libro;

import com.ledshra.Challenge_Literatura_Libro.menu.MenuService;
import com.ledshra.Challenge_Literatura_Libro.menu.Principal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChallengeLiteraturaLibroApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ChallengeLiteraturaLibroApplication.class, args);
	}

	@Autowired
	private MenuService menuService;

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(menuService);
		principal.EjecutarAplicacion();
	}
}
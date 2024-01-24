package br.com.gabrieldias;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(origins = "*")
public class ProjetoApiRestUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoApiRestUsersApplication.class, args);
	}

}

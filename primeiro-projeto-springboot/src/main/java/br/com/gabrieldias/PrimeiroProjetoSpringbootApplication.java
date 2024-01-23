package br.com.gabrieldias;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication // Utilizada para marcar qual a classe principal dentro de uma aplicação Spring Boot "Essa e a classe principal da minha aplicacao e tudo oq for acontecer depois de startar vai acontecer baseada nesta classe.
// Spring Boot vai procurar uma classe comessa anotacao e sabe que o gerenciamento de toda a aplicacao vai ser baseado nessa classe.
// @ComponentScan(basePackages = "br.com.gabrieldias") // Essa anotacao diz que o Spring Boot vai procurar por todas as classes que estao dentro do pacote br.com.gabrieldias
public class PrimeiroProjetoSpringbootApplication {
	public static void main(String[] args) {
		SpringApplication.run(PrimeiroProjetoSpringbootApplication.class, args);
	}

}

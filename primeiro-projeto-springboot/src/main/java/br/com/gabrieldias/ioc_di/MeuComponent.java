package br.com.gabrieldias.ioc_di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class MeuComponent {

    public String chamarMeuComponente() {
        return "Chamou meu componente!";
    }

}

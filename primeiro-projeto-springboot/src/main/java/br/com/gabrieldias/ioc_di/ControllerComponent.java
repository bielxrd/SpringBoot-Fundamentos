package br.com.gabrieldias.ioc_di;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/component")
public class ControllerComponent {

    @Autowired
    MeuComponent component;

    // Ioc Di é um design pattern que diz que a classe não deve ser responsável por instanciar as suas dependências, mas sim receber as suas dependências por meio de injeção de dependência, ou seja, essa carga de trabalho fica para o framework, no caso o Spring Boot.

    @GetMapping("/")
    public String chamandoComponente() {
        String resultado = component.chamarMeuComponente();
        return resultado;
    }


}

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

    @GetMapping("/")
    public String chamandoComponente() {
        String resultado = component.chamarMeuComponente();
        return resultado;
    }


}

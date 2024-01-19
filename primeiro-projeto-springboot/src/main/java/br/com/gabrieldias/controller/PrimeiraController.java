package br.com.gabrieldias.controller;


import br.com.gabrieldias.model.Objeto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController // Essa anotacao diz que essa classe vai ser um controlador de uma aplicacao web
@RequestMapping("/primeiraController") // Toda vez que eu acessar a url /primeiraController vai cair dentro desta classe
public class PrimeiraController {

    @GetMapping("/primeiroMetodo") // Toda vez que eu acessar a url /primeiraController/primeiroMetodo vai cair dentro deste metodo
    @ResponseBody // Essa anotacao diz que o retorno deste metodo vai ser o corpo da resposta da requisicao
    public Objeto primeiroMetodo() {
        return new Objeto(1, "Gabriel");
    }


}

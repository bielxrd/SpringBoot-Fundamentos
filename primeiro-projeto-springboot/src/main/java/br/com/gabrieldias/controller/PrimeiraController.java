package br.com.gabrieldias.main.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Essa anotacao diz que essa classe vai ser um controlador de uma aplicacao web
@RequestMapping("/primeiraController") // Toda vez que eu acessar a url /primeiraController vai cair dentro desta classe
public class PrimeiraController {

    @GetMapping("/primeiroMetodo")
    public String primeiroMetodo() {
        return "Meu primeiro metodo API REST";
    }


}

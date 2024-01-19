package br.com.gabrieldias.controller;


import br.com.gabrieldias.model.Objeto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController // Essa anotacao diz que essa classe vai ser um controlador de uma aplicacao web
@CrossOrigin(origins = "*") // Essa anotacao diz que qualquer servidor pode fazer requisicoes para este controlador
@RequestMapping("/primeiraController") // Toda vez que eu acessar a url /primeiraController vai cair dentro desta classe
public class PrimeiraController {


    @GetMapping("/primeiroMetodo/{id}") // Toda vez que eu acessar a url /primeiraController/primeiroMetodo vai cair dentro deste metodo, o {id} e um parametro que eu posso passar na url
    public String primeiroMetodo(@PathVariable Integer id) { // Essa anotacao diz que o parametro id vai ser o parametro que eu passei na url
        return "O parametro é "+id;
    }

    // Query Params
    @GetMapping("/metodoComQueryParams")
    public String metodoComQueryParams(@RequestParam String id, @RequestParam(name = "nome") String name) { // RequestParam é uma anotacao para dizer que o parametro id vai ser um parametro que eu vou passar na url
        return "O parametro com metodoQueryParams é "+id+ "e o parametro name é "+name;
    }

    @GetMapping("/metodoComQueryParams2")
    public String metodoComQueryParams2(@RequestParam Map<String, String> allParams) { // @RequestParam com Map para pegar todos os parametros que eu passar na url
        return "Os parametros com metodoQueryParams é "+allParams.entrySet();
    }

    @GetMapping("/metodoJson") // Toda vez que eu acessar a url /primeiraController/metodoJson vai cair dentro deste metodo
    @ResponseBody // Essa anotacao diz que o retorno deste metodo vai ser o corpo da resposta da requisicao
    public Objeto metodoJson() {
        System.out.println("Funcionou!");
        return new Objeto(1, "Gabriel");
    }


}

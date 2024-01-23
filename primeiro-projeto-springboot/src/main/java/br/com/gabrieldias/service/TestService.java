package br.com.gabrieldias.service;

import br.com.gabrieldias.model.Usuario;
import br.com.gabrieldias.repositories.TesteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private TesteRepository testeRepository;

    public void salvar(Usuario objeto) {
        testeRepository.save(objeto);
    }
}

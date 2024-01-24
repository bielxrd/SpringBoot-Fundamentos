package br.com.gabrieldias.services;

import br.com.gabrieldias.entities.User;
import br.com.gabrieldias.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void salvar(User user) {
        userRepository.save(user);
    }
    public List<User> listagem(User user) {
        return userRepository.findAllByUsername(user.getUsername());
    }

}

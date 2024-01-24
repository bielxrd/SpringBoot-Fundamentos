package br.com.gabrieldias.controller;


import br.com.gabrieldias.entities.User;
import br.com.gabrieldias.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*") // permite que qualquer aplicação acesse a api
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UserService userService;

    @PostMapping("/cadastro")
    public ResponseEntity<Object> createUser(@RequestBody User user) {
        System.out.println("Bateu na api!");
        List<User> users = userService.listagem(user);

        if (users.size() > 0) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Username ja existe");
        } else {
            userService.salvar(user);
            return ResponseEntity.status(200).body(user);
        }


    }


}

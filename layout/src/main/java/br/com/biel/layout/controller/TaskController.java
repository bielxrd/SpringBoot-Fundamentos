package br.com.biel.layout.controller;


import br.com.biel.layout.model.Task;
import br.com.biel.layout.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;


import java.time.format.DateTimeFormatter;

@Controller
public class TaskController {

    @Autowired
    private TaskService taskService;


    @GetMapping("/create")
    public String home() {
        return "create.html";
    }

    @PostMapping("/create")

    public String create(Task task, Model model) {
        if (task.getDate() != null && task.getName() != null) {
            taskService.cadastrarTarefa(task);
            System.out.println("Cadastrado com sucesso!");
            model.addAttribute("sucess", "Cadastrado com sucesso");
            return "create";
        } else {
            model.addAttribute("error", "Os campos não podem ser nulos.");
            return "create";
        }

    }


}

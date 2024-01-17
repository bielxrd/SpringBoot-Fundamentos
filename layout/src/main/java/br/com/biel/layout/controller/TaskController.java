package br.com.biel.layout.controller;


import br.com.biel.layout.model.Task;
import br.com.biel.layout.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;


import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

@Controller
public class TaskController {

    @Autowired
    private TaskService taskService;


    @GetMapping("/create")
    public ModelAndView home() {
        ModelAndView mv = new ModelAndView("create");
        mv.addObject("task", new Task());
        return mv;
    }

    @PostMapping("/create")
    public String create(Task task, Model model) {
        if (task.getId() != null) {
            Optional<Task> taskFind = taskService.acharTarefa(task.getId());

            if (taskFind.isPresent()) {
                Task taskExisting = taskFind.get();

                taskExisting.setName(task.getName());
                taskExisting.setDate(task.getDate());

                taskService.cadastrarTarefa(taskExisting);
                return "redirect:/list";
            }

        } else {

            if (task.getDate() != null && task.getName() != null) {
                taskService.cadastrarTarefa(task);
                System.out.println("Cadastrado com sucesso!");
                model.addAttribute("sucess", "Cadastrado com sucesso");
                return "redirect:/list";
            } else {
                model.addAttribute("error", "Os campos não podem ser nulos.");
                return "create";
            }
        }

        return "redirect:/list";
    }

    @GetMapping("/list")
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView("list");
        List<Task> tasks = taskService.listarTarefas();
        if (tasks.isEmpty()) {
            modelAndView.addObject("empty", "Não há tarefas cadastradas");
            return modelAndView;
        } else {
            modelAndView.addObject("tasks", tasks);
            return modelAndView;
        }
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        taskService.delete(id);
        System.out.println("Deletado com sucesso");
        return "redirect:/list";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable("id") Long id) {
        ModelAndView mv = new ModelAndView("create.html");

        Optional<Task> taskOptional = taskService.acharTarefa(id);
        Task taskFind;
        if (taskOptional.isPresent()) {
            taskFind = taskOptional.get();
            mv.addObject("task", taskFind);
        } else {
            System.out.println("Tarefa nao encontrada");
        }
        return mv;
    }

}

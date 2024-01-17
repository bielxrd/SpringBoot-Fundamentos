package br.com.biel.layout.services;

import br.com.biel.layout.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.biel.layout.model.Task;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public void cadastrarTarefa(Task task) {
        taskRepository.save(task);
    }

    public List<Task> listarTarefas() {
        return taskRepository.findAll();
    }

    public void delete(Long id) {
        taskRepository.deleteById(id);
    }

    public Optional<Task> acharTarefa(Long id) {
        Optional<Task> task = taskRepository.findById(id);

        return task;
    }

}

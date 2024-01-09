package br.com.biel.layout.services;

import br.com.biel.layout.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.biel.layout.model.Task;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public void cadastrarTarefa(Task task) {
        taskRepository.save(task);
    }



}

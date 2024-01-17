package br.com.biel.layout.repositories;

import br.com.biel.layout.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TaskRepository extends JpaRepository<Task, Long> {

    public List<Task> findAllById();

}

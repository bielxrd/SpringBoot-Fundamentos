package br.com.biel.layout.repositories;

import br.com.biel.layout.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}

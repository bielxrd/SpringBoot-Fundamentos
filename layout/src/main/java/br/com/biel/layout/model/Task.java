package br.com.biel.layout.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tb_tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(unique = true)
    private Long id;
    private String name;

    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
    private LocalDateTime date;


}

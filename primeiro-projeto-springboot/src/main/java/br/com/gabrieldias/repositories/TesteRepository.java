package br.com.gabrieldias.repositories;

import br.com.gabrieldias.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TesteRepository extends JpaRepository<Usuario, Long> {
}

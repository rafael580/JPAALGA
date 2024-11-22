package br.com.jpaalga.name.domain.repositories;

import br.com.jpaalga.name.domain.entities.Estoque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstoqueRepository  extends JpaRepository<Estoque, Integer> {
}

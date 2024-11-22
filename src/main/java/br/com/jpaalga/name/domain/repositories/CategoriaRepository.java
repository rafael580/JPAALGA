package br.com.jpaalga.name.domain.repositories;

import br.com.jpaalga.name.domain.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Integer> {
}

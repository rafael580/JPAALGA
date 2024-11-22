package br.com.jpaalga.name.domain.repositories;


import br.com.jpaalga.name.domain.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}

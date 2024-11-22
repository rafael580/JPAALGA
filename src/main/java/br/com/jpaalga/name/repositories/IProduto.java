package br.com.jpaalga.name.repositories;


import br.com.jpaalga.name.entities.Produto;
import org.hibernate.dialect.pagination.LegacyOracleLimitHandler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProduto extends JpaRepository<Produto, Integer> {
}

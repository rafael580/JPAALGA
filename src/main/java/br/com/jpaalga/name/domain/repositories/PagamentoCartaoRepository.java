package br.com.jpaalga.name.domain.repositories;

import br.com.jpaalga.name.domain.entities.PagamentoCartao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoCartaoRepository extends JpaRepository<PagamentoCartao,Integer> {
}

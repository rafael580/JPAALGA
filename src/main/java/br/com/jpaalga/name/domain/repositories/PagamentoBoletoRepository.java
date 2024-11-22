package br.com.jpaalga.name.domain.repositories;

import br.com.jpaalga.name.domain.entities.PagamentoBoleto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoBoletoRepository extends JpaRepository<PagamentoBoleto,Integer> {
}

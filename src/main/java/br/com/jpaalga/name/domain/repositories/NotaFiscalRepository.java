package br.com.jpaalga.name.domain.repositories;

import br.com.jpaalga.name.domain.entities.NotaFiscal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotaFiscalRepository extends JpaRepository<NotaFiscal,Integer> {
}

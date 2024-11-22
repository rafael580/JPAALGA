package br.com.jpaalga.name.domain.repositories;

import br.com.jpaalga.name.domain.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Integer> {
}

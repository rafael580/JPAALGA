package br.com.jpaalga.name.domain.repositories;

import br.com.jpaalga.name.domain.entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository  extends JpaRepository<Pedido,Integer> {
}

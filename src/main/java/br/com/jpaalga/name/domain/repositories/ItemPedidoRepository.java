package br.com.jpaalga.name.domain.repositories;

import br.com.jpaalga.name.domain.entities.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemPedidoRepository  extends JpaRepository<ItemPedido,Integer> {
}

package br.com.jpaalga.name.relacionamentos;


import br.com.jpaalga.name.domain.entities.Pedido;
import br.com.jpaalga.name.domain.repositories.PedidoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class RemoveEntidadeReferenciadasTests {


    @Autowired
    PedidoRepository pedidoRepository;


    @Test
    public void removerEntidadeRelacionada(){

        Optional<Pedido> pedido = pedidoRepository.findById(2);
        Pedido pedido1 = pedido.orElse(null);
       // pedidoRepository.delete(pedido1);

    }


}

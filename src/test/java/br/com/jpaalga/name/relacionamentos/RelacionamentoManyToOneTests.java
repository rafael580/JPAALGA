package br.com.jpaalga.name.relacionamentos;


import br.com.jpaalga.name.domain.entities.Cliente;
import br.com.jpaalga.name.domain.entities.Pedido;
import br.com.jpaalga.name.domain.entities.StatusPedido;
import br.com.jpaalga.name.domain.repositories.ClienteRepository;
import br.com.jpaalga.name.domain.repositories.PedidoRepository;
import jakarta.persistence.Table;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Optional;

@SpringBootTest
public class RelacionamentoManyToOneTests {

    @Autowired
    ClienteRepository clienteRepository;
    @Autowired
    PedidoRepository pedidoRepository;

    @Test
    public void  testarManyToOne(){

        Optional<Cliente> cliente = clienteRepository.findById(1);
        Cliente cliente1 =  cliente.orElse(null);
        Pedido pedido = new Pedido();
        pedido.setStatus(StatusPedido.AGUARDANDO);
        pedido.setDataPedido(LocalDateTime.now());
        pedido.setCliente(cliente1);
        pedido.setTotal(BigDecimal.ONE);
        pedidoRepository.save(pedido);

    }



}

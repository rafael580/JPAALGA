package br.com.jpaalga.name.mapemanetoBasico;

import br.com.jpaalga.name.domain.entities.EnderecoEntregaPedido;
import br.com.jpaalga.name.domain.entities.Pedido;
import br.com.jpaalga.name.domain.entities.StatusPedido;
import br.com.jpaalga.name.domain.repositories.PedidoRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@SpringBootTest
public class MapeandoObjetoEmbutidoTest {

    @Autowired
    PedidoRepository pedidoRepository;

    @Test
    public void enderecoEmbu(){

        EnderecoEntregaPedido enderecoEntregaPedido = new EnderecoEntregaPedido();

        enderecoEntregaPedido.setBairro("centro");
        enderecoEntregaPedido.setCep("00000-00");
        enderecoEntregaPedido.setCidade("uberlandia");
        enderecoEntregaPedido.setLogradouro("rua das nacoes");
        enderecoEntregaPedido.setNumero("123");

        Pedido pedido = new Pedido();

        pedido.setId(1);
        pedido.setDataPedido(LocalDateTime.now());
        pedido.setStatus(StatusPedido.AGUARDANDO);
        pedido.setTotal(new BigDecimal(1000));
        pedido.setEnderecoEntregaPedido(enderecoEntregaPedido);
        pedidoRepository.save(pedido);
        Assertions.assertEquals(enderecoEntregaPedido,pedido.getEnderecoEntregaPedido());
    }
}

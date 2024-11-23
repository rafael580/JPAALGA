package br.com.jpaalga.name.domain.entities;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "pedido")
public class Pedido {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
    @Column(name = "data_pedido")
    private LocalDateTime dataPedido;
    @Column(name = "data_conclusao")
    private LocalDateTime dataConclusao;

    private BigDecimal total;
    @Enumerated(EnumType.STRING)
    private StatusPedido status;
    @Embedded
    private EnderecoEntregaPedido enderecoEntregaPedido;
    @OneToMany(mappedBy = "pedido") // nao aparece na tabela de pedido
    private List<ItemPedido> itemPedidoList = new ArrayList<>();
    @OneToOne(mappedBy = "pedido")
    private PagamentoCartao pagamentoCartao;
    @OneToOne(mappedBy = "pedido")
    private  PagamentoBoleto pagamentoBoleto;
    @OneToOne(mappedBy = "pedido")
    private  NotaFiscal notaFiscal;
}

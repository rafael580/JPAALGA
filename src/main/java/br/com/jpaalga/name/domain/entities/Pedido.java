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


    @ManyToOne (optional = false)
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @Column(name = "data_criacao")
    private LocalDateTime dataCriacao;
    @Column(name = "data_ultima_atualizacao")
    private LocalDateTime dataUltimaAtualizacao;

    @Column(name = "data_pedido")
    private LocalDateTime dataPedido;
    @Column(name = "data_conclusao")
    private LocalDateTime dataConclusao;

    private BigDecimal total;
    @Enumerated(EnumType.STRING)
    private StatusPedido status;
    @Embedded
    private EnderecoEntregaPedido enderecoEntregaPedido;
    @OneToMany(mappedBy = "pedido", fetch = FetchType.EAGER) // nao aparece na tabela de pedido
    private List<ItemPedido> itemPedidoList = new ArrayList<>();
    @OneToOne(mappedBy = "pedido")
    private PagamentoCartao pagamentoCartao;
    @OneToOne(mappedBy = "pedido")
    private PagamentoBoleto pagamentoBoleto;
    @OneToOne(mappedBy = "pedido")
    private NotaFiscal notaFiscal;


    public boolean isPago() {
        return StatusPedido.PAGO.equals(status);
    }

  //  @PrePersist
  //  @PreUpdate
    public void calcularTotal() {
        if (itemPedidoList != null) {
            total = itemPedidoList.stream().map(ItemPedido::getPrecoProduto)
                    .reduce(BigDecimal.ZERO, BigDecimal::add);
        }
    }

    @PrePersist
    public void aoPersistir() {
        dataCriacao = LocalDateTime.now();
        calcularTotal();
    }

    @PreUpdate
    public void aoAtualizar() {
        dataUltimaAtualizacao = LocalDateTime.now();
        calcularTotal();
    }

    @PostPersist
    public void aposPersistir() {
        System.out.println("Após persistir Pedido.");
    }

    @PostUpdate
    public void aposAtualizar() {
        System.out.println("Após atualizar Pedido.");
    }

    @PreRemove
    public void aoRemover() {
        System.out.println("Antes de remover Pedido.");
    }

    @PostRemove
    public void aposRemover() {
        System.out.println("Após remover Pedido.");
    }

    @PostLoad
    public void aoCarregar() {
        System.out.println("Após carregar o Pedido.");
    }


}

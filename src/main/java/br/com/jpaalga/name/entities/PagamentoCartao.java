package br.com.jpaalga.name.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "pagamento_cartao")
public class PagamentoCartao {



    @EqualsAndHashCode.Include
    @Id
    private Integer id;
    @Column(name = "pedido_ida")
    private Integer pedidoId;
    private StatusPagamento status;
    private String numero;

}

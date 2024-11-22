package br.com.jpaalga.name.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ItemPedido {


    @EqualsAndHashCode.Include
    @Id
    private Integer id;
    private Integer pedidoId;
    private Integer produtoId;
    private BigDecimal precoProduto;
    private Integer quantidade;



}

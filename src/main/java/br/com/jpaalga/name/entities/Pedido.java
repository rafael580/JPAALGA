package br.com.jpaalga.name.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Pedido {

    @EqualsAndHashCode.Include
    @Id
    private Integer id;
    private LocalDateTime dataPedido;
    private LocalDateTime dataConclusao;
    private Integer notaFiscal;
    private BigDecimal total;
    private StatusPedido status;

}

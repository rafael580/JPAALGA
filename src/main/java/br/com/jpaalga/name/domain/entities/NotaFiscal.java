package br.com.jpaalga.name.domain.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "nota_fiscal")
public class NotaFiscal {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    @JoinColumn(name = "pedido_id")
 //   @JoinTable( name = "nota_fiscal_pedido",
 //           joinColumns = @JoinColumn (name = "nota_fiscal",unique = true),
 //           inverseJoinColumns = @JoinColumn(name = "pedido_id",unique = true))
    private Pedido pedido;
    private String xml;
    @Column(name = "data_emissao")
    private Date dataEmissao;

}

package br.com.jpaalga.name.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class NotaFiscal {

    @EqualsAndHashCode.Include
    @Id
    private Integer id;
    private Integer pedidoId;
    private String xml;
    private Date dataEmissao;

}

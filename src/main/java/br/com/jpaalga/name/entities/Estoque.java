package br.com.jpaalga.name.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Estoque {

    @EqualsAndHashCode.Include
    @Id
    private Integer id;
    private Integer produtoId;
    private Integer quantidade;

}

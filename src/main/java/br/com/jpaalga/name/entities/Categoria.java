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
public class Categoria {

    @EqualsAndHashCode.Include
    @Id
    private Integer id;
    private String nome;
    private Integer categoriaPaiId;

}

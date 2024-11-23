package br.com.jpaalga.name.domain.entities;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "produto")
public class Produto {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String descricao;
    private BigDecimal preco;

    @ManyToMany
    @JoinTable(name = "produto_categoria",
            joinColumns = @JoinColumn(name = "produto_id"),
            inverseJoinColumns = @JoinColumn  (name= "categoria_id"))
    private List<Categoria> categorias = new ArrayList<>();

    @OneToMany(mappedBy = "produto")
    private List<ItemPedido> itemPedidoList = new ArrayList<>();

    @OneToOne(mappedBy = "produto")
    private Estoque estoque;

}

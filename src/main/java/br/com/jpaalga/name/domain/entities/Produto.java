package br.com.jpaalga.name.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Objects;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "produto")
public class Produto {

    @EqualsAndHashCode.Include
    @Id
    private Integer id;
    private String nome;
    private String descricao;
    private BigDecimal preco;


    public Produto() {
    }

    public Produto(BigDecimal preco, String descricao, String nome, Integer id) {
        this.preco = preco;
        this.descricao = descricao;
        this.nome = nome;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

package br.com.jpaalga.name.domain.entities;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "cliente")
public class Cliente {

    @EqualsAndHashCode.Include
    @Id
    private Integer id;
    private String nome;
    @Enumerated(EnumType.STRING)
    private SexoCliente sexoCliente;


    public Cliente() {
    }

    public Cliente(Integer id, SexoCliente sexoCliente, String nome) {
        this.id = id;
        this.sexoCliente = sexoCliente;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public SexoCliente getSexoCliente() {
        return sexoCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexoCliente(SexoCliente sexoCliente) {
        this.sexoCliente = sexoCliente;
    }
}

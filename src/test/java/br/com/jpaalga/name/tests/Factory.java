package br.com.jpaalga.name.tests;

import br.com.jpaalga.name.domain.entities.Cliente;
import br.com.jpaalga.name.domain.entities.SexoCliente;

public class Factory {


    public static Cliente createCliente(){
        Cliente cliente = new Cliente();

        cliente.setId(5);
        cliente.setNome("jose mineiro");
        cliente.setSexoCliente(SexoCliente.MASCULINO);


        return cliente;
    }



}

package br.com.jpaalga.name.service;

import br.com.jpaalga.name.domain.entities.Pedido;

public class NotaFiscalService {

    public void gerar(Pedido pedido) {
        System.out.println("Gerando nota para o pedido " + pedido.getId() + ".");
    }

}

package br.com.jpaalga.name.listener;

import br.com.jpaalga.name.domain.entities.Pedido;
import br.com.jpaalga.name.service.NotaFiscalService;
import jakarta.persistence.PostLoad;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

public class GerarNotaFiscalListener {

   private NotaFiscalService notaFiscalService = new NotaFiscalService();

    @PrePersist
    @PreUpdate
    public void gerar(Pedido pedido) {
        if (pedido.isPago() && pedido.getNotaFiscal() == null) {
            notaFiscalService.gerar(pedido);
        }
    }

}

package br.com.jpaalga.name.mapemanetoBasico;

import br.com.jpaalga.name.domain.entities.Cliente;
import br.com.jpaalga.name.domain.entities.SexoCliente;
import br.com.jpaalga.name.domain.repositories.ClienteRepository;
import br.com.jpaalga.name.tests.Factory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class enumsTests {


    @Autowired
    private ClienteRepository clienteRepository;


    @Test
    public void testarEnum(){
        Cliente cliente = Factory.createCliente();
        cliente = clienteRepository.save(cliente);
        Assertions.assertEquals(SexoCliente.MASCULINO,cliente.getSexoCliente());
    }
}

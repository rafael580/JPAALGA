package br.com.jpaalga.name.mapemanetoBasico;

import br.com.jpaalga.name.domain.entities.Categoria;
import br.com.jpaalga.name.domain.repositories.CategoriaRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EstrategiaChavePrimaria {

    @Autowired
    CategoriaRepository categoriaRepository;


    @Test
    public void  testeChavePrimaria(){

        Categoria categoria = new Categoria();
        categoria.setNome("eletronicos");
        categoriaRepository.save(categoria);

    }


}

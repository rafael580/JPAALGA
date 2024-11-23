package br.com.jpaalga.name.cachePrimeiroNivel;

import br.com.jpaalga.name.domain.entities.Produto;
import br.com.jpaalga.name.domain.repositories.ProdutoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class CacheTests {

    @Autowired
    ProdutoRepository produtoRepository;

    @Test
    public void verificarCache() {

        Optional<Produto> produto = produtoRepository.findById(1);
        Produto produto1 = produto.orElse(null);

        System.out.println(produto1.getNome());

        System.out.println("___________________________________");

        Optional<Produto> Oproduto = produtoRepository.findById(produto1.getId());
        Produto produto2 = Oproduto.orElse(null);

        System.out.println(produto2.getNome());

    }


}

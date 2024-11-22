package br.com.jpaalga.name.controller;

import br.com.jpaalga.name.domain.entities.Cliente;
import br.com.jpaalga.name.domain.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public ResponseEntity<List<Cliente>> findAll(){
        return ResponseEntity.ok().body(clienteRepository.findAll());
    }


}

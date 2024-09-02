package br.com.alura.comex.service;

import br.com.alura.comex.exception.ClienteNotFoundException;
import br.com.alura.comex.model.Cliente;
import br.com.alura.comex.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository repository;

    public void cadastro(Cliente novoCliente) {
        if (novoCliente == null) return;

        repository.save(novoCliente);
    }

    public Cliente buscaById(Long id){
        return repository.findById(id).orElseThrow(
                /* Poderia ter criado um exception 'generico' e passar o error */
                () -> new ClienteNotFoundException("Cliente não Encontrado: " + id)
        );
    }

    public void deleta(Cliente cliente) {
        repository.delete(cliente);
    }

    public List<Cliente> listaTodos() {
        return repository.findAll();
    }

}
package br.com.alura.comex.service;

import br.com.alura.comex.exception.ProdutoNotFoundException;
import br.com.alura.comex.model.Produto;
import br.com.alura.comex.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProdutoService {
    @Autowired
    ProdutoRepository repository;

    public void cadastro(Produto novoProduto) {


        repository.save(novoProduto);

    }

    public Produto buscarById(Long produtoId) {
        return repository.findById(produtoId).orElseThrow(
                () -> new ProdutoNotFoundException("Produto não encontrado para o ID: " + produtoId)
        );
    }

    public List<Produto> buscarAll() {
        return repository.findAll();
    }
}

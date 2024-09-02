package br.com.alura.comex.service;

import br.com.alura.comex.exception.ProdutoNotFoundException;
import br.com.alura.comex.model.Produto;
import br.com.alura.comex.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
    @Autowired
    ProdutoRepository repository ;

    public void cadastro(Produto novoProduto){
        if (novoProduto == null) return;
        if (novoProduto.getNome().isEmpty() || novoProduto.getPreco() < 0.0 || novoProduto.getQuantidade() < 0) return;
        if (novoProduto.getCategoria() == null) return;

        repository.save(novoProduto);

    }

    public Produto buscarById(Long produtoId){
        return repository.findById(produtoId).orElseThrow(
                ()  -> new ProdutoNotFoundException("Produto não encontrado para o ID: " + produtoId)
        ) ;
    }

    public Iterable<Produto> buscarAll() {
        return repository.findAll();
    }
}

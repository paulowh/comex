package br.com.alura.comex.service;

import br.com.alura.comex.exception.CategoriaNotFoundException;
import br.com.alura.comex.model.Categoria;
import br.com.alura.comex.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {
    @Autowired
    CategoriaRepository repository;

    public void cadastro(Categoria novaCategoria) {
        if (novaCategoria == null) return;
        if (novaCategoria.getNome().isEmpty()) return;

        repository.save(novaCategoria);
    }

    public Optional<Categoria> buscaPorId(Long categoriaId) {
        return repository.findById(categoriaId);
    }

    public Categoria buscaById(Long categoriaId) {
        return repository.findById(categoriaId).orElseThrow( () ->
                new CategoriaNotFoundException("Categoria não encontrada para o ID:" + categoriaId)
        );
    }
}

package br.com.alura.comex.controller;

import br.com.alura.comex.model.Categoria;
import br.com.alura.comex.model.DadosNovoProduto;
import br.com.alura.comex.model.Produto;
import br.com.alura.comex.service.CategoriaService;
import br.com.alura.comex.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;
    @Autowired
    private CategoriaService categoriaService;

    @PostMapping("api/produto")
    public ResponseEntity cadastra(@RequestBody DadosNovoProduto form, BindingResult result) {

        if (result.hasFieldErrors()) return ResponseEntity.badRequest().build();

        Categoria categoria = categoriaService.buscaById(form.idCategoria());

        produtoService.cadastro(form.toEntity(categoria));

        return ResponseEntity.ok().build();
    }

    @GetMapping("/api/produto/{id}")
    public ResponseEntity<Object> buscarById(@PathVariable("id") Long id){
        if (id == null) return ResponseEntity.badRequest().build();

        Produto produto = produtoService.buscarById(id);

        if (produto != null) return ResponseEntity.ok().body(produto);

        return ResponseEntity.notFound().build();
    }

    @RequestMapping("/api/produtos")
    public ResponseEntity<Object> listarTodos(){

        Iterable<Produto> produtos = produtoService.buscarAll();

        if (produtos != null) return ResponseEntity.ok().body(produtos);

        return ResponseEntity.notFound().build();
    }

}

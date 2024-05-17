package br.com.alura.comex.controller;

import br.com.alura.comex.model.Categoria;
import br.com.alura.comex.model.Cliente;
import br.com.alura.comex.model.DadosNovoCliente;
import br.com.alura.comex.model.Produto;
import br.com.alura.comex.service.ClienteService;
import br.com.alura.comex.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping()
    public ResponseEntity cadastra(@RequestBody DadosNovoCliente form, BindingResult result) {

        if (result.hasFieldErrors()) return ResponseEntity.badRequest().build();

        if (form.nome().isEmpty() || form.cpf().isEmpty() || form.email().isEmpty())
            return ResponseEntity.badRequest().build();

        clienteService.cadastro(form.toEntity());

        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> buscarPorId(@PathVariable("id") Long clienteId) {
        if (clienteId == null) return ResponseEntity.badRequest().build();

        Cliente clienteCarregado = clienteService.buscaById(clienteId);

        if (clienteCarregado != null) return ResponseEntity.ok().body(clienteCarregado);

        return ResponseEntity.notFound().build();
    }

    @RequestMapping("/all")
    public ResponseEntity<Object> listarTodos(){

        Iterable<Cliente> cliente = clienteService.listaTodos();

        if (cliente != null) return ResponseEntity.ok().body(cliente);

        return ResponseEntity.notFound().build();
    }
}


package br.com.alura.comex.model;

import jakarta.validation.constraints.Min;
import org.hibernate.validator.constraints.Length;

import java.math.BigDecimal;
import java.util.Optional;

public record DadosNovoProduto(@Length(min = 5) String nomeProduto, BigDecimal preco, @Length(min = 1) int quantidade,
                               Long idCategoria) {

    public Produto toEntity(Categoria categoria) {
        return new Produto(nomeProduto, preco, quantidade, categoria);
    }

}

package br.com.alura.comex.model;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import java.math.BigDecimal;
import java.util.Optional;

public record DadosNovoProduto(@Length(min = 2) String nomeProduto,
                               @Min(value = 1, message = "O numero deve ser maior que 0") BigDecimal preco,
                               @Length(min = 1) int quantidade,
                               @NotNull Long idCategoria,
                               String descricao
                               ) {

    public Produto toEntity(Categoria categoria) {
        return new Produto(nomeProduto, preco, quantidade, categoria, descricao);
    }

}

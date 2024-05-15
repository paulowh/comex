package br.com.alura.comex.model;

public enum TipoDescontoProdutoEnum {

    QUANTIDADE,
    PROMOCAO,
    NENHUM;

    private String desconto;

    TipoDescontoProdutoEnum() {

    }

    public String getDesconto() {
            return desconto;
        }
}

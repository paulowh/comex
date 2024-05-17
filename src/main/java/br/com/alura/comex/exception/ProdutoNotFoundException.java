package br.com.alura.comex.exception;

public class ProdutoNotFoundException extends RuntimeException {
    public ProdutoNotFoundException(String error) {
        super(error);
    }
}

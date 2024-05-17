package br.com.alura.comex.exception;

public class CategoriaNotFoundException extends RuntimeException {
    public CategoriaNotFoundException(String error) {
        //Chama a classe pai!!!
        super(error);
    }
}

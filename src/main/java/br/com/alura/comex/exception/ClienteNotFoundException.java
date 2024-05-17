package br.com.alura.comex.exception;

public class ClienteNotFoundException extends RuntimeException {
    public ClienteNotFoundException(String error) {
        super(error);
    }
}

package br.com.alura.comex.model;

import org.hibernate.validator.constraints.Length;

public record DadosNovoCliente(@Length(min = 5) String nome, @Length(min = 11) String cpf,
                               @Length(min = 10) String email) {
    public Cliente toEntity(){
        return new Cliente(nome, cpf, email);
    }
}

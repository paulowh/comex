package br.com.alura.comex.model;

import oracle.sql.BOOLEAN;

public enum StatusCategoriaEnum {
    ATIVO(Boolean.TRUE),
    INATIVO(Boolean.FALSE);

    private Boolean status;

    StatusCategoriaEnum(Boolean status) {
        this.status = status;
    }

    public Boolean getStatus() {
        return status;
    }
}

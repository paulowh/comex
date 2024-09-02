package br.com.alura.comex.model;

public enum DescontoPedidoEnum {

    FIDELIDADE(Boolean.TRUE),
    NENHUM(Boolean.FALSE);

    private Boolean desconto;

    DescontoPedidoEnum(Boolean desconto) {
        this.desconto = desconto;
    }

    public Boolean getDesconto() {
        return desconto;
    }

}

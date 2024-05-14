package br.com.alura.comex;

public class Pedido {
    private int id;
    private Cliente cliente;
    private double preco;
    private int quantidade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean isMaisBaratoQue(Pedido outroPedido) {
        return this.preco < outroPedido.preco;
    }

    public boolean isMaisCaroQue(Pedido outroPedido) {
        return this.preco > outroPedido.preco;
    }

    public Double getValorTotal() {
        return this.preco * this.quantidade;
    }

    public Pedido(int id, Cliente cliente, double preco, int quantidade) {
        this.id = id;
        this.cliente = cliente;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", cliente=" + cliente +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                ", valorTotal=" + this.getValorTotal() +
                '}';
    }
}

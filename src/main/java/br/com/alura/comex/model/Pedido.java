package br.com.alura.comex.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_pedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido", nullable = false)
    private long id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_cliente", nullable = false )
    private Cliente cliente;
    @Column(name = "preco", nullable = false)
    private double preco;
    @Column(name = "quantidade", nullable = false)
    private int quantidade;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id")
    private ItemPedido item;

    @Column(name = "desconto", nullable = false)
    @Enumerated(EnumType.STRING)
    private DescontoPedidoEnum desconto;

    public Pedido() {
    }

    public Pedido(Cliente cliente, double preco, int quantidade) {
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

    public long getId() {
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

}

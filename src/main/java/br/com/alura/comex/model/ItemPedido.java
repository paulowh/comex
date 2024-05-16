package br.com.alura.comex.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "tb_itemPedido")
public class ItemPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_itemPedido")
    private long id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_pedido", nullable = false )
    private Pedido pedido;
    @Column(name = "preco_unitario", nullable = false)
    private BigDecimal precoUnitario;
    @Column(name = "quantidade", nullable = false)
    private int quantidade;
    @Column(name = "desconto", nullable = false)
    private BigDecimal desconto;
    @Column(name = "tipo_desconto", nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoDescontoProdutoEnum tipoDesconto = TipoDescontoProdutoEnum.NENHUM;

    public ItemPedido() {
    }

    public BigDecimal getTotal() {
        return precoUnitario.multiply(new BigDecimal(quantidade));
    }

    @Override
    public String toString() {
        return "ItemPedido{" +
                "id=" + id +
                ", pedido=" + pedido +
                ", precoUnitario=" + precoUnitario +
                ", quantidade=" + quantidade +
                ", desconto=" + desconto +
                ", tipoDesconto=" + tipoDesconto +
                '}';
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public BigDecimal getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(BigDecimal precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }

    public TipoDescontoProdutoEnum getTipoDesconto() {
        return tipoDesconto;
    }

    public void setTipoDesconto(TipoDescontoProdutoEnum tipoDesconto) {
        this.tipoDesconto = tipoDesconto;
    }



}

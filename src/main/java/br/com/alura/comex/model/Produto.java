package br.com.alura.comex.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_produto")
    private long id;
    @Column(name = "nome", length = 100, nullable = false)
    private String nome;
    @Column(name = "descricao", length = 200, nullable = true)
    private String descricao;
    @Column(name = "preco", nullable = false)
    private double preco;
    @Column(name = "quantidade", nullable = false)
    private int quantidade;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_categoria", nullable = false )
    private Categoria categoria;

    public Produto() {
    }

    public Produto(String nome, double preco, int quantidade, Categoria categoria) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preço=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

}

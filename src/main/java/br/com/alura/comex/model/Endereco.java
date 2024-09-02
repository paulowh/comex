package br.com.alura.comex.model;

import jakarta.persistence.*;

@Embeddable
public class Endereco {
    @Column(length = 50)
    private String bairro;
    @Column(length = 50)
    private String cidade;
    @Column(length = 50)
    private String complemento;
    @Column(length = 50)
    private String estado;
    @Column(length = 50)
    private String rua;
    @Column(length = 50)
    private int numero;

    public Endereco(String bairro, String cidade, String complemento, String estado, String rua, int numero) {
        this.bairro = bairro;
        this.cidade = cidade;
        this.complemento = complemento;
        this.estado = estado;
        this.rua = rua;
        this.numero = numero;
    }

    /* @hibernate only */
    public Endereco() {

    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    @Override
    public String toString() {
        return "Endereco{" +
                "bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", complemento='" + complemento + '\'' +
                ", estado='" + estado + '\'' +
                ", rua='" + rua + '\'' +
                ", numero=" + numero +
                '}';
    }
}

package br.com.alura.comex.teste;

import br.com.alura.comex.model.Produto;

public class ProdutoTeste {
    public static void main(String[] args) {
        System.out.println("==PRODUTO==");

        Produto produto01 = new Produto("Monitor", "Monitor LG 29 Polegadas", 900.00, 1);
        Produto produto02 = new Produto("Monitor", "Monitor BENQ 24 Polegadas", 450.00, 1);


        //metodo equals compara dois objetos
        String resultado =  produto01.equals(produto02) ? "Produtos Identicos" : "Produtos Diferentes";
        System.out.println(resultado);

    }
}

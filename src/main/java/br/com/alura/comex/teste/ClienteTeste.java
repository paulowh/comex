package br.com.alura.comex.teste;

import br.com.alura.comex.model.Cliente;
import br.com.alura.comex.model.Endereco;

import java.util.List;

public class ClienteTeste {
    public static void main(String[] args) {

        Endereco casa = new Endereco(
                "Vila São Pedro",
                "Americana",
                "",
                "SP",
                "Angelo Sanches",
                800

        );

        Cliente paulin = new Cliente(
                "Paulin",
                "11111111100",
                "19992632392",
                "paulin@hotmail.com",
                casa,
                "docente TI"
        );

        System.out.println(paulin);


    }
}

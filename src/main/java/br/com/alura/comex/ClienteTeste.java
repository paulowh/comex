package br.com.alura.comex;

public class ClienteTeste {
    public static void main(String[] args) {

        Endereco endereco = new Endereco(
                "Vila São Pedro",
                "Americana",
                "",
                "SP",
                "Angelo Sanches",
                800

        );

        Cliente cliente = new Cliente(
                "Paulin",
                "111.111.111-00",
                "19992632392",
                "paulin@hotmail.com",
                endereco,
                "docente TI"
        );

        System.out.println(cliente);
    }
}

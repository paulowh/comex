package br.com.alura.comex.teste;

import br.com.alura.comex.model.Cliente;
import br.com.alura.comex.model.Endereco;
import br.com.alura.comex.model.Pedido;

public class PedidoTeste {
    public static void main(String[] args){
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

        Pedido pedido = new Pedido(
                cliente,
                1999.00,
                12
        );

        System.out.println(pedido);

        double total = pedido.getValorTotal();
        System.out.println(total);
    }
}

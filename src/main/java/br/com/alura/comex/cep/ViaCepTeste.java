package br.com.alura.comex.cep;

public class ViaCepTeste {
    public static void main(String[] args) {

        String cep = "13466-490";

        ViaCepResponse retorno = new ViaCepService().buscaCep(cep);

        System.out.println(retorno);

    }
}

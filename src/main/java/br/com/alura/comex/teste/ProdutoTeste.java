package br.com.alura.comex.teste;

import br.com.alura.comex.dao.CategoriaDao;
import br.com.alura.comex.dao.ProdutoDao;
import br.com.alura.comex.model.Categoria;
import br.com.alura.comex.model.Produto;

import java.util.Arrays;
import java.util.List;

public class ProdutoTeste {
    public static void main(String[] args) {
        System.out.println("==PRODUTO==");

        CategoriaDao categoriaDao = new CategoriaDao();
        Categoria categoria = categoriaDao.buscarId(2L);
        Produto produto01 = new Produto("Monitor", "Monitor LG 29 Polegadas", 900.00, 1, categoria);
        Produto produto02 = new Produto("Monitor", "Monitor BENQ 24 Polegadas", 450.00, 1, categoria);
        Produto produto03 = new Produto("Teclado", "CK62", 450.00, 3, categoria);


        //metodo equals compara dois objetos
        String resultado = produto01.equals(produto03) ? "Produtos Identicos" : "Produtos Diferentes";
        System.out.println(resultado);

        ProdutoDao produtoDao = new ProdutoDao();
        //ProdutoDao.cadastrar(produto03);
        List<Object[]> relatorio = produtoDao.listarRelatorioQntdProdutos();
        System.out.println(Arrays.toString(relatorio.toArray()));
    }
}

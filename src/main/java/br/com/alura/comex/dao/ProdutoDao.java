package br.com.alura.comex.dao;

import br.com.alura.comex.model.Categoria;
import br.com.alura.comex.model.Produto;
import br.com.alura.comex.util.JPAUltil;

import javax.persistence.EntityManager;
import java.util.List;

public class ProdutoDao {
    public static void cadastrar(Produto produto) {
        EntityManager manager = new JPAUltil().getEntityManager();
        manager.getTransaction().begin();
        manager.persist(produto);
        manager.getTransaction().commit();
    }

    public static Produto buscarId(Long id) {
        EntityManager manager = new JPAUltil().getEntityManager();
        Produto produto = manager.find(Produto.class, id);
        return produto;
    }

    public static List<Produto> listarTodos() {
        EntityManager manager = new JPAUltil().getEntityManager();
        List<Produto> produtos = manager.createQuery("from Produto ").getResultList();
        return produtos;
    }

    public static List<Produto> listarIndisponiveis() {
        EntityManager manager = new JPAUltil().getEntityManager();
        List<Produto> produtos = manager.createQuery("from Produto WHERE quantidade < 1").getResultList();
        return produtos;
    }


    public static List<Object[]> listarRelatorioQntdProdutos() {
        EntityManager manager = new JPAUltil().getEntityManager();
        String query = "select c.nome, COUNT(tp.quantidade) from Produto tp join Categoria c on c.id = tp.id group by c.nome";

        /* Utilizando object por ter criado query na 'unha'*/
        List<Object[]> produtos = manager.createQuery(query, Object[].class).getResultList();
        return produtos;
    }
}

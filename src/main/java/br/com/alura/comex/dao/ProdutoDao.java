package br.com.alura.comex.dao;

import br.com.alura.comex.model.Produto;
import br.com.alura.comex.util.JPAUltil;

import javax.persistence.EntityManager;
import java.util.List;

public class ProdutoDao {
    public void cadastrar(Produto produto) {
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
}

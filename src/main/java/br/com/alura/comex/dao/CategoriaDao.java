package br.com.alura.comex.dao;

import br.com.alura.comex.model.Categoria;
import br.com.alura.comex.util.JPAUltil;

import javax.persistence.EntityManager;
import java.util.List;

public class CategoriaDao {
    public void cadastrar(Categoria categoria) {
        EntityManager manager = new JPAUltil().getEntityManager();
        manager.getTransaction().begin();
        manager.persist(categoria);
        manager.getTransaction().commit();
    }

    public static Categoria buscarId(Long id) {
        EntityManager manager = new JPAUltil().getEntityManager();
        Categoria categoria = manager.find(Categoria.class, id);
        return categoria;
    }

    public static List<Categoria> listarTodos() {
        EntityManager manager = new JPAUltil().getEntityManager();
        List<Categoria> categorias = manager.createQuery("from Categoria ").getResultList();
        return categorias;
    }
}

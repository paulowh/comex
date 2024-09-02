package br.com.alura.comex.dao;


import br.com.alura.comex.model.Pedido;
import br.com.alura.comex.util.JPAUltil;

//import javax.persistence.EntityManager;
import jakarta.persistence.*;
import java.util.List;

public class PedidoDao {
    public void cadastrar(Pedido pedido) {
        EntityManager manager = new JPAUltil().getEntityManager();
        manager.getTransaction().begin();
        manager.persist(pedido);
        manager.getTransaction().commit();
    }

    public static Pedido buscarId(Long id) {
        EntityManager manager = new JPAUltil().getEntityManager();
        return manager.find(Pedido.class, id);
    }

    public static List<Pedido> listarTodos() {
        EntityManager manager = new JPAUltil().getEntityManager();
        return (List<Pedido>) manager.createQuery("from Pedido ").getResultList();
    }
}

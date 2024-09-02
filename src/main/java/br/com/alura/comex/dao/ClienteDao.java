package br.com.alura.comex.dao;

import br.com.alura.comex.model.Cliente;
import br.com.alura.comex.util.JPAUltil;

import jakarta.persistence.*;
import java.util.List;

public class ClienteDao {
    public void salvar(Cliente cliente) {
        EntityManager manager = new JPAUltil().getEntityManager();
        manager.getTransaction().begin();
        manager.persist(cliente);
        manager.getTransaction().commit();
    }

    public void excluir(Cliente cliente) {
        EntityManager manager = new JPAUltil().getEntityManager();
        manager.getTransaction().begin();
        manager.remove(cliente);
        manager.getTransaction().commit();
    }

    public void alterar(Cliente cliente) {
        EntityManager manager = new JPAUltil().getEntityManager();
        manager.getTransaction().begin();
        manager.merge(cliente);
        manager.getTransaction().commit();
    }

    public static Cliente buscarId(Long id) {
        EntityManager manager = new JPAUltil().getEntityManager();
        Cliente cliente = manager.find(Cliente.class, id);
        return cliente;
    }

    public static List<Cliente> listarTodos() {
        EntityManager manager = new JPAUltil().getEntityManager();
        List<Cliente> clientes = manager.createQuery("from Cliente").getResultList();
        return clientes;
    }
}

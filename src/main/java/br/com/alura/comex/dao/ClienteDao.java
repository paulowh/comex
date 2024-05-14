package br.com.alura.comex.dao;

import br.com.alura.comex.Cliente;
import br.com.alura.comex.util.JPAUltil;

import javax.persistence.EntityManager;

public class ClienteDao {
    public void salvar(Cliente paulin) {
        //implementar
        EntityManager manager = new JPAUltil().getEntityManager();
        manager.getTransaction().begin();
        manager.persist(paulin);
        manager.getTransaction().commit();
    }
}

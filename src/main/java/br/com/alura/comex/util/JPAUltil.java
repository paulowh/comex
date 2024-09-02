package br.com.alura.comex.util;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class JPAUltil {
    public EntityManager getEntityManager() {
        return Persistence.createEntityManagerFactory("mysql")
                .createEntityManager();
    }
}

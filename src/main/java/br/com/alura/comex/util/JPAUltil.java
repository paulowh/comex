package br.com.alura.comex.util;

//import javax.persistence.EntityManager;
//import javax.persistence.Persistence;
import jakarta.persistence.*;

public class JPAUltil {
    public EntityManager getEntityManager() {
        return Persistence.createEntityManagerFactory("mysql")
                .createEntityManager();
    }
}

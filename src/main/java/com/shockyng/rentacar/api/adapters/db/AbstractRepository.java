package com.shockyng.rentacar.api.adapters.db;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public abstract class AbstractRepository<E, ID> {

    private final String persistenceUniName = "rentacarPU";
    private final EntityManager manager;
    private final EntityManagerFactory factory;
    private Class<E> clazz;
    private Class<ID> id;

    public abstract String getClassName();

    public AbstractRepository() {
        this.factory = Persistence.createEntityManagerFactory(persistenceUniName);
        this.manager = factory.createEntityManager();
    }

    public E save(E e) {
        manager.getTransaction().begin();
        manager.persist(e);
        manager.getTransaction().commit();
        return e;
    }


}

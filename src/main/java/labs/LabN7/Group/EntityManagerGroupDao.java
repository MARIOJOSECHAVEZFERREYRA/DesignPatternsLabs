package org.example.LabsTP.LabN7.Group;

import org.hibernate.SessionFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

public class EntityManagerGroupDao implements GroupDao {
    private final SessionFactory sessionFactory;

    public EntityManagerGroupDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Group findById(Long id) {
        EntityManager entityManager = sessionFactory.createEntityManager();
        return entityManager.find(Group.class, id);
    }

    @Override
    public void save(Group entity) {
        EntityManager entityManager = sessionFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        if (!transaction.isActive()) {
            transaction.begin();
        }

        entityManager.persist(entity);
        transaction.commit();
    }

    @Override
    public void update(Group entity) {
        EntityManager entityManager = sessionFactory.createEntityManager();
        entityManager.persist(entity);
    }

    @Override
    public void delete(Group entity) {
        EntityManager entityManager = sessionFactory.createEntityManager();
        entityManager.remove(entity);
    }

    @Override
    public List<Group> findAll() {
        EntityManager entityManager = sessionFactory.createEntityManager();
        return entityManager.createQuery("select gr from Group gr", Group.class)
                .getResultList();
    }
}

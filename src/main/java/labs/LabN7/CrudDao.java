package org.example.LabsTP.LabN7;

import java.util.List;

public interface CrudDao<I, E> {
    E findById(I id);

    void save(E entity);

    void update(E entity);

    void delete(E entity);

    List<E> findAll();
}
